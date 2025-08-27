import javax.swing.*;

public class JRadioButtonExample {
    public static void main(String[] args){
        JFrame frame = new JFrame("JRadioButton Example");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JRadioButton rb1 = new JRadioButton("Choice A");
        rb1.setBounds(50,50,100,30);

        JRadioButton rb2 = new JRadioButton("Choice B");
        rb2.setBounds(50,90,100,30);

        ButtonGroup group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);

        frame.add(rb1);
        frame.add(rb2);

        frame.setVisible(true);
    }
}
