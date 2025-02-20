import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    Image image;
    MyPanel(){
        image = new ImageIcon("chikawa.jpg").getImage();
        this.setPreferredSize(new Dimension(711,500));
    }
    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;

        g2D.setPaint(Color.blue);
        g2D.setStroke(new BasicStroke(5));//Stroke 笔刷
        g2D.drawImage(image,0,0,null);
       // g2D.drawLine(0,0,500,500);//startx start y end x end y
        g2D.setPaint(Color.pink);
        /*Rectangle*/
        //g2D.drawRect(0,0,200,150);//x y width height
        //g2D.fillRect(0,0,200,200);
        /*Oval椭圆形*/
        g2D.setPaint(Color.red);
        /*x: 椭圆的左上角的x坐标。
          y: 椭圆的左上角的y坐标。
      width: 外接矩形的宽度，表示椭圆的水平直径（即椭圆的宽度）。
     height: 外接矩形的高度，表示椭圆的垂直直径（即椭圆的高度）。*/
        //g2D.drawOval(0,0,100,100);
        //g2D.fillOval(0,0,100,100);
        //g2D.drawArc(0,0,100,100,0,180);
        //g2D.fillArc(0,0,100,100,0,180);
        //g2D.setPaint(Color.white);
        //g2D.fillArc(0,0,100,100,180,180);
        int[] xPoints = {150,250,350};
        int[] yPoints = {300,150,300};
        g2D.setPaint(Color.black);
        //g2D.drawPolygon(xPoints,yPoints,3);
        //g2D.fillPolygon(xPoints,yPoints,3);
        g2D.setFont(new Font("Ink Free",Font.BOLD,50));
        g2D.drawString("Adorable Chikawa !",150,80);
        g2D.setPaint(Color.orange);
        g2D.fillOval(600,400,100,100);
        g2D.fillArc(0,400,100,100,0,180);
        g2D.fillArc(0,500,100,100,180,180);
        g2D.fillRect(0,0,100,100);
        g2D.fillRect(611,0,100,100);
    }
}
