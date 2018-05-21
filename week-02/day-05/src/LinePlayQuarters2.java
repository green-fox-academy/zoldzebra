import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters2 {

  public static int noOfLines = 30;
  public static int CANVAS = 500;

  public static int startPosX = 0;
  public static int startPosY = 0;
  public static int divisors = 4;
  public static int squareSize = CANVAS / divisors;
  public static int diff =  squareSize / noOfLines;


  public static void mainDraw(Graphics graphics) {
    for (int i = 0; i < (divisors) ; i++) {
      startPosY = i * squareSize;
      startPosX = 0;
      for (int j = 0; j < (divisors); j++) {
        startPosX = j * squareSize;
        //System.out.println("Y: " + startPosY + ", X: " + startPosX);
        drawLines(startPosX, startPosY, graphics);
      }
    }
  }

  public static void drawLines (int startPosX, int startPosY, Graphics graphics){
    for (int i = 0; i < noOfLines; i++) {
      int startLine1X = startPosX;
      int startLine1Y = startPosY + ((i+1) * diff);
      int endLine1X = startPosX + ((i+1) * diff);
      int endLine1Y = startPosY + squareSize;
      int startLine2X = startPosX + ((i+1) * diff);
      int startLine2Y = startPosY;
      int endLine2X = startPosX + squareSize;
      int endLine2Y = startPosY + ((i+1) * diff);

      graphics.setColor(Color.GREEN);
      graphics.drawLine(startLine1X, startLine1Y, endLine1X, endLine1Y);
      //graphics.setColor(Color.MAGENTA);
      graphics.drawLine(startLine2X, startLine2Y, endLine2X, endLine2Y);
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