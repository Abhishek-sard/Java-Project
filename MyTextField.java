// import javax.swing.*;
// import java.awt.event.*;
// import java.awt.*;
// public class JTextField {
//     public static void main(String[] args) {
//         JTextField jtf = new JTextField(20); //creating JTextField
//         add(jtf);                              //adding JTextField to frame
//         setLayout(new FlowLayout());
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setSize(400,400);
//         setVisible(true);
//     }
//     public static void main(String[]args){
//         new MyTextField();
//     }
// }
import javax.swing.*;
import java.awt.*;

public class MyTextField extends JFrame {
    JTextField jtf;

    public MyTextField() {
        // Create JTextField
        jtf = new JTextField(20);

        // Add JTextField to frame
        add(jtf);

        // Set layout
        setLayout(new FlowLayout());

        // Set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set size
        setSize(400, 400);

        // Set visibility
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of MyTextField
        new MyTextField();
    }
}
