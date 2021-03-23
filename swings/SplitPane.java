package swings;
import java.awt.*;
import javax.swing.*;
public class SplitPane extends JFrame{
    SplitPane(){
        setTitle("Split Pane");
    setSize(400,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setLocationRelativeTo(null); 
    JButton b=new JButton("LEFT");
     JButton b1=new JButton("RIGHT");
     JSplitPane s=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
     s.setTopComponent(b);
     s.setBottomComponent(b1);
     s.setDividerSize(10);
     s.setDividerLocation(100);
     s.setOneTouchExpandable(true);
     add(s);
    }
      public static void main(String[] args){      
new SplitPane();
}
}