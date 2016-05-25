package Object_setialization;

import java.io.*;

/**
 * Created by Henry on 16/5/23.
 */
public class text {
    public static void main(String args[]) throws Throwable{
        blip3 b3 = new blip3();
        b3.set();
        System.out.println(b3);
                File f = new File("Blips.out");
        ObjectOutputStream o = new ObjectOutputStream
                (new FileOutputStream(f));
        o.writeObject(b3);
        o.close();

        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(f));
        b3 = (blip3)in.readObject();
        System.out.println(b3);
//        blip1 bp1 = new blip1();
//        blip2 bp2 = new blip2();
//
//        File f = new File("Blips.out");
//        ObjectOutputStream o = new ObjectOutputStream
//                (new FileOutputStream(f));
//        o.writeObject(bp1);
//        o.writeObject(bp2);
//        o.close();
//
//        ObjectInputStream in = new ObjectInputStream(
//                new FileInputStream(f));
//        bp1 = (blip1)in.readObject();
//        bp2 = (blip2)in.readObject();



    }
}

class blip3 implements Serializable{
    Integer a =1;
    transient Integer b=2;

    public blip3(){
//        System.out.print("cons!");
//        a = 1;
//        b = 2;
    }

    public void set(){
        a = 3;
        b = 4;
    }

    public String toString(){
       return (a + " " + b);
    }
}

class blip1 implements Externalizable{
    public blip1(){
        System.out.println("Blip1 constructor");
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("Blip1 writeExternal");

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("Blip1 readExternal(");

    }
}

class blip2 implements Externalizable{
    blip2(){
        System.out.println("Blip2 constructor");
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("Blip2 writeExternal");

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("Blip2 readExternal");

    }
}