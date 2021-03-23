package swings.JFRametoAnotherJFrame;
import java.awt.Color;
import javax.swing.*;
public class LayeredPaneEx extends JFrame{
    JLayeredPane jl;
    LayeredPaneEx(){
        jl=this.getLayeredPane();
        JButton b1=new JButton("press");
        b1.setBounds(20,20,50,50);
        b1.setBackground(Color.red);
        JButton b2=new JButton("press1");
         b2.setBounds(40,40,50,50);
        b2.setBackground(Color.green);
        JButton b3=new JButton("press2");
         b3.setBounds(60,60,50,50);
        b3.setBackground(Color.blue);
        jl.add(b1,new Integer(3));
          jl.add(b2,new Integer(2));
            jl.add(b3,new Integer(1));
    }
     public static void main(String[] args){
        LayeredPaneEx ro= new LayeredPaneEx();
         ro.setSize(400,400);
    ro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ro.setVisible(true);
    ro.setLocationRelativeTo(null);
}
}