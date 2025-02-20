import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.security.Key;

public class MyFrame extends JFrame implements ActionListener {
    JMenuBar menuBar;

    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;

    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    ImageIcon fileicon = new ImageIcon("file.png");
    ImageIcon editicon = new ImageIcon("edit.png");
    ImageIcon helpicon = new ImageIcon("help.png");
    ImageIcon loadicon = new ImageIcon("load.png");
    ImageIcon saveicon = new ImageIcon("save.png");
    ImageIcon exiticon = new ImageIcon("exit.png");

    MyFrame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        fileMenu.setIcon(fileicon);
        editMenu.setIcon(editicon);
        helpMenu.setIcon(helpicon);
        loadItem.setIcon(loadicon);
        saveItem.setIcon(saveicon);
        exitItem.setIcon(exiticon);

        fileMenu.setMnemonic(KeyEvent.VK_F);// alt + f to file
        editMenu.setMnemonic(KeyEvent.VK_E);// alt + d to edit
        helpMenu.setMnemonic(KeyEvent.VK_H);// alt + h to help
        loadItem.setMnemonic(KeyEvent.VK_L);// l to load
        saveItem.setMnemonic(KeyEvent.VK_S);// s to save
        exitItem.setMnemonic(KeyEvent.VK_E);// e to exit

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loadItem){
            System.out.println("You loaded the file.");
        }else if (e.getSource()==saveItem){
            System.out.println("You saved the file.");
        }else if (e.getSource()==exitItem){
            System.exit(0);
        }
    }
}
