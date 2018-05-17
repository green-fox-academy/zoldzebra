import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
  public static void mainDraw(Graphics graphics) {
    // Create a square drawing function that takes 2 parameters:
    // The square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares.

    int size = 400;
    int squares = 30;
    int[] color = new int[4];
    for (int i = 0; i < squares; i++) {
      for (int j = 0; j < 4; j++) {
        color[j] = (int) (Math.random()*256);
      }
      size = 400 - (i*(400/squares));
      drawCenterSquare(size, color, graphics);
    }
  }

  public static void drawCenterSquare(int size, int[] color, Graphics graphics){
    graphics.setColor(new Color(color[0], color[1], color[2], color[3]));
    graphics.fillRect(WIDTH/2-size/2, HEIGHT/2-size/2, size, size);

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