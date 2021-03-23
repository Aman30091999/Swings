package swings;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFram extends JFrame implements ItemListener{
    JRadioButton male,female;
    JTextArea t;
    public MyFram(){
    Container c=getContentPane();
    c.setLayout(null);
    male=new JRadioButton("Male");
     female=new JRadioButton("FeMale");
     male.setBounds(50,50,100,20);
     female.setBounds(50,100,100,20);
     c.add(male);
     c.add(female);
     //create button group
     ButtonGroup g=new ButtonGroup();
     g.add(male);
     g.add(female);
     male.addItemListener(this);
     female.addItemListener(this);
    t=new JTextArea();
    t.setBounds(200,50,100,100);
    c.add(t);
    }
    public void itemStateChanged(ItemEvent e){
         if(e.getSource()==male){
             t.setText("You are male");
         }else if(e.getSource()==female){
             t.setText("Female");
         }
    } 
    }
public class ItemEvent2 {
    public static void main(String[] args){
    MyFram f=new MyFram();
    f.setTitle("ItemEvent");
    f.setBounds(100,100,400,400);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
}    
}
