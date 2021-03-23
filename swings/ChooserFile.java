package swings;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import java.io.*;
import java.awt.*;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javax.swing.JFrame;
public class ChooserFile extends JFrame{
    private Button b1;
    private  ListView lv;
    public void actioPerformed(ActionEvent ae){
         FileChooser f=new FileChooser();
        File s=f.showOpenDialog(null);//file type not define
        if(s!=null){//May be file selected
            lv.getItems().add(s.getAbsoluteFile());
        }else{
            System.out.println("no file");
        }
    }
    public static void main(String[] args){
     new ChooserFile().setVisible(true);   
    }
}
