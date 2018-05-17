import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ToTheCenter {
  // had problems with rerunning mainDraw() and probably scanner, the comment are for the workarounds, which didnt really work out...
  //static boolean hasUserinput = false;

  public static void mainDraw(Graphics graphics) {
    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // Draw 3 lines with that function. Use loop for that.

    Scanner scanner = new Scanner(System.in);
    int x, y = 0;
    int db = 0;

    //System.out.println("How many lines do you want?");
    //db = scanner.nextInt();
    int[] starts = {450, 40, 150, 300, 400, 200};
    for (int i = 0; i < 3; i++) {
      lineToCenter(starts[i*2], starts[(i*2)+1], graphics);
    }
    //hasUserinput = true;
  }
  private static void lineToCenter(int x, int y, Graphics graphics) {
    graphics.setColor(new Color(0,200,100));
    graphics.drawLine(x, y, WIDTH/2, HEIGHT/2);
  }

  //public static int lineToCenter(int x, int y){
  //}

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