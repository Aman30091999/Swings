package swings;
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class Slider extends JFrame implements ChangeListener{
    JSlider s;
    JLabel l;
    Slider(){
        setLayout(new FlowLayout());
      s=new JSlider();
      add(s);
      s.setMinimum(0);
      s.setMaximum(200);
      s.setPaintTicks(true);
       s.setPaintLabels(true);
       s.setMajorTickSpacing(50);
        s.setMinorTickSpacing(5);
        s.addChangeListener(this);
        l=new JLabel();
        l.setText("the value of slider"+s.getValue());
        add(l);
          setSize(400,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setLocationRelativeTo(null);
    }
      public static void main(String[] args){
         new Slider();
     }
      public void stateChanged(ChangeEvent e){
          l.setText("the value of slider"+s.getValue());
      }
}
