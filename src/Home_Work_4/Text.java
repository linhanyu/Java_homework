package Home_Work_4;

/**
 * Created by Henry on 16/5/2.
 */
public class Text {
    public static void main(String args[]){
        Alphabet_form af = new Alphabet_form("cdsdffsda");
        af.set_strategy(Strategy.procedure("up"));
        af.show();
        af.set_strategy(Strategy.procedure("down"));
        af.show();
        af.set_strategy(Strategy.procedure("fuck"));
        af.show();

    }
}

class Alphabet_form{
    private String Alphabet;
    private strategys sg = Strategy.procedure("normal");
    public Alphabet_form(String arg){
        Alphabet = arg;
    }

    void set_strategy(strategys a){
        sg = a;
    }

    void show(){
        System.out.println(sg.execute(Alphabet));
    }
}