package swings;
import javax.swing.*;
public class TootipEx extends JFrame {
    TootipEx(){
        setLayout(null);
        JLabel l=new JLabel("Password ");
        l.setBounds(50,100,80,30);
        add(l);
        
        JPasswordField p=new JPasswordField();
        p.setBounds(140,100,100,30);
        add(p);
        p.setToolTipText("Enter yuor password");
        
         setSize(400,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    }
     public static void main(String[] args){
         new TootipEx();
     }
}
