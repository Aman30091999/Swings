package swings;
import javax.swing.*;
public class MyMenuBar{
    public static void main(String[] args){
        JFrame f=new JFrame("MenuBar");
        f.setSize(600,500);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menubar=new JMenuBar();
        //create menu
        JMenu file=new JMenu("File");
        //create menu item 
        JMenuItem i1=new JMenuItem("New");
        JMenuItem i2=new JMenuItem("Open");
        JMenuItem i3=new JMenuItem("Save");
        
        file.add(i1);
        file.add(i2);
        file.add(i3);//add menuitem in menu
        menubar.add(file);//add menu in menubar
        
        JMenu edit=new JMenu("Edit");
        JMenuItem i4=new JMenuItem("Undo");
        JMenuItem i5=new JMenuItem("Redo");
        edit.add(i4);
        edit.add(i5);
        file.add(edit);
        
        f.setJMenuBar(menubar);//frame add menubar
       f.setVisible(true);
    }
}
