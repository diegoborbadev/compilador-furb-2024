package main.java;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;

public class NumberedBorder extends AbstractBorder {

    private static final long serialVersionUID = -5089118025935944759L;

    private static final int CHARACTER_HEIGHT = 8;
    private static final int CHARACTER_WIDTH = 7;
    private static final Color COLOR = new Color(164, 164, 164);

    private static int lineHeight;

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        JTextArea textArea = (JTextArea) c;
        Font font = textArea.getFont();
        FontMetrics metrics = g.getFontMetrics(font);
        lineHeight = metrics.getHeight();

        Color oldColor = g.getColor();
        g.setColor(COLOR);

        int lineLeft = calculateLeft(height) + 10;

        int visibleLines = textArea.getHeight() / lineHeight;
        for (int i = 0; i < visibleLines; i++) {
            String str = String.valueOf(i + 1);
            int lenght = str.length();

            int py = lineHeight * i + 14;
            int px = lineLeft - (CHARACTER_WIDTH * lenght) - 2;

            g.drawString(str, px, py);
        }
        g.drawLine(lineLeft, 0, lineLeft, height);
        g.setColor(oldColor);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        int left = calculateLeft(c.getHeight()) + 13;
        return new Insets(1, left, 1, 1);
    }

    private int calculateLeft(int height) {
        double r = (double) height / (double) lineHeight;
        int rows = (int) (r + 0.5);
        String str = String.valueOf(rows);
        int lenght = str.length();
        return CHARACTER_HEIGHT * lenght;
    }
}