package swings.JFRametoAnotherJFrame;
import javax.swing.*;
import java.awt.event.*;
public class Caller {
 public static void main(String[] args){
         new X();
     }   
}
class X extends JFrame implements ActionListener{
JFrame f1,f2; 
public X(){
     f1=new JFrame("First JFrame");
          f1.setSize(400,400);
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f1.setVisible(true);
    f1.setLocationRelativeTo(null);
    JButton b1=new JButton("Login");
    JLabel l1 =new JLabel("Message show");
    JPanel p=new JPanel();
    p.add(b1);
    p.add(l1);
    f1.add(p);
     b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e){
    f2=new JFrame("Second JFrame");
    f2.setSize(400,200);
    f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    f2.setVisible(true);
    f2.setLocationRelativeTo(f1);
    JTextField t=new JTextField();
    t.setColumns(20);
    JButton b2=new JButton("Clicked");
     JPanel p1=new JPanel();
    p1.add(b2);
    b2.addActionListener(this);
    p1.add(t);
    f2.add(p1);
}
}
