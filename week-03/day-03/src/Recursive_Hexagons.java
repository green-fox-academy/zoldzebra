import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Recursive_Hexagons {

  public static int CANVAS = 500;

  public static void mainDraw(Graphics graphics){

    double x = 100;
    double y = 0;
    double size = 100;

   // drawHexagon(x, y, size, graphics);

    draw3Hexagons(x, y, size, graphics);

  }

  public static void drawHexagon(double x, double y, double size, Graphics graphics){
    double sqrt3 = Math.sqrt(3);
    int[] xPoints = {(int) Math.round(x), (int) Math.round(x + size), (int) Math.round(x + size + (size / 2)), (int) Math.round(x + size), (int) Math.round(x), (int) Math.round(x - (size / 2))};
    int[] yPoints = {(int) Math.round(y), (int) Math.round(y), (int) Math.round(sqrt3 / 2 * size), (int) Math.round(sqrt3 * size), (int) Math.round(sqrt3 * size), (int) Math.round(sqrt3 / 2 * size)};
    int nPoints = 6;
    graphics.setColor(Color.black);
    graphics.drawPolygon(xPoints, yPoints, nPoints);
  }

  public static void draw3Hexagons(double x, double y, double size, Graphics graphics){
    System.out.println("Draw3Hexas running" + x);
    size = size / 2;
    double sqrt3 = Math.sqrt(3);
    drawHexagon(x, y, size, graphics);

    System.out.println((x + size + (size / 2)));

    drawHexagon((x + size + (size / 2)), (sqrt3 / 2 * size), size, graphics);

    //drawHexagon(x, sqrt3 * size, size, graphics);

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