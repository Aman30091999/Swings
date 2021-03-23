package swings.JFRametoAnotherJFrame;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
public class WindowEx extends JFrame implements ActionListener{
    public static void main(String[] args){
         new WindowEx();
     }   
    WindowEx(){
       setSize(400,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setLocationRelativeTo(null);
    JButton b=new JButton("Click");
     JPanel p=new JPanel();
    p.add(b);
    add(p);
     b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        final JWindow w=new JWindow(this);
        w.setSize(300,200);
        w.setLocationRelativeTo(null);
        w.setVisible(true);
        JPanel p1=new JPanel();
        p1.setBackground(Color.YELLOW);
        p1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        p1.add(new JLabel("this is a window"));
        w.add(p1);
        w.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
               if(e.getClickCount()==2){
                   w.dispose();
               }
            }
        });
    }
}
