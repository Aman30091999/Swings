package swings.JFRametoAnotherJFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ColorChooserEx {
     public static void main(String[] args){     
JFrame ro= new JFrame();
         ro.setSize(400,400);
    ro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ro.setVisible(true);
    ro.setLocationRelativeTo(null);
    final Container c=ro.getContentPane();
    c.setLayout(new GridBagLayout());
    JButton b1=new JButton("Change Color");
    c.add(b1);
     b1.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent a){
           Color color=  JColorChooser.showDialog(null, "ColorChoooser", Color.black);
           c.setBackground(color);
         }
     });
    ro.revalidate();
}
}
