package swings;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class TableMethod {
     public static void main(String[] args){
         new Tables();
     }
}
class Tables extends JFrame{
    JTable t;
    Tables(){
    setSize(500,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
     String[][]data={
            {"101","ram","21"},
            {"102","raram","22"},
            {"103","rama","23"}
    };
        String[] cname={"roll","name","age"};
        DefaultTableModel ma=new DefaultTableModel(data,cname);
        t=new JTable(ma);
        add(new JScrollPane(t));
        validate();//for refreshment
}}
