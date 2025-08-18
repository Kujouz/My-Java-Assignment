import java.awt.*;

public class AWTMenu extends Frame {

    public AWTMenu() {
        setTitle("Question 1 - AWT Menu Bar");
        setSize(400, 400);
        setLayout(new FlowLayout());

        MenuBar menuBar = new MenuBar();

        // Create Menus
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");

        // Create Menu Items
        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");

        MenuItem cutItem = new MenuItem("Cut");
        MenuItem copyItem = new MenuItem("Copy");
        MenuItem pasteItem = new MenuItem("Paste");
        MenuItem selectallItem = new MenuItem("Select All");

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        editMenu.add(selectallItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        setMenuBar(menuBar);
        setVisible(true);
    }
    public static void main(String[] args){
        new AWTMenu();
    }
}
