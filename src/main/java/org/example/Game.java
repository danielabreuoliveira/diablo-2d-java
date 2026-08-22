package org.example;

import javax.swing.*;

public class Game {

    private JFrame window;

    public Game(){

        window = new JFrame("Diablo 2d");

        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
