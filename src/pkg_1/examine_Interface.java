//package pkg_1;
//
//import java.awt.*;
//import java.nio.CharBuffer;
//import java.util.Scanner;
//
///**
// * Created by admin on 2016/3/25.
// */
//public class examine_Interface {
//    public static void doeat(Caneat_fuck ca) {
//        ca.eat_Fuck(new SB());
//
//    }
//
//    public static void dofuck(Canfuck ca) {
//        ca.fuck();
//
//    }
////    public static void main(String[] args){
////
//////        dofuck(new SB());
//////        dofuck(new superSB());
//////        doeat(new superSB());
////        Scanner sc = new Scanner(new print_array(new Integer[]{1,2,3,4}));
////        while(sc.hasNext())
////            System.out.print(sc.next());
////    }
//}class print_array implements Readable{
//    private Object[] ar;
//    private int count;
//    print_array(Object[] a){
//        ar = a;
//        count = 1;
//    }
//    public int read(CharBuffer cb){
//        int i = 1;
//        if (count-- == 0){
//            count = 1;
//            return -1;
//        }
//        for (Object item : ar
//             ) {
//            cb.append(item.toString() + " ");
//            i++;
//        }
//        return i;
//    }
//}
//
//interface Canfuck{
//        public void fuck();
//        }
//
//
//interface Caneat_fuck extends Canfuck{
//        public void eat_Fuck(Canfuck fk);
//        }
//
//class SB implements Caneat_fuck{
//    public void eat_Fuck(Canfuck fk){
//        fk.fuck();
//        System.out.print("eat!");
//
//    }
//
//    public void fuck(){
//        System.out.print("fuck");
//
//    }
//
//}
//
//class superSB extends SB implements Canfuck{
//
//    public void fuck(){
//        System.out.print("Big_fuck");
//
//    }
//
//}