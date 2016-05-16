package Home_Work_5;

import java.util.LinkedList;

/**
 * Created by Henry on 16/5/2.
 */
public class TiJianBiao {
    private LinkedList<item> list= new LinkedList<item>();


    public LinkedList<item> get_list(){
        return list;
    }
    public void append(String nm,int ag,int hg){
        list.add(new item(nm,ag,hg));
    }


    public class item{
        String Name;
        int age;
        int height;

        public item(String nm,int ag,int hg){
            Name = nm;
            age = ag;
            height = hg;
        }

        public  String get_name(){
            return Name;
        }
    }
}
