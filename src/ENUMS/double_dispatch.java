package ENUMS;

import java.util.Comparator;
import java.util.EnumMap;

/**
 * Created by Henry on 16/5/24.
 */

enum Outcome{
    WIN,LOSE,DRAW;
}

interface Item{
    Outcome compete(Item it);
    Outcome eval(Paper p);
    Outcome eval(Scissors s);
    Outcome eval(Rock r);
}

class Paper implements Item{

    @Override
    public Outcome compete(Item it) {
        return it.eval(this);
    }

    @Override
    public Outcome eval(Paper p) {
        return Outcome.DRAW;
    }

    @Override
    public Outcome eval(Scissors s) {
        return Outcome.WIN;
    }

    @Override
    public Outcome eval(Rock r) {
        return Outcome.LOSE;
    }
}

class Scissors implements Item{

    @Override
    public Outcome compete(Item it) {
        return it.eval(this);

    }

    @Override
    public Outcome eval(Paper p) {
        return Outcome.LOSE;
    }

    @Override
    public Outcome eval(Scissors s) {
        return Outcome.DRAW;
    }

    @Override
    public Outcome eval(Rock r) {
        return Outcome.WIN;
    }
}

class Rock implements Item{

    @Override
    public Outcome compete(Item it) {
        return it.eval(this);

    }

    @Override
    public Outcome eval(Paper p) {
        return Outcome.WIN;
    }

    @Override
    public Outcome eval(Scissors s) {
        return Outcome.LOSE;

    }

    @Override
    public Outcome eval(Rock r) {
        return Outcome.DRAW;
    }
}
public class double_dispatch {
    public static void match(Item a,Item b){
        System.out.println(a.compete(b));
    }

    @Deprecated
    static int Girfriend;
    static int Boyfriend;

    public static void main(String args[]){
        System.out.println(RoshamBo5.PAPER.compete(RoshamBo5.PAPER));
        System.out.println("达强爸爸 have many " + Girfriend );

    }
}

enum RoshamBo5 {


    PAPER,SCISSORS,ROKE;
    static EnumMap<RoshamBo5,EnumMap<RoshamBo5,Outcome>> map;
    static {
        map = new EnumMap<RoshamBo5, EnumMap<RoshamBo5, Outcome>>(RoshamBo5.class);
        for (RoshamBo5 it
                :RoshamBo5.values()){
            map.put(it,new EnumMap<RoshamBo5, Outcome>(RoshamBo5.class));

        }
        init_row(RoshamBo5.PAPER,Outcome.DRAW,Outcome.WIN,Outcome.LOSE);
        init_row(RoshamBo5.SCISSORS,Outcome.WIN,Outcome.LOSE,Outcome.DRAW);
        init_row(RoshamBo5.ROKE,Outcome.LOSE,Outcome.DRAW,Outcome.WIN);
    }

    static void init_row(RoshamBo5 it,Outcome v_Paper,Outcome v_Rock,Outcome v_SCISSORS){
        EnumMap<RoshamBo5,Outcome> raw= map.get(it);
        raw.put(RoshamBo5.PAPER,v_Paper);
        raw.put(RoshamBo5.SCISSORS,v_SCISSORS);
        raw.put(RoshamBo5.ROKE,v_Rock);
    }


    public Outcome compete(RoshamBo5 it){
        return map.get(this).get(it);
    }
}

enum RoShamBo6 implements Comparable<RoShamBo6>{
    PAPER,SCISSORS,ROKE;
    private static Outcome[][] table = {
            {Outcome.DRAW,Outcome.LOSE,Outcome.WIN},//PAPER
            {Outcome.WIN,Outcome.DRAW,Outcome.LOSE},//SCISSORS
            {Outcome.LOSE,Outcome.WIN,Outcome.DRAW},//PAPER
    };

    public Outcome compete(RoShamBo6 other){
        return table[this.ordinal()][other.ordinal()];
    }
}