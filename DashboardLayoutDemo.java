import javax.swing.*;
import java.awt.*;

public class DashboardLayoutDemo {
    public static void main(String[] args) {
        // 1. Create the main application window (Frame)
        JFrame frame = new JFrame("Dashboard Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // 2. Set BorderLayout on the frame's content pane with gaps between regions
        frame.setLayout(new BorderLayout(10, 10));

        // 3. Create components for each region of the dashboard
        
        // North Region: Header
        JLabel headerLabel = new JLabel(" Dashboard Header - Welcome User", JLabel.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 16));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(Color.LIGHT_GRAY);
        headerLabel.setPreferredSize(new Dimension(600, 50));

        // South Region: Footer
        JLabel footerLabel = new JLabel("© 2026 Fitness & Dashboard Corp. All rights reserved.", JLabel.CENTER);
        footerLabel.setOpaque(true);
        footerLabel.setBackground(Color.LIGHT_GRAY);
        footerLabel.setPreferredSize(new Dimension(600, 30));

        // West Region: Menu / Navigation Panel
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(4, 1, 5, 5));
        menuPanel.setBackground(Color.DARK_GRAY);
        menuPanel.add(new JButton("Home"));
        menuPanel.add(new JButton("Profile"));
        menuPanel.add(new JButton("Analytics"));
        menuPanel.add(new JButton("Settings"));
        menuPanel.setPreferredSize(new Dimension(130, 400));

        // Center Region: Main Content Area
        JTextArea contentArea = new JTextArea("Main Application Content Area:\n\n- User stats and activity graphs will appear here.\n- BorderLayout automatically stretches this center component to fill all remaining space.");
        contentArea.setEditable(false);
        contentArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(contentArea); // Add scroll capability

        // East Region: Side Panel / Notifications (Optional layout balance)
        JPanel eastPanel = new JPanel();
        eastPanel.add(new JLabel("Notifications"));
        eastPanel.setPreferredSize(new Dimension(100, 400));
        eastPanel.setBackground(Color.WHITE);

        // 4. Add components to the frame using BorderLayout constraints
        frame.add(headerLabel, BorderLayout.NORTH);
        frame.add(footerLabel, BorderLayout.SOUTH);
        frame.add(menuPanel, BorderLayout.WEST);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(eastPanel, BorderLayout.EAST);

        // 5. Center window on screen and make visible
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}