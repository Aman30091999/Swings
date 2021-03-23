package swings;
 import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CardLayEx {
    public static void main(String[] args){
    JFrame f=new JFrame();
    f.setTitle("CardLayout");
    f.setBounds(300,200,500,300);
    f.setLocationRelativeTo(null);
     f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    CardLayout d=new CardLayout();
     Container c=f.getContentPane();
    c.setLayout(d);
     JButton b1=new JButton("PAGE START");
    JButton b2=new JButton("PAGE END");
    JButton b3=new JButton("LINe START"); 
    JButton b4=new JButton("CENTER");
    c.add(b1,"1");
     c.add(b2,"2");
      c.add(b3,"3");
       c.add(b4,"4");
       d.next(c);
       d.previous(c);
}
}