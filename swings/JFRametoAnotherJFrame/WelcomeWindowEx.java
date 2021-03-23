package swings.JFRametoAnotherJFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class WelcomeWindowEx extends JFrame {
    Timer t;
    WelcomeWindowEx(){
        displaywelcomeScreen();
        setSize(500,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //setVisible(true);
    setLocationRelativeTo(null);
    JLabel l=new JLabel("Welcome in Travel & Tourasim Manangement");
    l.setFont(new Font("Tahoma",Font.BOLD,20));
    l.setHorizontalAlignment(SwingConstants.CENTER);
    add(l);
    }
    public static void main(String[] args){
         new WelcomeWindowEx();
}
    public void displaywelcomeScreen(){
        final JWindow w=new JWindow(this);
        w.setSize(400,400);
        w.setLocationRelativeTo(null);
        w.setVisible(true);
        w.setVisible(true);
         JPanel p1=new JPanel();
         w.add(p1);
         JLabel l1=new JLabel(new ImageIcon(ClassLoader.getSystemResource("swings/JFRametoAnotherJFrame/login.png")));
         l1.setHorizontalAlignment(SwingConstants.CENTER);
         p1.add(l1);
        //p1.setBackground(Color.WHITE);
        p1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        //p1.add(new JLabel("this is a window"));
        JProgressBar pb=new JProgressBar(0,100);
        w.add(BorderLayout.PAGE_END,pb);
        w.revalidate();
        t=new Timer(100,new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int x=pb.getValue();
                if(x==100){
                    w.dispose();
                    WelcomeWindowEx.this.setVisible(true);
                    t.stop();
                }
                else{
                    pb.setValue(x+4);
                }
            }
        });
        t.start();
    }
}