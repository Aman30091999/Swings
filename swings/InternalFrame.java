package swings;
import javax.swing.*;
import java.awt.*;
public class InternalFrame extends JFrame{
   InternalFrame(){
       setLayout(null);
       JInternalFrame i=new JInternalFrame("JInternalFrame",true,true,true,true);
       initFrame(i);//method
       add(i);
    setSize(400,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setLocationRelativeTo(null);
    }
     public static void main(String[] args){
         new InternalFrame();
     }
     private void initFrame(JInternalFrame i){
         i.setSize(300,200);
         i.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
         i.setLocation(50, 50);
         i.setVisible(true);
         i.add(new JButton("my button"));
     }
}
