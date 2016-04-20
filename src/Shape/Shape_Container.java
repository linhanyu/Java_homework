package Shape;

import javax.script.Invocable;
import java.lang.reflect.*;
import java.util.ArrayList;

/**
 * Created by Henry on 16/4/20.
 */
public class Shape_Container{
    private ArrayList<Shape> container ;
    {
        container = new ArrayList<Shape>();
    }

    void add(Shape sp){
        try {
            container.add(sp);
        }catch (Throwable t){
            System.out.print("wa!");
        }
    }

    public void invoke(Object... args) throws Throwable{
        Class<? extends Shape> Type;
        Method m;
        for(Object ob :
                args) {
            for (Shape sp :
                    container) {
                try {
                    Type = sp.getClass();
                    m = Type.getDeclaredMethod(String.class.cast(ob));
                    m.setAccessible(true);
                    m.invoke(Type.cast(sp));
                } catch (Throwable t) {

                }
            }
        }
    }
}
