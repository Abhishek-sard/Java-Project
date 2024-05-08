import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Test extends JFrame {
    public Test() {
        JCheckBox jcb1 = new JCheckBox("Yes");
        add(jcb1);
        JCheckBox jcb2 = new JCheckBox("No");
        add(jcb2);
        JCheckBox jcb3 = new JCheckBox("Maybe");
        add(jcb3);
        
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Test();
    }
}
