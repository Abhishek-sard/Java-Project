//package
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
//function
public class TestSwing extends JFrame implements ActionListener {
    JButton btn1;
    JButton btn2;

    TestSwing() {
        btn1 = new JButton("Yes");
        btn2 = new JButton("No");
        btn1.addActionListener(this);
        btn2.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(400, 400);
        add(btn1);
        add(btn2);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            // Code to handle btn1 click
            System.out.println("Yes button clicked");
        } else if (e.getSource() == btn2) {
            // Code to handle btn2 click
            System.out.println("No button clicked");
        }
    }

    public static void main(String[] args) {
        new TestSwing(); 
    }
}
