import javax.swing.*;

public class JTextFieldExample {
    public static void main(String[] args){
        JFrame frame = new JFrame("JTextField Example");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextField textField = new JTextField ("Type here...");
        textField.setBounds(50,70,200,30);

        frame.add(textField);
        frame.setVisible(true);
    }
}
