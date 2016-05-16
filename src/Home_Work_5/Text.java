package Home_Work_5;

import Home_Work_4.Strategy;
import Home_Work_4.strategys;

/**
 * Created by Henry on 16/5/2.
 */
public class Text {
    public static void main(String args[]){
        TiJianBiao tb = new TiJianBiao();
        tb.append("爸爸",17,179);
        tb.append("老王",50,181);
        tb.append("李嘉诚",17,179);
        Visitor son_1 = new Army();
        Visitor son_2 = new Factory();
        for (String str:
                son_1.select(tb)) {
            System.out.println(str);
        }
        System.out.println();
        for (String str:
                son_2.select(tb)) {
            System.out.println(str);
        }
    }
}
