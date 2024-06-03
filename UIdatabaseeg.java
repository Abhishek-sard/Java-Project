// import javax.swing.JFrame;
// import javax.swing.JTextField;

// public class UIUinterface {

//     public static void main(String[] args) {
//         JFrame frame = new JFrame("UIUXinterface");
//         frame.setSize(300, 200);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setLayout(null);

//         // creating the text field
//         JTextField number1Field = new JTextField();
//         number1Field.setBounds(50, 30, 200, 30);
//         frame.add(number1Field);
//         frame.setVisible(true);
//         try {
            

//         } catch (Exception e) {

//         }
//     }
// }
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UIdatabaseeg extends JFrame implements ActionListener {

    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    private JTextField idField, nameField, ageField;
    private JButton insertButton, selectButton, updateButton, deleteButton;
    private JTextArea resultArea;

    public UIdatabaseeg() {
        setTitle("Database UI Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));

        // Create UI components
        idField = new JTextField(10);
        nameField = new JTextField(10);
        ageField = new JTextField(10);
        insertButton = new JButton("Insert");
        selectButton = new JButton("Select");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");
        resultArea = new JTextArea();
        resultArea.setEditable(false);

        // Add components to the frame
        add(new JLabel("ID:"));
        add(idField);
        add(new JLabel("Name:"));
        add(nameField);
        add(new JLabel("Age:"));
        add(ageField);
        add(insertButton);
        add(selectButton);
        add(updateButton);
        add(deleteButton);
        add(new JScrollPane(resultArea));

        // Add action listeners
        insertButton.addActionListener(this);
        selectButton.addActionListener(this);
        updateButton.addActionListener(this);
        deleteButton.addActionListener(this);

        setLocationRelativeTo(null);
        setVisible(true);

        // Database connection setup
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "");
            stmt = con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String id = idField.getText();
        String name = nameField.getText();
        String age = ageField.getText();
        String query;

        try {
            if (e.getSource() == insertButton) {
                query = "INSERT INTO student (id, name, age) VALUES(" + id + ", '" + name + "', " + age + ");";
                stmt.executeUpdate(query);
                resultArea.setText("Inserted record with ID: " + id);
            } else if (e.getSource() == selectButton) {
                query = "SELECT * FROM student";
                rs = stmt.executeQuery(query);
                resultArea.setText("");
                while (rs.next()) {
                    resultArea.append(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + "\n");
                }
            } else if (e.getSource() == updateButton) {
                query = "UPDATE student SET id = " + id + " WHERE name = '" + name + "';";
                stmt.executeUpdate(query);
                resultArea.setText("Updated record with Name: " + name);
            } else if (e.getSource() == deleteButton) {
                query = "DELETE FROM student WHERE id = " + id + ";";
                stmt.executeUpdate(query);
                resultArea.setText("Deleted record with ID: " + id);
            }
        } catch (Exception ex) {
            System.out.println(ex);
            resultArea.setText("Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new UIdatabaseeg();
    }
}

