package swings.JFRametoAnotherJFrame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GlassPaneEx {
  public static void main(String[] args){     
JFrame ro= new JFrame();
         ro.setSize(400,400);
    ro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    ro.setLocationRelativeTo(null);
    JPanel p1=new JPanel();
   final JLabel l=new JLabel("Glass Pane Example");
    JButton b1=new JButton("Clickme");
     JButton b2=new JButton("Show");
     p1.add(l);
     p1.add(b1);
     p1.add(b2);
     ro.getContentPane().add(p1);
     ro.setVisible(true);
     b1.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent a){
             l.setVisible(!l.isVisible());
         }
     });
     ro.setGlassPane(new JComponent(){
        protected void paintComponent(Graphics g){
            g.setColor(new Color(0,0,0,150));
            g.fillRect(0, 0,getWidth(), getHeight());
        }
     });
     final Container gp=(Container)ro.getGlassPane();
     gp.setLayout(new GridBagLayout());
     JButton b3=new JButton("HIDE");
     gp.add(b3); 
     gp.addMouseListener(new MouseAdapter(){
        
     });
     b2.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent a){
            gp.setVisible(true);
         }
     });
     b3.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent a){
             gp.setVisible(false);
         }
     });
     
}
}