package com.aston.matrix;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;

public class Rain extends JPanel {

    private com.aston.matrix.Drop[] drops;

    Rain() {
        drops = new com.aston.matrix.Drop[com.aston.matrix.Config.SCREEN_SIZEx / com.aston.matrix.Config.FONT_SIZE];
        for (int i = 0; i < drops.length; i++) {
            drops[i] = new com.aston.matrix.Drop(i * com.aston.matrix.Config.FONT_SIZE);
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
//        g.setColor(new Color(253, 255, 255)); //BG Color
        g.fillRect(0, 0, com.aston.matrix.Config.SCREEN_SIZEx, com.aston.matrix.Config.SCREEN_SIZEy);
        g.setColor(Color.BLACK);
        Font font = new Font("Monospaced", Font.BOLD, com.aston.matrix.Config.FONT_SIZE);
        g2.setFont(font);

        for (int i = 0; i < drops.length; i++) {
            if (drops[i].isOffScreen()) {
                drops[i] = new com.aston.matrix.Drop(i * com.aston.matrix.Config.FONT_SIZE);
            }
            drops[i].draw(g2);
        }

        try {
            Thread.sleep(10);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        repaint();
    }

}
