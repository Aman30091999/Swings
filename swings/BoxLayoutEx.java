package swings;
import java.awt.*;
import javax.swing.*;
public class BoxLayoutEx {
     public static void main(String[] args){
           JFrame f=new JFrame();
    f.setTitle("BoxLayout");
    f.setBounds(100,100,500,400);
    //f.setLocationRelativeTo(null);
     f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
     Container c=f.getContentPane();
     BoxLayout b=new BoxLayout(c,BoxLayout.X_AXIS);//Y_AXIS,CENTER
     c.setLayout(b);
     JButton b11=new JButton("START");
    JButton b21=new JButton("END");
    JButton b31=new JButton("sSTART"); 
    JButton b41=new JButton("CENTER");
     c.add(b11);
     c.add(b21);
      c.add(b31);
       c.add(b41);
     }
}
