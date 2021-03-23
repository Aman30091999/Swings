package swings;
import java.awt.*;
import javax.swing.*;

public class BorderLa {//Border Layout
    public static void main(String[] args){
        JFrame m=new JFrame("Border Layout");
    m.setTitle("BorderLayout");
    m.setBounds(300,200,500,300);
    m.setLocationRelativeTo(null);
     m.setVisible(true);
    m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    
    Container c=m.getContentPane();
    JButton b1=new JButton("PAGE START");
    JButton b2=new JButton("PAGE END");
    JButton b3=new JButton("LINe START"); 
    JButton b4=new JButton("CENTER");
    JButton b5=new JButton("LINE END");
    c.add(b1,BorderLayout.PAGE_START);
     c.add(b2,BorderLayout.PAGE_END);
      c.add(b3,BorderLayout.LINE_START);
       c.add(b4,BorderLayout.CENTER);
        c.add(b5,BorderLayout.LINE_END);
    }
}
