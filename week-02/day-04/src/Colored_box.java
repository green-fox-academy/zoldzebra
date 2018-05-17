import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Colored_box {
  public static void mainDraw(Graphics graphics) {
    // Draw a box that has different colored lines on each edge.

    graphics.setColor(new Color(250,0,100,200));
    graphics.drawLine(20, 20, 20, 50);
    graphics.setColor(new Color(0,0,100,200));
    graphics.drawLine(20, 50, 120, 50);
    graphics.setColor(new Color(0,200,100,200));
    graphics.drawLine(120, 50, 120, 20);
    graphics.setColor(new Color(200,110,0,200));
    graphics.drawLine(20, 20, 120, 20);


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