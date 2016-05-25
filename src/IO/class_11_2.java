package IO;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;

/**
 * Created by Henry on 16/5/23.
 */
public class class_11_2 {
    public static void main(String args[]) throws Throwable{
        File f = new File("./src/IO/class_11_1_text.txt");
        File f_2 = new File("./src/IO/class_11_2_text.txt");

        FileInputStream fc_read = new FileInputStream(f);
        BufferedReader br = new BufferedReader(new InputStreamReader(fc_read,"UTF-16"));

        FileOutputStream fc_write = new FileOutputStream(f_2);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fc_write,"UTF-16"));

        String tmp;
        int count = 1 ;

        while ((tmp = br.readLine())!= null){
            bw.write(count++ + tmp);
            bw.newLine();
        }

        bw.close();
        br.close();


    }
}
