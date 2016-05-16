package class_2016_5_12;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Henry on 16/5/12.
 */


public class Text{
    public static void main(String args[]){
        ArrayList<Number> a_2 = new ArrayList<Number>();
        a_2.add(2);
        ArrayList<? super Number> a_1 = a_2;
        ArrayList<? super Integer> a_3 = a_1;
        new ArrayList<>();
    }
}
