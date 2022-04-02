package org.example.Lesson1;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        int k = -5;
        int m = (int) (Math.random()*10);
        System.out.println(m);
        checkSumSign(k,m);
        printColor(m);
        compareNumbers(k,m);
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        int c = (a + b);
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(int value) {
        if (value<=0) {
            System.out.println("Красный");
        } else if (value>0 && value<=100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a>=b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

}
