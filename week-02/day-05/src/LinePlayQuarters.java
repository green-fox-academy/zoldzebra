import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
  public static void mainDraw(Graphics graphics) {

    int noOfInnerLines = 10;
    int divisors = 4;
    int diffOfInnerLines = HEIGHT / divisors / noOfInnerLines;
    int startPos1 = 0;
    int startPos2 = 0;

    int divisorCoordinate = 0;
    int divisorSpace = WIDTH / divisors;

    for (int i = 0; i < divisors ; i++) {
      divisorCoordinate += divisorSpace;
      drawDivisors(divisorCoordinate, graphics);
      for (int j = 0; j < divisors*divisors; j++){

      }
        for (int k = 0; k < noOfInnerLines; k++) {
          startPos1 = startPos1 + diffOfInnerLines;
          drawInnerLines(startPos1, startPos2, divisors, graphics);
      }
    }
  }


  private static void drawDivisors(int divisorCoordinate, Graphics graphics) {
    graphics.setColor(Color.BLACK);
    graphics.drawLine(divisorCoordinate, 0, divisorCoordinate, HEIGHT);
    graphics.drawLine(0, divisorCoordinate, WIDTH, divisorCoordinate);
  }

  public static void drawInnerLines (int startPos1, int startPos2, int divisors, Graphics graphics){
    graphics.setColor(Color.GREEN);
    graphics.drawLine(0, startPos1, startPos1, HEIGHT/divisors);
    graphics.setColor(Color.MAGENTA);
    graphics.drawLine(startPos1, 0 , WIDTH/divisors, startPos1);
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