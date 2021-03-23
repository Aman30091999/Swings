package swings;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Myfram extends JFrame implements KeyListener{
    JTextArea t;
    Myfram(){
        Container c=getContentPane();
        c.setLayout(null);
        
        t=new JTextArea();
        t.setBounds(10,10,370,330);
        t.addKeyListener(this);
        c.add(t);
    }
    public void keyPressed(KeyEvent kp){
        t.setText(t.getText()+"\n"+"Key is Pressed"+"\n"+kp.getKeyChar());
    }
    public void keyReleased(KeyEvent kr){
        t.setText(t.getText()+"\n"+"Key is Released"+"\n"+kr.getKeyChar());
    }
    public void keyTyped(KeyEvent kt){
        t.setText(t.getText()+"\n"+"Key is Typed"+"\n"+kt.getKeyChar());
    }
}
public class KeyEvent1 {
    public static void main(String[] args){
    Myfram m=new Myfram();
    m.setTitle("Key Listener/Key Event");
    m.setBounds(100,100,400,400);
    m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    m.setVisible(true);
}    
}
