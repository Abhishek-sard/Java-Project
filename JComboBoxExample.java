import javax.swing.*;
import java.awt.*;

public class JComboBoxExample {
    public JComboBoxExample() {
        // Create a JComboBox
        String[] options = { "Abhishek", "Read", "meditation", "Social media", "Focus" };
        JComboBox<String> comboBox = new JComboBox<>(options);

        // Create a JPanel
        JPanel panel = new JPanel();
        panel.add(comboBox);

        // Create a JFrame
        JFrame frame = new JFrame("JComboBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Add the JPanel to the JFrame
        frame.add(panel);

        // Make the JFrame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new JComboBoxExample();
    }
}
