
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyJFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Example");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout()); // Capitalized FlowLayout correctly
        JButton button = new JButton("Press me"); // Setting text during button creation
        JLabel label = new JLabel("Hello, World!"); // Creating a label
        panel.add(button);
        panel.add(label); // Adding the label to the panel
        frame.add(panel);
        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
