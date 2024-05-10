import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayout{
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JButton jb1 = new JButton("North");
        JButton jb2 = new JButton("South");
        JButton jb3 = new JButton("West");
        JButton jb4 = new JButton("East");
        JButton jb5 = new JButton("Center");
        panel.setLayout(new BorderLayout());
        panel.add(jb1, BorderLayout.NORTH);
        panel.add(jb2, BorderLayout.SOUTH);
        panel.add(jb3, BorderLayout.WEST);
        panel.add(jb4, BorderLayout.EAST);
        panel.add(jb5, BorderLayout.CENTER);
        frame.add(panel);
        frame.pack();
        frame.setSize(400,400);
        frame.setVisible(true);
    }
    
}
