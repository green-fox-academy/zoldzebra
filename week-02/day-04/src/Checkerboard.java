import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {

    int[] squareData = {0,0,255,30}; // 0 = pos x, 1 = pos y,  2 color, 3 size
    int squares = 64;
    for (int i = 0; i < squares ; i++) {
      if ((((i / 8) % 2 == 0) && (i % 2 ==0)) || ((i % 2 != 0) && (((i-1) / 8) % 2 == 1))){
        squareData[2] = 255;
      } else {
        squareData[2] = 0;
      }
      drawSquare(squareData, graphics);
      squareDataCounter(squareData);
    }
  }

  public static void drawSquare (int[] squareData, Graphics graphics){
    graphics.setColor(new Color(squareData[2], squareData[2], squareData[2]));
    graphics.fillRect(squareData[0], squareData[1], squareData[3], squareData[3]);
    graphics.setColor(Color.BLACK);
    graphics.drawRect(squareData[0], squareData[1], squareData[3], squareData[3]);
  }

  public static int[] squareDataCounter (int[] squareData) {
    squareData[0] += squareData[3];
    if (squareData[0] > squareData[3] * 7) {
      squareData[1] += squareData[3];
      squareData[0] = 0;
    }
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