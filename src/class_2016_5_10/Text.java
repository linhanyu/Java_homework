package class_2016_5_10;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
/**
 * Created by Henry on 16/5/10.
 */

abstract class G_Creater<T>{
    T val;
    G_Creater(){val = create();}
    abstract T create();
}
class fuck{}

class Fuck_Create extends G_Creater<fuck>{
    @Override
    fuck create() {
        return new fuck();
    }
}

class shit{}

class shit_Create extends G_Creater<shit>{
    @Override
    shit create() {
        return new shit();
    }
}

class dog<T>{
    public T[] ar(Class<T> cl,int sz){
        return (T[]) Array.newInstance(cl,sz);
    }
}

public class Text {
    dog<Integer> dg= new dog<Integer>();
    Integer ar[] = dg.ar(Integer.class,5);
    Text a = new Text();
    public static void main(String[] args){
        Fucker<Integer> a = new Fucker<Integer>();
        for (int i=0;i<5;i++){
            a.add(i);
        }
        Fucker<Double> b = new Fucker<Double>();
        for (int i=0;i<5;i++){
            b.add((double)i);
        }
        Collection<Number> co = new ArrayList<Number>();
        Generators.fill(co,a.iterator());
        Generators.fill(co,b.iterator());
        System.out.print(co);
        Sperm r = Basic_Generator.bg(Sperm.class);
    }
}

class Sperm{}

class Basic_Generator{

    public static <T> T bg(Class<T> tp){
        try {
            return tp.newInstance();
        }catch (Throwable y){
            return null;
        }
    }
}


class Generators{
    public static <T> Collection<T> fill (Collection<T> coll,Iterator<? extends T> it){
        while(it.hasNext()){
            coll.add(it.next());
        }
        return coll;
    }
}


class Fucker<T> implements Iterable<T>{
    List<T> Sperm = new LinkedList<T>();

    void add(T val){
        Sperm.add(val);
    }

    public Iterator<T> iterator() {
        return new Generator();
    }
    class Generator implements Iterator<T>{
        ListIterator<T> fucker = Sperm.listIterator();
        @Override
        public boolean hasNext() {
            return fucker.hasNext();
        }

        @Override
        public T next() {
            return fucker.next();
        }
    }
}
