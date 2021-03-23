package swings.JFRametoAnotherJFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JAppletEx extends JApplet implements ActionListener{
    JTextField t1;
    JButton b1;
    public void init(){//initalize Method.this is work on main method.
        setLayout(null);
        t1=new JTextField("");
        b1=new JButton("press me");
        t1.setBounds(20,20,100,30);
        b1.setBounds(30,60,100,20);
        add(t1);
        add(b1);
 b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        t1.setText("boom boom bam");
    }
}
