package swings;
import java.awt.*;
import javax.swing.*;

public class ScrollPaneEx {
      public static void main(String[] args){
        JFrame m=new JFrame("ScrollPane");
m.setLayout(new FlowLayout());
JTextArea t=new JTextArea(10,15);
JScrollPane s=new JScrollPane(t,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

m.add(s);
 m.setSize(400,500);
  m.setVisible(true);
    m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    
      }}
