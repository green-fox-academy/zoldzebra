import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Middle_lines {
  public static void mainDraw(Graphics graphics){
    // draw a red horizontal line to the canvas' middle.
    // draw a green vertical line to the canvas' middle.

    graphics.setColor(new Color(250,0,100,200));
    graphics.drawLine(WIDTH/2, 0, WIDTH/2, HEIGHT);
    graphics.setColor(new Color(10,200,100,200));
    graphics.drawLine(0, HEIGHT/2, WIDTH, HEIGHT/2);




  }

  // Don't touch the code below
  static int WIDTH = 400;
  static int HEIGHT = 400;

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