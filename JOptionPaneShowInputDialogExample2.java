import javax.swing.*;

public class JOptionPaneShowInputDialogExample2 {
    public static void main(String[]args){
        JFrame frame = new JFrame("InputDialog Example #2");
        String code = JOptionPane.showInputDialog(frame, "Enter the secret code to continue (label)", "Secret code needed(title)",JOptionPane.WARNING_MESSAGE);

        //if the user presses Cancel, this will be null
        System.out.printf("The secret code is: '%s'.\n", code);
        System.exit(0);
    }
}
