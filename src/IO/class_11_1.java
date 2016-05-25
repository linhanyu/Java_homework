package IO;


import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;

import static java.nio.charset.Charset.*;

/**
 * Created by Henry on 16/5/22.
 */
public class class_11_1 {

    public static void main(String args[]) throws Throwable{
        File f = new File("./src/IO/class_11_1_text.txt");
        RandomAccessFile raf = new RandomAccessFile(f,"r");
        FileChannel fc = raf.getChannel();
        MappedByteBuffer mbb = fc.map(FileChannel.MapMode.READ_ONLY,0,f.length());
        Charset cs = Charset.forName("UTF-16");
        byte buff[] = new byte[2];
        StringBuffer sb = new StringBuffer();
        for (int i=(int) f.length()-2;i>=0;i -= 2){
            buff[1] = mbb.get(i);
            buff[0] = mbb.get(i+1);
            sb.append(cs.decode(ByteBuffer.wrap(buff)));
        }

        System.out.println(sb);


//        ByteBuffer b = Charset.forName("UTF-16").encode("你是在叫爸爸吗");
//        FileChannel fc = new FileOutputStream(f).getChannel();
//        System.out.println(Charset.forName("UTF-16").decode(b));
//        b.flip();
//        fc.write(b);
//        fc.close();
//
//        FileInputStream raf = new FileInputStream("class_11_1_text.txt");
////        RandomAccessFile raf = new RandomAccessFile(f,"rw");
//        fc = raf.getChannel();
////        MappedByteBuffer mbb = fc.map(FileChannel.MapMode.READ_WRITE,0,f.length());
//        b = ByteBuffer.allocate(128);
//        fc.read(b);
//        b.flip();
////        ByteBuffer b = ByteBuffer.allocate(24);
////        String Code = System.getProperty("file.encoding");
//        System.out.println(Charset.forName("UTF-16").decode(b));
//        fc.close();

//        FileChannel fc = raf.getChannel();
//        long size = raf.length() -2;
//        byte a[] = new byte[2];

//        while(size>=0){
//            raf.seek(size);
//            raf.readFully(a);
//            String encoding = System.getProperty("file.encoding");
//            System.out.print(Charset.forName(encoding).decode());
//            size-=2;
//        }

    }
}
