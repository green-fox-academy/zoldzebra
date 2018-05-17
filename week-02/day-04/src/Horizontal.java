import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Horizontal {
  public static void mainDraw(Graphics graphics) {
    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a 50 long horizontal line from that point.
    // Draw 3 lines with that function. Use loop for that.

    int starts[] = {20, 40, 100, 300, 200, 200};
    for (int i = 0; i < 3; i++) {
      lineToCenter(starts[i*2], starts[(i*2)+1], graphics);
    }
    //hasUserinput = true;
  }
  private static void lineToCenter(int x, int y, Graphics graphics) {
    graphics.setColor(new Color(0,200,100));
    graphics.drawLine(x, y, x+50, y);
  }

  // Don't touch the code below
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

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}