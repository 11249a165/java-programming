import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        // 1. Create the main application window (Frame)
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // 2. Create a JPanel and set its layout to FlowLayout
        // Parameters: FlowLayout.LEFT alignment, 15px horizontal gap, 15px vertical gap
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 15));

        // 3. Add multiple components to the panel
        panel.add(new JButton("Button One"));
        panel.add(new JButton("Button Two"));
        panel.add(new JButton("Button Three"));
        panel.add(new JButton("Button Four"));
        panel.add(new JButton("Button Five"));

        // 4. Add panel to frame and make it visible
        frame.add(panel);
        frame.setLocationRelativeTo(null); // Center on screen
        frame.setVisible(true);
    }
}