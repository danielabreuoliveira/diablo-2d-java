package org.example;

import javax.swing.JFrame;

public class Game {

    private JFrame window;
    private GamePanel gamePanel;

    public Game() {

        window = new JFrame("Diablo 2D");

        gamePanel = new GamePanel();

        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.add(gamePanel);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamePanel.startGameLoop();
    }
}