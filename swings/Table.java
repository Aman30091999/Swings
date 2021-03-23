package swings;
import java.awt.*;
import javax.swing.*;
public class Table {
    public static void main(String[] args){
        String[][]data={
            {"101","ram","21"},
            {"102","raram","22"},
            {"103","rama","23"}
    };
        String[] cname={"roll","name","age"};
        JTable t=new JTable(data,cname);
        
    JFrame r=new JFrame("Table");
    r.add(new JScrollPane(t));
    r.setSize(400,400);
    r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    r.setVisible(true);
}
}