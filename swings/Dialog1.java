package swings;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
public class Dialog1{
     public static void main(String[] args){
           JFrame f=new JFrame();
    f.setTitle("BoxLayout");
    f.setBounds(100,100,500,400);
    //f.setLocationRelativeTo(null);
     f.setVisible(true);
     f.setLayout(new FlowLayout());
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JButton b=new JButton("on Cllick");
      f.add(b);
     
      b.addActionListener(new ActionListener (){
          public void actionPerformed(ActionEvent ae){
              JOptionPane.showInputDialog("Enter your name");
          }
      });
}
}