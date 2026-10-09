import javax.swing.*;
import java.awt.*;

public class CalculatorGridLayoutDemo {
    public static void main(String[] args) {
        // 1. Create the main application window (Frame)
        JFrame frame = new JFrame("Calculator UI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        // 2. Set BorderLayout on the main frame to hold the display screen at top and keypad at center
        frame.setLayout(new BorderLayout(5, 5));

        // 3. Create a text field for the calculator display (placed in NORTH)
        JTextField displayField = new JTextField("0");
        displayField.setFont(new Font("Arial", Font.BOLD, 24));
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setEditable(false);
        frame.add(displayField, BorderLayout.NORTH);

        // 4. Create a panel for the keypad and set it to GridLayout
        // 5 rows, 4 columns, with a 5-pixel gap between buttons horizontally and vertically
        JPanel keypadPanel = new JPanel(new GridLayout(5, 4, 5, 5));

        // Define the button labels in standard calculator layout order
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "C", "(", ")", "BKSP"
        };

        // 5. Add buttons to the GridLayout panel in a loop
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 16));
            keypadPanel.add(button);
        }

        // 6. Add the keypad panel to the center of the frame
        frame.add(keypadPanel, BorderLayout.CENTER);

        // 7. Center window on screen and make visible
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}