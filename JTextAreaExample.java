import javax.swing.*;

public class JTextAreaExample {
    public static void main(String[] args){
        JFrame frame = new JFrame("JTextArea Example");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextArea textArea = new JTextArea("Enter multiple lines of text here...");
        textArea.setBounds(50,50,300,150);

        frame.add(textArea);
        frame.setVisible(true);
    }
}
