package pkg_1;

/**
 * Created by admin on 2016/3/21.
 */
interface Fuckyou{
    int a=1;
    int b=2;
    public static void ma(){
        System.out.print("haha"+a+b);

    }

    public void hehe();
}

public class class_2016_3_21 implements Fuckyou{
    private  static int apha;
    public void hehe(){
        System.out.print("hehe!\n");

    }
    private static void fuck(Cycle... a){
        for (Cycle ck:
             a) {
            ck.ride();
        }
        System.out.print(apha);
    }

//    public static  void  main(String args[]){
//        Fuckyou.ma();
//        (new class_2016_3_21()).hehe();
//        person ps = new student();
//        apha = 2;
//        System.out.print(ps.getname());
//        Cycle ck= new Unicycle();
//        ((Unicycle)ck).down_cast();
//
//
//    }
}

class Cycle{
    String wa = new String("wa!!!");
    Cycle(){
        herit();
//        this.herit();
    }
    public void ride(){System.out.print(this.wa);}
    public void herit(){
        System.out.println("bases");
    }
}

class Unicycle extends Cycle{
    @Override
    public void ride(){System.out.print("oo！！！!！");
    super.ride();
    }

    public void down_cast(){
        System.out.println("Fuck");


    }
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

