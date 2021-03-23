package swings.JFRametoAnotherJFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
public class JTreeEx {
  public static void main(String[] args){     
JFrame ro= new JFrame("JTree Example");
         ro.setSize(400,400);
    ro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
   DefaultMutableTreeNode rt=new DefaultMutableTreeNode("Top");
   DefaultMutableTreeNode a=new DefaultMutableTreeNode("A");
   DefaultMutableTreeNode b=new DefaultMutableTreeNode("B");
   DefaultMutableTreeNode a1=new  DefaultMutableTreeNode("A1"); 
   DefaultMutableTreeNode a2=new  DefaultMutableTreeNode("A2");
DefaultMutableTreeNode b1=new DefaultMutableTreeNode("B1");
DefaultMutableTreeNode b2=new DefaultMutableTreeNode("B2");
DefaultMutableTreeNode b3=new DefaultMutableTreeNode("B3");
a.add(a1);
a.add(a2);
     b.add(b1);       
     b.add(b2);     
     b.add(b3);
      rt.add(a);
      rt.add(b);
      
        JTree t=new JTree(rt);
        ro.add(t);
        ro.setVisible(true);
}    
}
