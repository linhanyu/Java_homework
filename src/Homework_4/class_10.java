package Homework_4;

import javax.swing.*;
import javax.xml.soap.Text;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;
import java.util.*;

/**
 * Created by Henry on 16/5/12.
 */
interface op{
    String res(String a,String b);
}

class DIV implements op{

    @Override
    public String res(String a, String b) throws NumberFormatException{
            return String.valueOf(Double.parseDouble(a) / Double.parseDouble(b));

    }
}
class ADD implements op{

    @Override
    public String res(String a, String b) throws NumberFormatException{
        return String.valueOf(Double.parseDouble(a)+ Double.parseDouble(b));
    }
}class MUL implements op{

    @Override
    public String res(String a, String b) throws NumberFormatException{
        return String.valueOf(Double.parseDouble(a)* Double.parseDouble(b));
    }
}class SUB implements op{

    @Override
    public String res(String a, String b) throws NumberFormatException{
        return String.valueOf(Double.parseDouble(a)- Double.parseDouble(b));
    }
}
public class class_10 extends JFrame{
    public static  ArrayList<JButton> bts= new ArrayList<JButton>();
    public static  ArrayList<JTextField> tas= new ArrayList<JTextField>();

    public static void add_name_listener(JButton jb,String Name){
        jb.setText(Name);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    tas.get(2).setText(((op)Class.forName("Homework_4."+Name).newInstance()).res(tas.get(0).getText(),tas.get(1).getText()));
                }catch (Exception d){
                    for (JTextField j:
                         tas) {
                        j.setText("");
                    }
                }
            }
        });
    }
    public static <T extends Component> void create_add(JFrame a, ArrayList<T> rl, Class<T> cls, int size,int weght,int heght)  {
        T tmp;
        Dimension ds = new Dimension(weght,heght);
        for (int i=0;i<size;i++){
            try {

                tmp = cls.newInstance();
                tmp.setPreferredSize(ds);
                rl.add(tmp);
                a.add(tmp);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args){
        //9-2
        class_10 cl = new class_10();
        cl.setTitle("想要女朋友");

        cl.setSize(500,500);
        cl.setLayout(new FlowLayout());

        create_add(cl,tas,JTextField.class,3,100,30);
        create_add(cl,bts,JButton.class,4,50,50);

        add_name_listener(bts.get(0),"ADD");
        add_name_listener(bts.get(1),"SUB");
        add_name_listener(bts.get(2),"MUL");
        add_name_listener(bts.get(3),"DIV");

        cl.setVisible(true);
    }
}


