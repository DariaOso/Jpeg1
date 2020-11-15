package ru.mirea.Jpeg;

import javax.swing.*;
import java.awt.*;

public class Jpeg extends JPanel {
    String n;

    Jpeg(String n) {
        this.n = n;

    }

    public void paintComponent(Graphics g) {
        Image image = new ImageIcon(n).getImage();
        g.drawImage(image, 3, 4, null);
    }

}

