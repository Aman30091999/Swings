package swings;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
class Myframe1 extends JFrame implements WindowListener{
     
    Myframe1(){  
   this.addWindowListener(this);
    
    }
    public void windowOpened(WindowEvent a){
        System.out.println("Window opened");
    }
    public void windowClosing(WindowEvent a){
         System.out.println("Window Closing");
    }
    public void windowClosed(WindowEvent a){
         System.out.println("Window Closed");
    }
    public void windowIconified(WindowEvent a){
         System.out.println("Window Iconified");
    }
    public void windowDeiconified(WindowEvent a){
         System.out.println("Window Deiconified");
    }
    public void windowActivated(WindowEvent a){
         System.out.println("Window Activate");
    }
    public void windowDeactivated(WindowEvent a){
         System.out.println("Window Deactivate");
    }
}
public class WindowEvent1 {
       
 public static void main(String[] args){
    Myframe1 m=new Myframe1();
    m.setTitle("Window Listener/Window Event");
    m.setBounds(100,100,700,500);
    m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    m.setVisible(true);   
}
}
