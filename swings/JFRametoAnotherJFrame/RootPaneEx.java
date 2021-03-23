package swings.JFRametoAnotherJFrame;
import javax.swing.*;
import javax.swing.text.*;
public class RootPaneEx extends JFrame{
    JRootPane r;
    RootPaneEx(){
        r=this.getRootPane();
        JButton b=new JButton("press");
        JMenuBar m=new JMenuBar();
        JMenu file=new JMenu("File");
        file.add("new File");
        file.add("open file");
        m.add(file);
        r.getContentPane().add(b);
        r.setMenuBar(m);
    }
    public static void main(String[] args){
        RootPaneEx ro= new RootPaneEx();
          ro.setSize(500,500);
    ro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ro.setVisible(true);
    ro.setLocationRelativeTo(null);
     }  
}
