package swings;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class NewTableRow {
      public static void main(String[] args){
         new Tablees();
     }
}
  class Tablees extends JFrame implements ActionListener{
    JTextField t1,t2,t3;
     DefaultTableModel ma;
    JButton b1,b2,b3;
    JTable t;
    Tablees(){
    setSize(500,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
     String[][]data={
            {"101","ram","21"},
            {"102","raram","22"},
            {"103","rama","23"}
    };
        String[] cname={"roll","name","age"};
          ma=new DefaultTableModel(data,cname);
        t=new JTable(ma);
        setLayout(new GridLayout(3,1));
       JPanel p=new JPanel();
       add(new JScrollPane(t));
       add(new JPanel());
       add(p);
       t1=new JTextField();
        t2=new JTextField();
         t3=new JTextField();
         b1=new JButton("Add");
         b1.addActionListener(this);
          b2=new JButton("Update");
          b2.addActionListener(this);
           b3=new JButton("Delete");
           b3.addActionListener(this);
         p.setLayout(new GridLayout(3,3));
         p.add(new Label("rollno"));
         p.add(t1);
         p.add(b1);
          p.add(new Label("Name"));
         p.add(t2);
         p.add(b2);
          p.add(new Label("Age"));
         p.add(t3);
         p.add(b3);
         validate();
       
          t.addMouseListener(new MouseAdapter(){
              @Override
             public void mouseClicked(MouseEvent m){
                 int rowIndex=t.getSelectedRow();
                 
                 int r=(int)ma.getValueAt(rowIndex, 0);
                  String name=(String)ma.getValueAt(rowIndex, 1);
                   int age=(int)ma.getValueAt(rowIndex, 2);
                   t1.setText(String.valueOf(r));
                     t2.setText(name);
                       t3.setText(String.valueOf(age));
             }
         });
}
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            if(t1.getText().toString().isEmpty()||t2.getText().toString().isEmpty()||t3.getText().toString().isEmpty()){
                JOptionPane.showMessageDialog(null, "Fill all Details","Error",JOptionPane.ERROR_MESSAGE);
            }else{
            int r=Integer.parseInt(t1.getText().toString());
            String name=t2.getText().toString();
            int age=Integer.parseInt(t3.getText().toString());
          Object[] newrow={r,name,age};
          ma.addRow(newrow);
          t1.setText(null);
          t2.setText(null);
          t3.setText(null);}
    }
    }
    
         
  }