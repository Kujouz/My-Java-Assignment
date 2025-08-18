import java.awt.*;

public class AWTMenuBar extends Frame {
    public AWTMenuBar(){
        setTitle("Question 2 - AWT Menu Bar");
        setSize(400,400);
        setLayout(new FlowLayout());

        MenuBar menuBar = new MenuBar();

        //Create Menus
        Menu winkenMenu = new Menu("Winken");
        Menu blinkenMenu = new Menu("Blinken");
        Menu nodMenu = new Menu("Nod");

        MenuItem fiMenuItem = new MenuItem("Fi");
        MenuItem zapMenuItem = new MenuItem("Zap");
        MenuItem oxenMenuItem = new MenuItem("Oxen");

        MenuItem copyItem = new MenuItem("Copy");
        MenuItem pasteItem = new MenuItem("Paste");
        MenuItem cutItem = new MenuItem("Cut");

        MenuItem aboutItem = new MenuItem("About");

        winkenMenu.add(fiMenuItem);
        winkenMenu.add(zapMenuItem);
        winkenMenu.add(oxenMenuItem);

        blinkenMenu.add(copyItem);
        blinkenMenu.add(pasteItem);
        blinkenMenu.add(cutItem);

        nodMenu.add(aboutItem);

        menuBar.add(winkenMenu);
        menuBar.add(blinkenMenu);
        menuBar.add(nodMenu);

        setMenuBar(menuBar);
        setVisible(true);    
    }
    public static void main(String[] args) {
        new AWTMenuBar();
    }
}
