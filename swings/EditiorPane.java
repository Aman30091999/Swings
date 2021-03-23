package swings;
import javax.swing.*;
import java.awt.*;
public class EditiorPane extends JFrame{
    JEditorPane p;
    EditiorPane(){
        p=new JEditorPane();
        p.setContentType("text/html");//define text type
        p.setText("<html>"
                + "<li>aman</li>"
                 + "<li>aman1</li>"
                 + "<li>aman2</li>"
        +"</html>");//declare a text of content type
        add(p,BorderLayout.CENTER);
        
         setSize(400,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setLocationRelativeTo(null);
    }
    public static void main(String[] args){
        new EditiorPane();
    }
}
