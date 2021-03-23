package swings;
import java.awt.*;
import javax.swing.*;
public class MyTabbelPane {
      public static void main(String[] args){
        JFrame m=new JFrame("Tabbed Pane");
m.setLayout(null);
JTabbedPane t=new JTabbedPane();
t.setBounds(50,50,250,250);

JPanel p1,p2,p3;
p1=new JPanel();
p2=new JPanel();
p3=new JPanel();
p1.add(new JLabel("this is my first page"));
p2.add(new JLabel("this is my second page"));
p3.add(new JLabel("this is my third page"));
t.add("first",p1);
t.add("second",p2);
t.add("third",p3);
m.add(t);
m.setSize(400,500);
  m.setVisible(true);
    m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
      }
}
