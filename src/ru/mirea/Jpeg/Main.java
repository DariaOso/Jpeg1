package ru.mirea.Jpeg;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        // args[0]="C:\\Users\\Даша\\IdeaProjects\\image.jpg";
        Jpeg one = new Jpeg(args[0]);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(one);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
