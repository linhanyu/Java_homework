package class_2016_4_19;

/**
 * Created by Henry on 16/4/19.
 */

import java.lang.reflect.*;

interface Interface{
        void fuck();
}

interface Interface1{
    void shit();
}
public class Text {

    public static void main(String argsp[]) throws Throwable{
        Method md= fuck.class.getDeclaredMethod("shit");
        md.setAccessible(true);
        md.invoke(fuck.class.newInstance());
    }
}

class fuck{
    void shit(){
        System.out.print("呵呵");
    }
}



