import javax.swing.*;
import java.awt.*;

public class GeometricShapesApp extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // 1. Draw a Line
        g.setColor(Color.BLUE);
        g.drawLine(50, 50, 200, 50);
        g.drawString("Line", 110, 40);
        
        // 2. Draw a Rectangle
        g.setColor(Color.RED);
        g.drawRect(50, 80, 150, 90);
        g.drawString("Rectangle", 95, 75);
        
        // 3. Draw a Circle (using drawOval with equal width and height)
        g.setColor(Color.GREEN);
        g.drawOval(250, 80, 100, 100);
        g.drawString("Circle", 285, 70);
        
        // 4. Draw a Triangle (using drawPolygon with x and y coordinate arrays)
        g.setColor(Color.MAGENTA);
        int[] xPoints = {150, 100, 200};
        int[] yPoints = {220, 320, 320};
        g.drawPolygon(xPoints, yPoints, 3);
        g.drawString("Triangle", 135, 215);
    }

    public static void main(String[] args) {
        // Create the application window frame
        JFrame frame = new JFrame("Geometric Shapes Visualizer");
        GeometricShapesApp panel = new GeometricShapesApp();
        
        frame.add(panel);
        frame.setSize(450, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}