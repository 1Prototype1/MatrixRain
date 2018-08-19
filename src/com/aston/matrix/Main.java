package com.aston.matrix;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Matrix Rain");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(com.aston.matrix.Config.SCREEN_SIZEx, com.aston.matrix.Config.SCREEN_SIZEy);
        frame.setResizable(false);

//        Rectangle r = frame.getBounds();
//        Config.SCREEN_SIZEy = r.height;
//        Config.SCREEN_SIZEx = r.width;

        frame.add(new com.aston.matrix.Rain());
        frame.setVisible(true);
    }

}