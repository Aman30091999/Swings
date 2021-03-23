package swings.JFRametoAnotherJFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JViewPortEx {
    public static void main(String[] args){     
JFrame ro= new JFrame();
         ro.setSize(500,500);
    ro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ro.setLocationRelativeTo(null);
    ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("swings/JFRametoAnotherJFrame/17.jpg"));
    JLabel l=new JLabel(i);
    JScrollPane s=new JScrollPane(l);
    s.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    s.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
    ro.add(s);
    ro.setVisible(true);
    s.setViewportBorder(BorderFactory.createLineBorder(Color.red));
 JViewport v=s.getViewport(); 
 JButton m=new JButton("MOve up");
 JButton m1=new JButton("MOve Down");

 JButton m2=new JButton("MOve Left");
 JButton m3=new JButton("MOve Right");
 JPanel p=new JPanel();
 p.add(m);
 p.add(m1);
 p.add(m2);
 p.add(m3);
 ro.add(p,BorderLayout.NORTH);
 m.addActionListener(new ActionListener(){//top origin
      public void actionPerformed(ActionEvent e){
        Point origin=v.getViewPosition();
        origin=new Point(origin.x,origin.y-100);
        v.setViewPosition(origin);
    }
 });
 m1.addActionListener(new ActionListener(){//Down origin
      public void actionPerformed(ActionEvent e){
        Point origin=v.getViewPosition();
        origin=new Point(origin.x,origin.y+100);
        v.setViewPosition(origin);
    }
 });
 m2.addActionListener(new ActionListener(){//Left origin
      public void actionPerformed(ActionEvent e){
        Point origin=v.getViewPosition();
        origin=new Point(origin.x-100,origin.y);
        v.setViewPosition(origin);
    }
 });
 m3.addActionListener(new ActionListener(){//Right origin
      public void actionPerformed(ActionEvent e){
        Point origin=v.getViewPosition();
        origin=new Point(origin.x+100,origin.y);
        v.setViewPosition(origin);
    }
 });
}
   
}