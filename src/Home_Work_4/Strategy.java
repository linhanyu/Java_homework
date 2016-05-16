package Home_Work_4;



/**
 * Created by Henry on 16/5/2.
 */


public class Strategy {
    public static strategys procedure(String arg) {
        try {

            return strategys.class.cast(Class.forName("Home_Work_4.Strategy_"+arg).newInstance());
        }catch (Throwable t){
            return new Strategy_normal();

        }
    }
}



