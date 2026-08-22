package org.example;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class GamePanel extends JPanel implements Runnable {

    private Thread gameThread;

    private final int FPS = 60;

    public GamePanel() {
        setBackground(Color.BLACK);
    }

    public void startGameLoop() {

        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

        double drawInterval = 1_000_000_000.0 / FPS;
        double nextDrawTime = System.nanoTime() + drawInterval;

        while (gameThread != null) {

            update();

            repaint();

            try {

                double remainingTime =
                        nextDrawTime - System.nanoTime();

                remainingTime = remainingTime / 1_000_000;

                if (remainingTime < 0) {
                    remainingTime = 0;
                }

                Thread.sleep((long) remainingTime);

                nextDrawTime += drawInterval;

            } catch (InterruptedException e) {

                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    private void update() {
        // Atualização do jogo
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setColor(Color.WHITE);
        g.drawString("Diablo 2D", 20, 30);
    }
}