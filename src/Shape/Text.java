package Shape;


import java.util.Scanner;

/**
 * Created by twinklekuang on 16/4/11.
 */
public class Text {
    public static void main(String args[]) throws Throwable{
        Scanner sc = new Scanner(System.in);
        Shape_Container scr = new Shape_Container();
        while(true) {
            try {
                Shape_Factory factory = Shape_Factory.Get_Shape_Facory(sc.next());
                Shape shape = factory.procedure(sc);
                scr.add(shape);
            } catch (Exception e) {
                System.out.print("呵呵!\n");
                scr.invoke(new String[]{"angry"});
            }
        }
    }
}
