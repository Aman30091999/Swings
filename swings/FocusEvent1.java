package swings;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Myframese extends JFrame implements FocusListener{
     JTextField l;
    JTextArea t;
    Container c;  
    Myframese(){      
         c=getContentPane();
        c.setLayout(null);
        l=new JTextField( );
        l.setFont(new Font("Tahoma",Font.BOLD,18));
        l.setBounds(50,100,100,30);
        l.addFocusListener(this);
        c.add(l);
        t=new JTextArea( );
        t.setFont(new Font("Tahoma",Font.BOLD,18));
        t.setBounds(200,50,300,300);
        c.add(t);
    }
     public void focusGained(FocusEvent s){
        t.setText(t.getText()+"\n"+"Focus Gained"+"\n");
    }
      public void focusLost(FocusEvent s){
        t.setText(t.getText()+"\n"+"Focus Lost"+"\n");
    }
} 
public class FocusEvent1 {
  public static void main(String[] args){
    Myframese m=new Myframese();
    m.setTitle("Focus Listener/Focus Event");
    m.setBounds(100,100,700,500);
    m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    m.setVisible(true);   
}
}