package swings;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class DialogBox implements ActionListener {
     JFrame f;
     JPanel p;
     JDialog d;
    DialogBox(){
        f=new JFrame("JDialog");
          f.setSize(300,250);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
    f.setLocationRelativeTo(null);
    p=new JPanel();
    f.add(p);
    JButton b=new JButton("Click1");
    b.addActionListener(this);
    p.add(b);
    }
      public static void main(String[] args){
         new DialogBox();
     }
      public void actionPerformed(ActionEvent e){
         if(e.getActionCommand().equals("Click1")){
            showFirstDialog(); 
         }else if(e.getActionCommand().equals("Click2")){
             showSecondDialog();
         }
      }
      private void showFirstDialog(){
        d=new JDialog(f,"JDialog1");
          d.setSize(200,200);
          d.setVisible(true);
          d.add(new JLabel("this is JDialog"));
          JPanel p1=new JPanel();
          d.add(p1);
           JButton b1=new JButton("Click2");
            b1.addActionListener(this);   
            p.add(b1);
      }
       private void showSecondDialog(){
        JDialog d1=new JDialog(d,"JDialog2");
          d1.setSize(200,200);
          d1.setVisible(true);
          d1.add(new JLabel("this is second JDialog"));
           
      }
}
