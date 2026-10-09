import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class HouseDrawingApp {
    public static void main(String[] args) {
        int width = 500;
        int height = 450;

        // Create an in-memory image canvas
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = bufferedImage.createGraphics();

        // 1. Fill background with sky blue and grass green
        g.setColor(new Color(135, 206, 250)); // Sky Blue
        g.fillRect(0, 0, width, 300);
        
        g.setColor(new Color(34, 139, 34));   // Grass Green
        g.fillRect(0, 300, width, 150);

        // Enable anti-aliasing for smooth outlines
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // 2. Draw House Base (Rectangle)
        g.setColor(new Color(245, 222, 179)); // Wheat / Beige color
        g.fillRect(150, 180, 200, 150);
        g.setColor(Color.BLACK);
        g.drawRect(150, 180, 200, 150);

        // 3. Draw Roof (Polygon using x and y arrays)
        g.setColor(new Color(178, 34, 34)); // Firebrick Red
        int[] xPoints = {130, 250, 370};
        int[] yPoints = {180, 90, 180};
        g.fillPolygon(xPoints, yPoints, 3);
        g.setColor(Color.BLACK);
        g.drawPolygon(xPoints, yPoints, 3);

        // 4. Draw Door (Rectangle)
        g.setColor(new Color(139, 69, 19)); // Saddle Brown
        g.fillRect(225, 240, 50, 90);
        g.setColor(Color.BLACK);
        g.drawRect(225, 240, 50, 90);
        // Door knob
        g.setColor(Color.YELLOW);
        g.fillOval(260, 285, 6, 6);

        // 5. Draw Windows (Squares)
        g.setColor(new Color(255, 255, 224)); // Light Yellow (lit window)
        g.fillRect(175, 200, 40, 40);
        g.fillRect(285, 200, 40, 40);
        
        g.setColor(Color.BLACK);
        g.drawRect(175, 200, 40, 40);
        g.drawRect(285, 200, 40, 40);
        // Window cross panes
        g.drawLine(195, 200, 195, 240);
        g.drawLine(175, 220, 215, 220);
        g.drawLine(305, 200, 305, 240);
        g.drawLine(285, 220, 325, 220);

        // Clean up graphics context
        g.dispose();

        // 6. Save the drawing to a PNG file
        try {
            File file = new File("house_drawing.png");
            ImageIO.write(bufferedImage, "png", file);
            System.out.println("House drawing successfully saved to house_drawing.png!");
        } catch (Exception e) {
            System.out.println("Error saving image: " + e.getMessage());
        }
    }
}