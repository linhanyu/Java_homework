package Shape;


import java.util.Scanner;

/**
 * Created by twinklekuang on 16/4/11.
 */
public class Text {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                Shape_Factory factory = Shape_Factory.Get_Shape_Facory(sc.next());
                Shape shape = factory.procedure(sc);
                shape.show();
            } catch (Exception e) {
                System.out.print("呵呵!\n");
            }
        }
    }
}
