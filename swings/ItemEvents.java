package swings;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame implements ItemListener{
    JComboBox combo; 
    JTextArea t;
    String[] values={"A","B","C"}; 
    public MyFrame(){
    Container c=getContentPane();
    c.setLayout(null);
    
    combo=new JComboBox(values);
    combo.setBounds(50,50,100,30);
    combo.addItemListener(this);
    c.add(combo);
    t=new JTextArea();
    t.setBounds(200,50,100,100);
    c.add(t);
    }
    public void itemStateChanged(ItemEvent arg0){
          t.setText(combo.getSelectedItem().toString());
    } 
    }
public class ItemEvents {
   
      
public static void main(String[] args){
    MyFrame f=new MyFrame();
    f.setTitle("ItemEvent");
    f.setBounds(100,100,400,400);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
}    
}
