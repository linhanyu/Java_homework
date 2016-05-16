package class_2016_5_13;

import java.util.Date;

/**
 * Created by Henry on 16/5/13.
 */
public class Decorate {
    public static void main(String args[]){
        TimeStamped a = new TimeStamped(new SerialNumbered(new Basic()));
    }

}


class  Basic{
    private String value;
    public void set(String val){value = val;}
    public String get(){return value;}
}

class Decorator extends Basic{
    protected Basic basic;
    public Decorator(Basic basic){this.basic = basic;}
    public void set(String val){basic.set(val);}
    public String get(){return basic.get();}
}

class TimeStamped extends Decorator{
    private final long timeStamp;
    public TimeStamped(Basic basic){
        super(basic);
        timeStamp = new Date().getTime();
    }
    public long getStamp(){return timeStamp;}
}

class SerialNumbered extends Decorator{
    SerialNumbered(Basic basic){super(basic);}
}

