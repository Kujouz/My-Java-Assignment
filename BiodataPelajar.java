import java.awt.*;

public class BiodataPelajar extends Frame{
    public BiodataPelajar(String str){
        super(str);
        //Set the frame layout to flow layout
        setLayout(new FlowLayout());

        Label nameLabel = new Label("Nama: ");
        TextField tname = new TextField(20);

        Label semLabel = new Label("Semester: ");
        TextField tsem = new TextField(4);

        Label icLabel = new Label("No.Kad Pengenalan: ");
        TextField tic = new TextField(12);

        Label telLabel = new Label("No.Telefon: ");
        TextField ttel = new TextField(15);

        Label raceLabel = new Label ("Kaum: ");
        Choice pilihan = new Choice();
        pilihan.add("Malay");
        pilihan.add("Chinese");
        pilihan.add("Indian");
        pilihan.add("Others");
        pilihan.select("Please select your race");

        Button okButton = new Button("OK");
        Button cancelButton = new Button("Cancel");

        add(nameLabel);
        add(tname);
        add(semLabel);
        add(tsem);
        add(icLabel);
        add(tic);
        add(telLabel);
        add(ttel);
        add(raceLabel);
        add(pilihan);
        add(okButton);
        add(cancelButton);
    }
}
