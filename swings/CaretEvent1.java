package swings;

import java.awt.Container;
import java.awt.*;
import javax.swing.*;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
class Myframeses extends JFrame implements CaretListener{
     JTextField l;
    JTextArea t;
    Container c;  
    Myframeses(){      
         c=getContentPane();
        c.setLayout(null);
        l=new JTextField( );
        l.setFont(new Font("Tahoma",Font.BOLD,18));
        l.setBounds(50,100,100,30);
        l.addCaretListener(this);
        c.add(l);
        t=new JTextArea( );
        t.setFont(new Font("Tahoma",Font.BOLD,18));
        t.setBounds(200,50,300,300);
        c.add(t);
    }
    public void caretUpdate(CaretEvent c){
        t.setText(t.getText()+"\n"+"caret updated"+c.getDot()+" : "+c.getMark());
    }
    
} 
public class CaretEvent1 {//caret=Mouse cursor
    
 public static void main(String[] args){
    Myframeses m=new Myframeses();
    m.setTitle("Caret Listener/Caret Event");
    m.setBounds(100,100,700,500);
    m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    m.setVisible(true);   
}
}
