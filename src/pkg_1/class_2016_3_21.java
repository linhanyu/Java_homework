package pkg_1;

/**
 * Created by admin on 2016/3/21.
 */
public class class_2016_3_21 {
    public static  void  main(String args[]){
        person ps = new student();
        System.out.print(ps.getname());
    }
}

class person{
        String name;
        public person(String nm){name = nm;}
        public String getname(){return name;}
}

class student extends person{
    student(){super("SB");}
}

