package swings;
import javax.swing.*;
import java.awt.*;
public class DesktopPane extends JFrame {
    JDesktopPane dp;
    DesktopPane(){
        dp=new JDesktopPane();
        add(dp,BorderLayout.CENTER);
        display(dp);
        setSize(400,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setLocationRelativeTo(null);
    }
    public static void main(String[] args){
        new DesktopPane();
    }
    private void display( JDesktopPane dp){
        int num=3,x=30,y=30;
        for(int i=0;i<num;i++){
            JInternalFrame ii=new JInternalFrame("InternalFRAME"+(i+1),true,true,true,true);
            ii.setBounds(x,y,250,100);
            ii.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
            ii.add(new JLabel("i love"));
            ii.setVisible(true);
            dp.add(ii);
            y+=100;
            
        }
    }
}
