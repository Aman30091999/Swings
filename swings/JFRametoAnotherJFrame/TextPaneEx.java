package swings.JFRametoAnotherJFrame;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
public class TextPaneEx {
    TextPaneEx(){
        JFrame f=new JFrame("TextPane");
       f.setSize(400,400);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
    f.setLocationRelativeTo(null);
    JTextPane tp=new JTextPane();
    
    SimpleAttributeSet atr=new SimpleAttributeSet();
    StyleConstants.setBold(atr, true);
    tp.setCharacterAttributes(atr, true);
    tp.setText("welcome in my house");
    Document doc=tp.getStyledDocument();
    try{
    doc.insertString(doc.getLength(), "Welcome ", atr);}
    catch(BadLocationException e){
        
    }
    f.getContentPane().add(tp);
    
    f.revalidate();
    }
 public static void main(String[] args){
         new TextPaneEx();
     }      
}
