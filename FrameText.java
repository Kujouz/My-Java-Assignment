import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrameText extends JFrame{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 250;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 150;
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 30;

    private static final String EMPTY_STRING = "";
    private static final String NEWLINE = System.getProperty("line.separator");

    private JButton clearButton;
    private JButton addButton;
    private JTextField inputLine;
    private JTextArea textArea;

    public static void main(String[]args){
        FrameText frame = new FrameText();
        frame.setVisible(true);
    }

public FrameText(){
    Container contentPane;

    //set the frame properties
    setSize(FRAME_WIDTH, FRAME_HEIGHT);
    setResizable(false);
    setTitle("Programe Frame Text");
    setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
    
    contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());

    textArea = new JTextArea();
    textArea.setColumns(22);
    textArea.setRows(8);
    textArea.setEditable(false);
    JScrollPane scrollText = new JScrollPane(textArea);
    scrollText.setSize(200,135);
    scrollText.setBorder(BorderFactory.createLineBorder(Color.red));
    contentPane.add(scrollText);

    inputLine = new JTextField();
    inputLine.setColumns(22);
    contentPane.add(inputLine);

    //create and place two buttons on the frame
    addButton = new JButton("ADD");
    addButton.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
    contentPane.add(addButton);
    clearButton = new JButton("CLEAR");
    clearButton.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
    contentPane.add(clearButton);

    //register 'Exit upon closing' as a default close operation
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void addText(String newLine) {
        textArea.append(newLine + NEWLINE);
        inputLine.setText("");
    }
    private void clearText(){
        textArea.setText(EMPTY_STRING);
        inputLine.setText(EMPTY_STRING);
    }
}
