package swings;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Myframess extends JFrame implements MouseMotionListener{
      JLabel l;
    JTextArea t;
    Container c;
    Myframess(){
         c=getContentPane();
        c.setLayout(null);
        l=new JLabel("MY label" );
        l.setFont(new Font("Tahoma",Font.BOLD,18));
        l.setBounds(50,70,100,30);
        l.addMouseMotionListener(this);
        c.add(l);
        t=new JTextArea( );
        t.setFont(new Font("Tahoma",Font.BOLD,18));
        t.setBounds(200,50,300,300);
        c.add(t);
    }
     public void mouseDragged(MouseEvent s){
        t.setText(t.getText()+"\n"+"Key is Dragged"+"\n");
    }
      public void mouseMoved(MouseEvent s){
        t.setText(t.getText()+"\n"+"Key is Moved"+"\n");
    }
}
public class MouseMotion1 {
     public static void main(String[] args){
    Myframess m=new Myframess();
    m.setTitle("Mouse Motion Listener/Mouse Motion Event");
    m.setBounds(100,100,700,500);
    m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    m.setVisible(true);
}    
}
