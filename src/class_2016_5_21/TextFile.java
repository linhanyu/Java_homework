package class_2016_5_21;


import class_2016_5_10.Text;

import  java.io.*;
import java.nio.*;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.zip.*;

/**
 * Created by Henry on 16/5/21.
 */
public class TextFile extends ArrayList<String>{
    public static String read(String file_name){
        StringBuffer sb = new StringBuffer();
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(file_name).getAbsoluteFile()));
            try{
                String s;
                while ((s = br.readLine())!= null){
                    sb.append(s);
                    sb.append("\n");
                }
            }finally {
                br.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    public static void write(String file_Name,String text){
        try {
            PrintWriter pw = new PrintWriter(new File(file_Name).getAbsoluteFile());
            try{
                pw.print(text);
            }finally {
                pw.close();
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public TextFile(String file_name,String spliter){
        super(Arrays.asList(read(file_name).split(spliter)));
        if (get(0).equals(" ")) remove(0);
    }

    public TextFile(String file_name){
        this(file_name,"\n");
    }

    public void add_self(String file_path,String spliter){
        for (String item:
                Arrays.asList(read(file_path).split(spliter))){
            add(item + "\n");
        }
    }

    public void write_self(String path){
        try{
            PrintWriter out = new PrintWriter(new File(path).getAbsoluteFile());
            try{
                for (String item : this){
                    out.print(item);
                }
            }finally {
                out.close();
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    static int lenth = 0x8FFFFFF;
    public static void main(String args[]) throws Throwable{
        FileOutputStream f = new FileOutputStream("test.zip");
        CheckedOutputStream csum = new CheckedOutputStream(f,new Adler32());
        ZipOutputStream zos = new ZipOutputStream(csum);
        BufferedOutputStream out = new BufferedOutputStream(zos);
        zos.setComment("GirlFriend Wanted");
        for (int i=0;i<5;i++){
            String str = i + "ha.txt";
            new File(str ).createNewFile();
            BufferedReader br = new BufferedReader(new FileReader(str));
            zos.putNextEntry(new ZipEntry(str));
            int c;
            while ((c = br.read()) != -1){
                out.write(c);
            }
            br.close();
            out.flush();

        }
        out.close();

        System.out.println(csum.getChecksum().getValue());

        FileInputStream f2 = new FileInputStream("test.zip");
        CheckedInputStream csumi = new CheckedInputStream(f2,new Adler32());
        ZipInputStream zis = new ZipInputStream(csumi);
        BufferedInputStream in = new BufferedInputStream(zis);
        ZipEntry ze;
        while((ze = zis.getNextEntry()) != null){
            int x;
            while ((x = in.read()) != -1){
                System.out.println(x);
            }
        }


//        FileOutputStream fos = new FileOutputStream("file.txt");
//        FileLock fl = fos.getChannel().tryLock();
//
//        BufferedOutputStream ot =
//                new BufferedOutputStream
//                                (new GZIPOutputStream
//                                        (new FileOutputStream("file.gz")));
//        BufferedReader in=
//                new BufferedReader
//                        (new InputStreamReader
//                                (new GZIPInputStream
//                                        (new FileInputStream("file.gz"))));
//
//
//        if (fl != null){
//            System.out.println("Locked File");
//            TimeUnit.MILLISECONDS.sleep(1000);
//            fl.release();
//            System.out.print("FUCK");
//
//        }
//        File f =new File("test.dat");
////        f.createNewFile();
//        MappedByteBuffer out = new RandomAccessFile(f,"rw")
//                .getChannel().map(FileChannel.MapMode.READ_WRITE,0,lenth);
//        for (int i=0;i<lenth;i++){
//            out.put((byte) 'x');
//        }
//
//        for (int i=lenth>>1;i<(lenth>>1)+6;i++){
//            System.out.println((char) out.get(i));
//        }
///
//        try {
//            ByteBuffer bb = ByteBuffer.allocate(1024);
//            FileChannel fd = new FileInputStream("test.txt").getChannel();
//            bb.order(ByteOrder.BIG_ENDIAN);
//            fd.read(bb);
//            bb.flip();
//            fd.close();
//
////            System.out.println(bb.asCharBuffer());
//
////            String encoding = System.getProperty("file.encoding");
////            System.out.println(Charset.forName(encoding).decode(bb));
//
//
////            FileChannel fc = new FileOutputStream("test.txt").getChannel();
////            fc.write(ByteBuffer.wrap("Fuck".getBytes()));
////            fc.close();
////
////            fc = new RandomAccessFile("test.txt","rw").getChannel();
////            fc.position(fc.size());
////            fc.write(ByteBuffer.wrap("Shit".getBytes()));
////            fc.close();
////
////            fc = new FileInputStream("test.txt").getChannel();
////            ByteBuffer bb = ByteBuffer.allocate(1024);
////            fc.read(bb);
////            bb.flip();
////            while(bb.hasRemaining()){
////                System.out.print((char)bb.get());
////            }
//        }catch (Throwable e){
//            throw new RuntimeException(e);
//        }
//


    }
}
