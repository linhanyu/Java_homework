package pkg_1;
import java.lang.Math.*;

import static java.lang.Math.max;
import java.util.*;
/**
 * Created by admin on 2016/3/21.
 */
class fuck{
    static int a=k.b;


}
public class k {
    public k(){super();}
    static int c;
    static int b;
    static {
        c = fuck.a;
        b = 1;

    }

    public static int gcd(int dividen,int divider){
        if (divider == 0)
            return dividen;
        return gcd(divider,dividen % divider);
    }

    public static int gongbeishu(int num1,int num2){
        int i = max(num1,num2);
        while(i%num1 != 0 || i%num2 != 0){
            i++;
        }
        return i;
    }
    public static void main(String args[]){
        String a = "2 3";
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(Integer.toString(22));
        System.out.println(gongbeishu(num1,num2));

    }

}
