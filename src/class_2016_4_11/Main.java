package class_2016_4_11;

/**
 * Created by Henry on 16/4/11.
 */
public class Main{
    public static void main(String args[]){
        StringBuilder SB = new StringBuilder();
        SB.append("a");
        SB.append("a");SB.append("a");
        String a = new String("aaa");
        String b = new String("aab");

        System.out.print(a.regionMatches(0,b,0, 3));

    }
}