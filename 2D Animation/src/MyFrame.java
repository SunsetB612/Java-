import javax.swing.*;

public class MyFrame extends JFrame {
    MyPanel panel;
    ImageIcon icon = new ImageIcon("ufo.png");
    MyFrame(){
        panel = new MyPanel();

        this.setIconImage(icon.getImage());
        this.setTitle("UFO");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
