import javax.swing.JFrame;
import javax.swing.JLabel;

public class SimpleFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Swing App");
        JLabel label = new JLabel("Hello, Swing!", JLabel.CENTER);

        frame.add(label);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
