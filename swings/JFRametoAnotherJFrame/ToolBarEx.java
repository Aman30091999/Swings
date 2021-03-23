package swings.JFRametoAnotherJFrame;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;
public class ToolBarEx {
    JToolBar t=new JToolBar();
    JButton b1=new JButton("click");
    JButton b2=new JButton("click2");
    JTextField tf=new JTextField();
    JComboBox b=new JComboBox(new String[]{"Item1","i2","i3","i4"});
    ToolBarEx(){
        JFrame f=new JFrame("ToolBar");
       f.setSize(400,400);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
    f.setLocationRelativeTo(null);
    t.add(b);
    t.add(tf);
    t.add(b1);
    t.addSeparator();
    t.add(b2);
    t.setFloatable(false);
    f.add(BorderLayout.NORTH,t);
    f.revalidate();
    }
    public static void main(String[] args){
         new ToolBarEx();
     }   
}
