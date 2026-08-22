package org.example;

import java.awt.*;

public class Player {

    private int x;
    private int y;

    private final int speed = 4;
    private final int size = 40;

    private KeyHandler keyHandler;

    public Player(KeyHandler keyHandler) {

        this.keyHandler = keyHandler;

        x = 380;
        y = 280;
    }

    public void update() {

        if (keyHandler.up) {
            y -= speed;
        }

        if (keyHandler.down) {
            y += speed;
        }

        if (keyHandler.left) {
            x -= speed;
        }

        if (keyHandler.right) {
            x += speed;
        }
    }

    public void draw(Graphics2D g2) {

        g2.setColor(Color.RED);

        g2.fillRect(x, y, size, size);
    }
}