package Shape;

import javax.lang.model.element.Name;

/**
 * Created by twinklekuang on 16/4/11.
 */
public abstract class Shape {
    public static int count = 0;
    private String Name ;
    
    protected Shape(String name){
        count++;
        Name = name;
    }
    void show(){
        System.out.print("Shape " + count + ":\n" + Name + ":\n");
        print_Shape();
    }

    protected class ordinary{
        private int x;
        private int y;
        ordinary(int X,int Y){
            x = X;
            y = Y;
        }
        int get_x(){
            return x;
        }
        
        int get_y(){
            return y;
        }
        
        public String toString(){
            return "x=" + x  +" y=" + y + "\n";
        }
    }
    
    
    abstract void print_Shape();
    
}

class Circle extends Shape{
    private ordinary Centre;
    private int R;
    Circle(int ...args){
        super("Circle");
        Centre = new ordinary(args[0],args[1]);
        R = args[2];
    }    
    
    void print_Shape(){
            System.out.print("centre:" + Centre + " R:" + R + "\n");
    }
    void girlfriend(){
        System.out.print("好想要个女朋友啊");
    }
}


abstract class Angle extends Shape{
    protected ordinary ordinarys[];

    Angle(String Name){
        super(Name);
    }

    
    void print_Shape(){
        for (ordinary od:
             ordinarys) {
            System.out.print(od + "\n");
        }
    }
}

class Triangle extends Angle{
    Triangle(int ...args){
        super("Triangle");
        boolean flag = true;
        int temp_x = 0;
        ordinarys = new ordinary[3];
        int cont = 0;

        for (int a:
                args) {
            if (flag){
                temp_x = a;
                flag = false;
            }else {
                ordinarys[cont++] = new ordinary(temp_x,a);
                flag = true;
            }
        }

    }

    void girlfriend(){
        System.out.print("好想要个女朋友啊");
    }

}
class Recangle extends Angle{
    Recangle(int ...args){
        super("Recangle");
        boolean flag = true;
        int temp_x = 0;
        ordinarys = new ordinary[4];
        int cont = 0;

        for (int a:
                args) {
            if (flag){
                temp_x = a;
                flag = false;
            }else {
                ordinarys[cont++] = new ordinary(temp_x,a);
                flag = true;
            }
        }

    }

    void angry(){
        System.out.print("为什么我没有女朋友!");
    }
}