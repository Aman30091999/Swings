package swings;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class SpinnerEx extends JFrame implements ChangeListener{
    JSpinner s1,s2,s3;
    SpinnerModel m1,m2,m3;
    JLabel l=new JLabel();
    String[] me={"jan","feb","march","April","May","June","JUly","Aug","Sep","Nov","Dec"};
    SpinnerEx(){
         setTitle("JSpinner");
    setSize(400,400);
    setLocationRelativeTo(null);
     setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
    m1=new SpinnerNumberModel(1,1,31,1);//date
    m2=new SpinnerListModel(me);
    String str=String.valueOf(java.time.Year.now());
    int y=Integer.parseInt(str);
    m3=new SpinnerNumberModel(y,y-100,y,1);
    s1=new JSpinner(m1);
    s1.addChangeListener(this);
     s2=new JSpinner(m2);
      s2.addChangeListener(this);
      s3=new JSpinner(m3);
       s3.addChangeListener(this);
      s1.setBounds(100,20,100,50);
       s2.setBounds(100,100,100,50);
        s3.setBounds(100,180,100,50);
        add(s1);
        add(s2);
        add(s3);
        l.setBounds(100,280,110,20);
        setDOB();
        add(l);
        validate();
    }
 public static void main(String[] args){
           new SpinnerEx();
     }   
 public void setDOB(){
     int date=(Integer)s1.getValue();
      int year=(Integer)s3.getValue();
       String month=(String)s2.getValue();
      l.setText("DOB:"+date+" "+year+ " "+month);
 }
 public void stateChanged(ChangeEvent e){//reset DOB in label
     setDOB();
     
 }
}
