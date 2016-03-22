package pkg_1;

/**
 * Created by admin on 2016/3/21.
 */
public class class_2016_3_21 {
    private  static int apha;
    private static void fuck(Cycle[] a){
        for (Cycle ck:
             a) {
            ck.ride();
        }
        System.out.print(apha);
    }

    public static  void  main(String args[]){
        person ps = new student();
        apha = 2;
        System.out.print(ps.getname());
        fuck(new Cycle[]{new Unicycle()});

    }
}

class Cycle{
    Cycle(){
        herit();
//        this.herit();
    }
    public void ride(){System.out.print("wa！！！！");}
    public void herit(){
        System.out.println("bases");
    }
}

class Unicycle extends Cycle{
    @Override
    public void ride(){System.out.print("oo！！！!！");
    super.ride();
    }

    @Override
    public void herit(){
        super.herit();
        System.out.println("Son");
    }
}

class Bicycle extends Cycle{
    @Override
    public void ride(){System.out.print("ee！！！！");}

}

class person{
        String name;
        public person(String nm){name = nm;}
        public String getname(){return name;}
}

class student extends person{
    student(){super("SB");}
}

