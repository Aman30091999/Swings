package swings;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
public class Dialog2{
     public static void main(String[] args){
           JFrame f=new JFrame();
    f.setTitle("Message Dialgo");
    f.setBounds(100,100,500,400);
    //f.setLocationRelativeTo(null);
     f.setVisible(true);
     f.setLayout(new FlowLayout());
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JButton b=new JButton("plan");
      f.add(b);
       JButton b1=new JButton("on Click");
      f.add(b1);
       b.addActionListener(new ActionListener (){
          public void actionPerformed(ActionEvent ae){
             JOptionPane.showMessageDialog(f, "information","Message",JOptionPane.PLAIN_MESSAGE);
          }
      });
       JButton b2=new JButton("Clicked");
      f.add(b2);
       b.addActionListener(new ActionListener (){
          public void actionPerformed(ActionEvent ae){
             JOptionPane.showMessageDialog(f, "hello","clicked Message",JOptionPane.QUESTION_MESSAGE);
          }
      });
       JButton b3=new JButton("error");
      f.add(b3);
       b.addActionListener(new ActionListener (){
          public void actionPerformed(ActionEvent ae){
             JOptionPane.showMessageDialog(f, "hello","error Message",JOptionPane.ERROR_MESSAGE);
          }
      });
       JButton b4=new JButton("warning");
      f.add(b4);
       b.addActionListener(new ActionListener (){
          public void actionPerformed(ActionEvent ae){
             JOptionPane.showMessageDialog(f, "hello","warning Message",JOptionPane.WARNING_MESSAGE);
          }
      });
      b.addActionListener(new ActionListener (){
          public void actionPerformed(ActionEvent ae){
             JOptionPane.showMessageDialog(f, "hello","Message",JOptionPane.PLAIN_MESSAGE);
          }
      });
}
}