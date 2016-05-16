package Homework_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Henry on 16/5/13.
 */
public class class_11 extends JFrame{
    public JTextField jtf = new JTextField();
    public JTextArea jta = new JTextArea();
    public JButton jb = new JButton();

    public static void main(String str[]){
        class_11 cl = new class_11();
        cl.setSize(500,500);
        cl.setLayout(new FlowLayout());


        cl.jtf = new JTextField();
        cl.jta = new JTextArea();
        cl.jb = new JButton();

        Dimension size=  new Dimension(100,30);
        cl.jtf.setPreferredSize(size);
        cl.jta.setPreferredSize(size);
        cl.jb.setPreferredSize(size);

        cl.add(cl.jtf);
        cl.add(cl.jta);
        cl.add(cl.jb);

        cl.jb.addActionListener(new ActionListener() {
            public class_11 c= cl;

            public void put_in(double num){
                c.jta.setText(String.valueOf(num));
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                double num = Double.parseDouble(c.jtf.getText());
                boolean set = true;

                if (num>1000){
                    JDialog jd = new JDialog(c,"想要女朋友",true);
                    jd.setLayout(new FlowLayout());
                    jd.add(new Label("你放不放"));
                    JButton jo= new JButton("哦");
                    jo.addActionListener(new ActionListener() {
                        public class_11 cc = c;
                        public JDialog j = jd;
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            cc.jta.setText(String.valueOf(num));
                            j.setVisible(false);

                        }
                    });
                    jd.add(jo);
                    JButton jf= new JButton("拒绝");
                    jf.addActionListener(new ActionListener() {
                        public class_11 cc = c;
                        public JDialog j = jd;
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            cc.jta.setText("");
                            j.setVisible(false);

                        }
                    });
                    jd.add(jf);
                    jd.setSize(100,100);
                    jd.setVisible(true);
                }else {

                }


            }
        });

        cl.setVisible(true);
    }
}
