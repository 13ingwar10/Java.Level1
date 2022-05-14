import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    private static final int WINDOW_WIDTH = 640;
    private static final int WINDOW_HEIGHT = 480;
    public GameMap gameMap;


    public GameWindow() {
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("TicTacToe");
        setResizable(false);
        JButton btnStart = new JButton("<html><body><b>START</b></body></html>");
        JButton btnExit = new JButton("EXIT");
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1,2));
        buttonPanel.add(btnStart);
        buttonPanel.add(btnExit);
        add(buttonPanel, BorderLayout.SOUTH);
        gameMap = new GameMap();
        SettingsWindow settings = new SettingsWindow(this);
        add(gameMap, BorderLayout.CENTER);
        setVisible(true);
        btnStart.addActionListener(e -> settings.setVisible(true));
        btnExit.addActionListener(e -> System.exit(0));
    }

    public void startGame(int gameMode, int fieldSize, int winLength) {
        gameMap.startNewGame(gameMode,fieldSize,winLength);
        System.out.printf("Mode: %d, Size: %d, win length: %d", gameMode,fieldSize, winLength);
    }
}