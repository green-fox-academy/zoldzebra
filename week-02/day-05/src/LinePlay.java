import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  public static void mainDraw(Graphics graphics) {

    int[] starting = {0,0};
    int[] ending = {0,HEIGHT};
    int numberOfLines = 35;

    for (int i = 0; i < numberOfLines ; i++) {
      starting[1] += WIDTH/numberOfLines;
      ending[0] += WIDTH/numberOfLines;
      drawLine1(starting, ending, graphics);
    }

    starting[1] = 0;
    ending[0] = WIDTH;
    ending[1] = 0;

    for (int i = 0; i < numberOfLines ; i++) {
      starting[0] += WIDTH/numberOfLines;
      ending[1] += WIDTH/numberOfLines;
      drawLine2(starting, ending, graphics);
    }
  }

  public static void drawLine1 (int[] starting, int[] ending, Graphics graphics){
    graphics.setColor(Color.MAGENTA);
    graphics.drawLine(starting[0], starting[1], ending[0], ending[1]);
  }
  public static void drawLine2 (int[] starting, int[] ending, Graphics graphics) {
    graphics.setColor(Color.BLACK);
    graphics.drawLine(starting[0], starting[1], ending[0], ending[1]);
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