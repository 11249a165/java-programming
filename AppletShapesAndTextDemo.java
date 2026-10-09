import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class AppletShapesAndTextDemo {
    public static void main(String[] args) {
        int width = 500;
        int height = 350;

        // Create an in-memory image canvas to draw on (avoids GUI headless exceptions)
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = bufferedImage.createGraphics();

        // 1. Fill the background with white
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);

        // Enable anti-aliasing for smooth rendering
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // 2. Draw a Red Rectangle
        g.setColor(Color.RED);
        // Parameters: x, y, width, height
        g.fillRect(60, 60, 160, 90); // Filled rectangle so the red color is clearly visible

        // 3. Draw a Blue Oval
        g.setColor(Color.BLUE);
        // Parameters: x, y, width, height
        g.fillOval(260, 60, 140, 90); // Filled oval for solid blue appearance

        // 4. Draw the Message in Bold Font
        g.setColor(Color.DARK_GRAY);
        // Set font family, BOLD style, and size 18
        g.setFont(new Font("SansSerif", Font.BOLD, 18));
        // Parameters: string, x coordinate, y coordinate
        g.drawString("Java Applets are fun!", 130, 220);

        // Clean up graphics context
        g.dispose();

        // 5. Save the drawing to an image file (applet_output.png)
        try {
            File file = new File("applet_output.png");
            ImageIO.write(bufferedImage, "png", file);
            System.out.println("Drawing successfully saved to applet_output.png!");
        } catch (Exception e) {
            System.out.println("Error saving image: " + e.getMessage());
        }
    }
}