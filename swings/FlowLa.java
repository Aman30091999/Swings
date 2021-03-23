
package swings;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class FlowLa extends JFrame{//Flow Layout
     JButton b1=new JButton("PAGE START");
    JButton b2=new JButton("PAGE END");
    JButton b3=new JButton("LINe START"); 
    JButton b4=new JButton("CENTER");
    FlowLa(){
        setTitle("FlowLayout");
    setBounds(300,200,500,300);
    setLocationRelativeTo(null);
     setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    
    Container c=getContentPane();
    c.add(b1);
     c.add(b2);
      c.add(b3);
       c.add(b4);
       FlowLayout f=new FlowLayout();
       c.setLayout(f);
    }
    public static void main(String[] args){
        new FlowLa();
    } 
}
