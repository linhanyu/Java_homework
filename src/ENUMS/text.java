package ENUMS;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Random;
import java.util.function.Predicate;

/**
 * Created by Henry on 16/5/24.
 */

interface shit{
    public static void hehe(){
        System.out.println("爆");
    }
}
public class text {
    public static void main(String args[]) throws Throwable{
            System.out.println(fucker.Shit_2.getClass().getName());
//        EnumMap<fucker,shit> map = new EnumMap<fucker, shit>(fucker.class);
//        map.put(fucker.Shit_2, new shit(){});
//        System.out.println(map.get(fucker.Shit_2));

//        EnumSet<fucker> set = EnumSet.allOf(fucker.class);
//        System.out.println(set);
//        set.remove(fucker.Shit_2);
//        System.out.println(set);
//        set.add(fucker.Shit_3);
//        System.out.println(set);
//        set.add(fucker.Shit_2);
//        set.removeIf(new Predicate<fucker>() {
//            @Override
//            public boolean test(fucker fucker) {
//                return fucker.ordinal() == 0;
//            }
//        });
//        System.out.println(set);
//        set.removeAll(EnumSet.range(fucker.Shit_1,fucker.Shit_2));
//        System.out.println(set);
//        System.out.println(EnumSet.complementOf(set));
//
//




//        fucker a[] = fucker.values();
//        fucker b[] = fucker.values();
//        shit ff = new ENUMS();
//        shit.class.getDeclaredMethod("hehe").invoke(ff.getClass());
//        System.out.println(ENUMS.random(fucker.class));
//        System.out.println(ENUMS.random(fucker.class));
//        System.out.println(ENUMS.random(fucker.class));
//        System.out.println(ENUMS.random(fucker.class));
//        System.out.println(ENUMS.random(fucker.class));
//        System.out.println(ENUMS.random(fucker.class));

    }

}

class ENUMS implements shit{
    private static Random rand = new Random(47);
    public static <T extends Enum<T>> T random(Class<T> c){
        return random(c.getEnumConstants());
    }

    public static <T> T random(T[] values){
        return values[rand.nextInt(values.length)];
    }
}

enum fucker{
    Shit_1,Shit_2;
//    abstract public void fuck();
//    abstract public void shit();
//    abstract public void fuck();
//    Shit_1{
//    public void fuck(){
//        System.out.println(this.ordinal() + "FUCK!");
//    }
//    public void shit(){
//        System.out.println(this.ordinal() + "FUCK!");
//    }
//
//    },
//    Shit_2{
//        public void fuck(){
//            System.out.println(this.ordinal() + "FUCK!");
//        }
//        public void shit(){
//            System.out.println(this.ordinal() + "FUCK!");
//        }
//
//    },
//    Shit_3{
//        public void fuck(){
//            System.out.println(this.ordinal() + "FUCK!");
//        }
//        public void shit(){
//            System.out.println(this.ordinal() + "FUCK!");
//        }
//
//    };
    public void hehe(){

    }
//    abstract public void fuck();
//    abstract public void shit();


}