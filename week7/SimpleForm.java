import javax.swing.*;
import java.awt.event.*;

public class SimpleForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Form Example");

        JLabel nameLabel = new JLabel("Enter Name:");
        nameLabel.setBounds(30, 50, 100, 30);

        JTextField textField = new JTextField();
        textField.setBounds(150, 50, 150, 30);

        JButton button = new JButton("Submit");
        button.setBounds(100, 120, 100, 30);

        JLabel result = new JLabel();
        result.setBounds(30, 170, 300, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText("Hello, " + textField.getText() + "!");
            }
        });

        frame.add(nameLabel);
        frame.add(textField);
        frame.add(button);
        frame.add(result);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
