import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.
    // avoid code duplication.
    int rectangles = 4;
    for (int i = 0; i < rectangles; i++) {
      graphics.setColor(new Color((int) (Math.random()*256),(int) (Math.random()*256),(int) (Math.random()*256),(int) (100 + (Math.random()*156))));
      graphics.fillRect((int) (Math.random()*401), (int) (Math.random()*401), (int)(Math.random()*101), (int) (Math.random()*101));
    }



  }

  //    Don't touch the code below
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}