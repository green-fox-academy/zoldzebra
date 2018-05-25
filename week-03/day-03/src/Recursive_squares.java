import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class Recursive_squares {

  public static int CANVAS = 500;

  public static void mainDraw(Graphics graphics){

    int x = 0;
    int y = 0;
    int size = CANVAS;

    int counter = 0;
    int limit = 5;

    draw4Squares(0, 0, CANVAS, graphics);

  }

  public static void drawSquare(int x, int y, int size, Graphics graphics){
    graphics.setColor(Color.black);
    graphics.drawRect(x, y, size, size);
  }

  public static void draw4Squares(int x, int y, int canvasSize, Graphics graphics) {
    if (canvasSize > 3) {
      int size = canvasSize / 3;
      drawSquare(x + size, y, size, graphics);
      draw4Squares(x + size, y, size, graphics);

      drawSquare(x, y + size, size, graphics);
      draw4Squares(x, y + size, size, graphics);

      drawSquare(x + (2 * size), y + size, size, graphics);
      draw4Squares(x + (2 * size), y + size, size, graphics);

      drawSquare(x + size, y + (2 * size), size, graphics);
      draw4Squares(x + size, y + (2 * size), size, graphics);
    } else {
      return;
    }
  }




    // Don't touch the code below
    static int WIDTH = CANVAS;
    static int HEIGHT = WIDTH;

    public static void main(String[] args) {
      JFrame jFrame = new JFrame("Drawing");
      jFrame.setSize(new Dimension(CANVAS, CANVAS+23));
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