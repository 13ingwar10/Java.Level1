package org;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class example {
    private static final char DOT_X = 'X';
    private static final char DOT_Y = '0';
    private static final char DOT_EMPTY = '.';

    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    private static char[][] field;
    private static char dotPlayer;
    private static char dotAI;

    private static int fieldSizeX;
    private static int fieldSizeY;
    private static int scorePlayer;
    private static int scoreAI;
    private static int roundCounter;
    private static int winCounterRow;
    private static int winCounterCol;
    private static int winCounterDiagDir;
    private static int winCounterDiagRev;
    private static int winLength;

    public static void main(String[] args) {
    startNewGame();
    }

    private static void startNewGame() {
        while (true) {
            chooseDot();
            playRound();
            System.out.printf("ОЧКИ:    ИГРОК    AI\n" +
                    "           %d      %d\n", scorePlayer,scoreAI);

            System.out.print("Играть заново? (Y or N) >>>>");
            if (!scanner.next().toLowerCase(Locale.ROOT).equals("y")) {
                System.out.println ("Пока!");
                break;
            }
        }

    }

    private static void chooseDot() {
        System.out.print("Напиши + чтобы играть X, любой другой символ чтобы играть 0 >>>> ");
        if (scanner.next().toLowerCase(Locale.ROOT).equals("+")) {
            dotPlayer = DOT_X;
            dotAI = DOT_Y;
        } else {
            dotPlayer = DOT_Y;
            dotAI = DOT_X;
        }
    }

    private static void playRound() {
        System.out.printf("Раунд %d начался!\n", ++roundCounter);
        initField(5,5);
        printField();
        if (dotPlayer == DOT_X) {
            humanFirst();
        } else {
            aiFirst();
        }
    }

    private static void humanFirst() {
        while (true) {
            yourMove();
            printField();
            if (gameCheck(dotPlayer)) {
                break;
            }
            aiMove();
            printField();
        }
    }

    private static void aiFirst() {
        while (true) {
            aiMove();
            printField();
            if (gameCheck(dotAI)) {
                break;
            }
            yourMove();
            printField();
        }
    }

    public static void initField(int sizeX, int sizeY) {
        fieldSizeX = sizeX;
        fieldSizeY = sizeY;
        field = new char[fieldSizeY][fieldSizeX];

        for (int y=0; y<fieldSizeY;y++) {
            for (int x = 0; x<fieldSizeX;x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    private static void printField() {
        System.out.print("+");

        for (int i=0; i<fieldSizeX*2+1; i++) {
            System.out.print(i%2==0 ? "-" : i/2+1);
        }
        System.out.println();

        for (int i=0; i<fieldSizeY; i++) {
            System.out.print(i+1+"|");
            for (int j=0; j<fieldSizeX;j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }

        for (int i=0; i<fieldSizeX*2+2; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    private static void yourMove() {
        int x;
        int y;

        do {
            System.out.print("Введите через пробел две координаты: X (от 1 до " + fieldSizeX + ") и Y (от 1 до " + fieldSizeY + ") >>> ");
            x = scanner.nextInt()-1;
            y = scanner.nextInt()-1;
        } while (!isCellValid(y,x));

        field[y][x] = dotPlayer;
    }

    private static void aiMove() {
        int x;
        int y;

        do {
            x = random.nextInt(fieldSizeX);
            y = random.nextInt(fieldSizeY);
        } while (!isCellValid(y,x));
        field[y][x] = dotAI;
    }

    private static boolean isCellValid (int y, int x) {
        return x>=0 && y>=0 && x<=fieldSizeX && y<=fieldSizeY && field[y][x] == DOT_EMPTY;
    }

    private static boolean checkDraw() {
        for (int y=0; y<fieldSizeY;y++) {
            for (int x=0; x<fieldSizeX; x++) {
                if (field[y][x]==DOT_EMPTY){
                    return false;
                }
            }
        }
        System.out.println("Ничья!");
        return true;
    }

    private static boolean checkWin(char dot) {

        winCounterRow = 0;
        winCounterCol = 0;
        winCounterDiagDir = 0;
        winCounterDiagRev =0;

        for (int i=0; i<fieldSizeY;i++) {
            for (int j=0; j<fieldSizeX;j++) {
                if (field[i][j]==dot) {
                    winCounterRow++;
                    if (winCounterRow==4) return true;
                } else winCounterRow=0;
                if (field[j][i]==dot) {
                    winCounterCol++;
                    if (winCounterCol==4) return true;
                } else winCounterCol=0;
                if (i==j) {
                    if (field[i][j]==dot) {
                        winCounterDiagDir++;
                        if (winCounterDiagDir==4) return true;
                    } else winCounterDiagDir=0;
                }
                if ((i+j)==4) {
                    if (field[i][j]==dot) {
                        winCounterDiagRev++;
                        if (winCounterDiagRev==4) return true;
                    } else winCounterDiagRev=0;
                }
            }
        }
        return false;
    }

    private static boolean gameCheck(char dot) {
        if (checkWin(dot) && dot == dotPlayer) {
            System.out.println("Вы победили!");
            scorePlayer++;
            return true;
        } else if (checkWin(dot) && dot == dotAI) {
            System.out.println("Победа AI :(");
            scoreAI++;
            return true;
        }
        return checkDraw();
    }
}
