import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {
    // Reproduce this:
    // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]
    int[] squareData = {0,0,120,120,120,30}; // 0 = pos x, 1 = pos y 2-4 color, 5 size
    int squares = 64;
    for (int i = 0; i < squares ; i++) {
      drawSquare(squareData, graphics);
      squareDataCounter(squareData);
    }
  }

  public static void drawSquare (int[] squareData, Graphics graphics){
    graphics.setColor(new Color(squareData[2], squareData[3], squareData[4]));
    graphics.fillRect(squareData[0], squareData[1], squareData[5], squareData[5]);
    graphics.setColor(Color.BLACK);
    graphics.drawRect(squareData[0], squareData[1], squareData[5], squareData[5]);
  }

  public static int[] squareDataCounter (int[] squareData){
    squareData[0] += squareData[5];
    if (squareData[0] > squareData[5]*7) {
      squareData[1] += squareData[5];
      squareData[0] = 0;
    }
    if ((squareData[1] % squareData[5]) == 1) {
      squareData[2] = 255;
      squareData[3] = 255;
      squareData[4] = 255;
    } else {

    //}
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