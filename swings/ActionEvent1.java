package swings;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
class Myframe extends JFrame implements ActionListener{
    Container c;
    JButton b;
    JTextField t;
Myframe(){
    c=getContentPane();
    c.setLayout(null);
    b=new JButton("Click");
    b.setBounds(100,100,100,30);
    b.addActionListener(this);
    c.add(b);
    t=new JTextField("Aman");
    t.setBounds(100,70,100,30);
    t.setFont(new Font("Tohoma",Font.BOLD,25));
    t.addActionListener(this);
    c.add(t);
    
}
public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==b){//event on buttton
        String s=b.getText();
        b.setText(s.toUpperCase());
    }
    if(ae.getSource()==t){//event on textarea
        String s=t.getText();
        t.setText(s.toUpperCase());
    }
}
}
public class ActionEvent1 {
public static void main(String[] args){
    Myframe m=new Myframe();
    m.setTitle("Action Listener/Action Event");
    m.setBounds(100,100,400,400);
    m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    m.setVisible(true);
}    
}
