import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareInTheCenter {

  public static void mainDraw(Graphics graphics) {
    // Draw a green 10x10 square to the canvas' center.

    graphics.setColor(new Color(0,200,100,200));
    graphics.drawRect((WIDTH/2) - 5, (HEIGHT/2)-5, 10, 10);
    /*
    graphics.drawLine((WIDTH/2) - 5, (HEIGHT/2)-5, (WIDTH/2) - 5, (HEIGHT/2)+5);
    graphics.drawLine((WIDTH/2) - 5, (HEIGHT/2)+5, (WIDTH/2) + 5, (HEIGHT/2)+5);
    graphics.drawLine((WIDTH/2) + 5, (HEIGHT/2)+5, (WIDTH/2) + 5, (HEIGHT/2)-5);
    graphics.drawLine((WIDTH/2) + 5, (HEIGHT/2)-5, (WIDTH/2) - 5, (HEIGHT/2)-5);
    */
  }

  // Don't touch the code below
  static int WIDTH = 200;
  static int HEIGHT = 200;

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