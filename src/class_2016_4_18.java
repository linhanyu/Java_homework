import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Henry on 16/4/18.
 */
public class class_2016_4_18 {


    public static void main(String args[]){
        Class<hehe> a = hehe.class;
        System.out.print(hehe.sperm);
    }
}

class b{

}

class hehe extends b{
    public static final int sperm = 2;
    static {
        System.out.print("FUCK!");

    }
}

class recangle<T>{
    private ArrayList<ArrayList<T > > rec;

    recangle(int m, int n, Scanner sc){
        rec = new ArrayList<ArrayList<T > >();

        for (int i=0;i<n;i++){
            rec.add(new ArrayList<T>());
            for (int j=0;j<m;j++){
                rec.get(i).add((T)sc.next());
            }
        }


    }

}