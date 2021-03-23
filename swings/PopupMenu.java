package swings;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
public class PopupMenu extends JFrame implements ActionListener{
    JPopupMenu pm;
    JMenuItem m1,m2,m3;
    PopupMenu(){
         setSize(500,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setLocationRelativeTo(null);
    setLayout(new FlowLayout());
    pm=new JPopupMenu();
    m1=new JMenuItem("item 1");
    m1.addActionListener(this);
     m2=new JMenuItem("item 2");
     m2.addActionListener(this);
      m3=new JMenuItem("item 3");
      m3.addActionListener(this);
      
      pm.add(m1);
      pm.add(m2);
      pm.add(m3);
      add(pm);
      pm.show(this,200,200);//container,x,y
      addMouseListener(new MouseAdapter(){
         public void mouseClicked(MouseEvent m){//clicked and perform a action
            if(m.getButton()==MouseEvent.BUTTON3){
                int x=m.getX();
                  int y=m.getY();
                pm.show(PopupMenu.this,x,y);
            }
         }
      });
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==m1){
          System.out.println("item1");  
        }
        else if(e.getSource()==m1){
              System.out.println("item1");
        }else if(e.getSource()==m1){
              System.out.println("item1");
        }
    }
     public static void main(String[] args){
         new PopupMenu();
     }
}
