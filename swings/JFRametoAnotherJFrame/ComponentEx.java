package swings.JFRametoAnotherJFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ComponentEx extends JComponent{
    protected void paintComponent(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(100, 0, 200, 200);
        
    }
    public static void main(String[] args){     
JFrame ro= new JFrame("Compponent");
         ro.setSize(400,400);
    ro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ro.setVisible(true);
    ro.setLocationRelativeTo(null);
    ComponentEx e=new ComponentEx();
    ro.getContentPane().add(e);
}
}