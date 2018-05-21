import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard2 {
  public static void mainDraw(Graphics graphics) {
    // Reproduce this:
    // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]
    int size = 30;
    int x = 0;
    int y = 0;

    for (int i = 0; i < 4; i++) {
      drawPairs(x, y, size, graphics);

    }

  }

  public static void drawPairs (int x, int y, int size, Graphics graphics){
    drawWhite(x, y, size, graphics);
    x += size;
    drawBlack(x, y, size, graphics);
    x += size;
  }

  public static void drawBlack (int x, int y, int size, Graphics graphics){
    graphics.setColor(Color.BLACK);
    graphics.fillRect(x, y, size, size);
  }
  public static void drawWhite(int x, int y, int size, Graphics graphics){
    graphics.setColor(Color.BLACK);
    graphics.drawRect(x, y, size, size);
  }



  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
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