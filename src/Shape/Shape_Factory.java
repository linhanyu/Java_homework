package Shape;


import java.util.Scanner;

/**
 * Created by twinklekuang on 16/4/11.
 */


abstract class Shape_Factory{
    protected static int arg_num;
    protected Shape_Factory(int a){arg_num = a;};
    public static Shape_Factory Get_Shape_Facory(String name) throws Exception{
        try {
            return (Shape_Factory)Class.forName("Shape." + name.toLowerCase() + "_Factory").newInstance();
        }catch (Exception e){
            throw e;
        }
    }

    abstract Shape procedure( Scanner sc);
}

class circle_Factory extends Shape_Factory{

    circle_Factory(){
        super(3);
    }

    Shape procedure(Scanner sc){
        int args[] = new int[3];
        for (int i=0;i<arg_num;i++){
            args[i] = sc.nextInt();
        }
        return new Circle(args);
    }
}

class recangle_Factory extends Shape_Factory{

    recangle_Factory(){
        super(8);
    }

    Shape procedure(Scanner sc){
        int args[] = new int[arg_num];
        for (int i=0;i<arg_num;i++){
            args[i] = sc.nextInt();
        }
        return new Recangle(args);
    }
}

class triangle_Factory extends Shape_Factory{
    triangle_Factory(){
        super(6);
    }

    Shape procedure(Scanner sc){
        int args[] = new int[arg_num];
        for (int i=0;i<arg_num;i++){
            args[i] = sc.nextInt();
        }
        return new Triangle(args);
    }
}