import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  // basicly drawing an increasing number of (isosceles) triangles line by line downwards by defining the line start position
  public static int CANVAS = 500;
  public static int startLineXPos = CANVAS / 2;
  public static int startLineYPos = 0;

  public static int startXPos = CANVAS / 2;
  public static int startYPos = 0;

  public static int triangleHeight = 20;
  public static int triangleHalfBase = 13;
  public static int triangleRows = 5;

  public static void mainDraw(Graphics graphics) {
    int stopX = startLineXPos - (triangleRows * triangleHalfBase);

    while (startLineXPos > stopX) {
      for (int i = 0; i < triangleRows; i++) {
        startLineXPos -= triangleHalfBase;
        startLineYPos += triangleHeight;
        System.out.println("STARTLINE X: " + startLineXPos + ", STARTLINE Y: " + startLineYPos);
        for (int j = 0; j <= i; j++) {
          startXPos = startLineXPos + (j * (triangleHalfBase * 2));
          startYPos = startLineYPos;
          System.out.println("X: " + startXPos + ", Y: " + startYPos);
          drawTriangle(startXPos, startYPos, graphics);
        }
      }
    }
  }

  public static void drawTriangle (int startXPos, int startYPos, Graphics graphics){
    int xpoints[] = {startXPos, startXPos - triangleHalfBase, startXPos + triangleHalfBase};
    int ypoints[] = {startYPos, startYPos + triangleHeight, startYPos + triangleHeight};
    int npoints = 3;
    graphics.drawPolygon(xpoints, ypoints, npoints);
  }


  // Don't touch the code below
  static int WIDTH = CANVAS;
  static int HEIGHT = CANVAS;

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