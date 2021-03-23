package swings;
import javax.swing.*;
import java.awt.*;
public class SeparatorEx extends JFrame{//this is used to divide a two components.
    //draw line Horizontal and virtical.
     SeparatorEx(){
    setTitle("JSeprator");
    setSize(400,400);
    setLocationRelativeTo(null);
     setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   JPanel p=new JPanel();
   p.setLayout(new GridLayout(0,1));
   p.add(new JLabel("my forst label"));
   p.add(new JSeparator(SwingConstants.VERTICAL));
    p.add(new JLabel("my second label"));
    add(p);
     }
     public static void main(String[] args){
           new SeparatorEx();
     }
}
