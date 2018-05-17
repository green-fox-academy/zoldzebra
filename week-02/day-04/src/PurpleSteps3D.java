import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3D {
  public static void mainDraw(Graphics graphics) {
    // Reproduce this:
    // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]
    int[] squareData = {0,10};
    int squares = 8;
    for (int i = 0; i < squares ; i++) {
      drawSquare(squareData, graphics);
      squareDataCounter(squareData);
    }
  }

  public static void drawSquare (int[] squareData, Graphics graphics){
    graphics.setColor(Color.MAGENTA);
    graphics.fillRect(squareData[0], squareData[0], squareData[1], squareData[1]);
    graphics.setColor(Color.BLACK);
    graphics.drawRect(squareData[0], squareData[0], squareData[1], squareData[1]);
  }

  public static int[] squareDataCounter (int[] squareData){
    squareData[0] += squareData[1];
    squareData[1] += 10;
    return squareData;
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