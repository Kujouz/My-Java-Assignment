import javax.swing.*;

public class JToggleButtonExample {
    public static void main(String[] args){
        JFrame frame = new JFrame("JToggleButton Example");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JToggleButton toggle = new JToggleButton("Toggle");
        toggle.setBounds(100,70,100,40);

        frame.add(toggle);
        frame.setVisible(true);
    }
}
