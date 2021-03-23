package swings;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Myframes extends JFrame implements MouseListener{
    JLabel l;
    JTextArea t;
    Container c;
    Myframes(){
        c=getContentPane();
        c.setLayout(null);
        l=new JLabel("MY label" );
        l.setFont(new Font("Tahoma",Font.BOLD,18));
        l.setBounds(50,70,100,30);
        l.addMouseListener(this);
        c.add(l);
        t=new JTextArea( );
        t.setFont(new Font("Tahoma",Font.BOLD,18));
        t.setBounds(200,50,300,300);
        c.add(t);
    }
    
    public void mouseClicked(MouseEvent s){
        t.setText(t.getText()+"\n"+"Key is Clicked"+"\n");
    }
    public void mouseEntered(MouseEvent s){
          t.setText(t.getText()+"\n"+"Key is Entered"+"\n");
    }
    public void mouseExited(MouseEvent s){
          t.setText(t.getText()+"\n"+"Key is Exited"+"\n");
    }
    public void mousePressed(MouseEvent s){
          t.setText(t.getText()+"\n"+"Key is Pressed"+"\n");
    }
    public void mouseReleased(MouseEvent s){
          t.setText(t.getText()+"\n"+"Key is Released"+"\n");
    }
    
    
} 
public class MouseEvent1 {
     public static void main(String[] args){
    Myframes m=new Myframes();
    m.setTitle("Mouse Listener/Mouse Event");
    m.setBounds(100,100,700,500);
    m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    m.setVisible(true);
}    
}
