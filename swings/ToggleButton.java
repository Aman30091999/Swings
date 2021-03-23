package swings;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ToggleButton extends JFrame implements ActionListener{
    private Color defaultColor;
    JToggleButton t;
     Container c;
    ToggleButton(){
         setSize(500,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setLocationRelativeTo(null);
   c=getContentPane();
    c.setLayout(null);
    defaultColor=c.getBackground();
    
    t=new JToggleButton("OFF"); 
    t.setBounds(200,200,100,50);
    c.add(t);
    t.addActionListener(this);
    }
     public static void main(String[] args){
         new ToggleButton();
     }
     public void actionPerformed(ActionEvent e){
         if(t.isSelected()){
             c.setBackground(Color.RED);
             t.setText("ON");
         }
         else{
             c.setBackground(Color.CYAN);
              t.setText("OFF");
         }
     }
}
