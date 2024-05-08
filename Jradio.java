import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test extends JFrame{
    public Test(){
        JRadioButton jcb = new JRadioButton("A");
        add(jcb);
        jcb = new JRadioButton("B");
        add(jcb);
        jcb = new JRadioButton("C");
        add(jcb);
        jcb = new JRadioButton("none");
        add(jcb);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Test();
        
    }
}
