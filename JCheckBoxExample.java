import javax.swing.*;

public class JCheckBoxExample {
    public static void main(String[] args){
        JFrame frame = new JFrame("JCheckBox Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JCheckBox checkBox1 = new JCheckBox("Option 1");
        checkBox1.setBounds(50,50,100,30);

        JCheckBox checkBox2 = new JCheckBox("Option 2");
        checkBox2.setBounds(50,90,100,30);

        frame.add(checkBox1);
        frame.add(checkBox2);

        frame.setVisible(true);
    }
}
