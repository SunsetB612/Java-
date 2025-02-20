import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 1120;
    final int PANEL_HEIGHT = 513;

    Image enemy;
    Image background;
    Timer timer;
    int xVeloctiy = 4;
    int yVeloctiy = 2;
    int x = 0;
    int y = 0;
    MyPanel(){

        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.blue);

        enemy = new ImageIcon("ufo.png").getImage();
        background = new ImageIcon("space.jpg").getImage();

        timer = new Timer(1,this);//delay(ms) and listener
        //1000 milliseconds means that we'll perform an action every 1000 milliseconds
        //the second parameter means an action listener
        timer.start();

    }
    public void paint(Graphics g){
        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(background,0,0,null);
        g2D.drawImage(enemy,x,y,null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(x >= PANEL_WIDTH-enemy.getWidth(null)||x < 0){
            xVeloctiy = xVeloctiy * (-1);
        }
        x = x + xVeloctiy;
        if(y >= PANEL_HEIGHT-enemy.getHeight(null)||y < 0){
            yVeloctiy = yVeloctiy * (-1);
        }
        y = y + yVeloctiy;

        repaint();
    }
}
