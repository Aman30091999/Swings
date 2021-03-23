package swings;
 import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class GridBagLa1 extends JFrame{//Grid Layout
     JButton b1=new JButton("PAGE START");
    JButton b2=new JButton("PAGE END");
    JButton b3=new JButton("LINe START"); 
    JButton b4=new JButton("CENTER");
    GridBagLa1(){
        setTitle("GridBagLayout");
    setBounds(300,200,500,300);
    setLocationRelativeTo(null);
     setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   GridBagLayout f=new GridBagLayout();
   
    
    Container c=getContentPane();
    c.setLayout(f);
   
       GridBagConstraints g=new GridBagConstraints();
        g.fill=GridBagConstraints.HORIZONTAL;
    g.weightx=0.5;//request for extra space
       g.gridx=0;
       g.gridy=0;
       c.add(b1,g);
     //  g.weightx=0;//reset not
        g.gridx=1;
       g.gridy=0;
       c.add(b2,g);
        g.gridx=2;
       g.gridy=0;
       c.add(b3,g);
        g.gridx=3;
       g.gridy=0;
       c.add(b4,g);
       pack();
    }
    public static void main(String[] args){
        new GridBagLa1();
    } 
}
