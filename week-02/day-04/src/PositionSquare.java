import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 2 parameters:
    // the x and y coordinates of the square's top left corner
    // and draws a 50x50 square from that point.
    // draw 3 squares with that function.
    // avoid code duplication.

    int[] starts = {30, 40, 150, 20, 450, 333};
    for (int i = 0; i < 3; i++) {
      drawSquare(starts[i*2], starts[(i*2)+1], graphics);
    }
  }

  public static void drawSquare(int x, int y, Graphics graphics) {
    graphics.setColor(new Color(0, 200, 100));
    graphics.fillRect(x, y, 50, 50);
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