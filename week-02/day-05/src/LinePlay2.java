import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay2 {
  public static void mainDraw(Graphics graphics) {

    int noOfLines = 30;
    int diff = HEIGHT / noOfLines;
    int startX = 0;

    for (int i = 0; i < noOfLines; i++) {
      startX += diff;
      drawLines1(startX, graphics);
    }
  }

  public static void drawLines1 (int startX, Graphics graphics){
    graphics.setColor(Color.GREEN);
    graphics.drawLine(0, startX, startX, HEIGHT);
    graphics.setColor(Color.MAGENTA);
    graphics.drawLine(startX, 0 , WIDTH, startX);
  }


  // Don't touch the code below
  static int WIDTH = 500;
  static int HEIGHT = 500;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT+23));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}