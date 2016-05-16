package Home_Work_5;

import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.TreeMap;

/**
 * Created by Henry on 16/5/2.
 */
abstract public class Visitor {

    TreeMap<String ,Integer> judge_item = new TreeMap<String ,Integer>();

    public LinkedList<String> select(TiJianBiao tb){
        LinkedList<String> ls  = new LinkedList<String>();
        for (TiJianBiao.item it:
             tb.get_list()) {
            if (judged(it)){
                ls.add(it.get_name());
            }
        }
        return ls;
    }

    protected boolean judged(TiJianBiao.item it){
        for (String var:
                judge_item.keySet()) {
            try {

                Field fd = it.getClass().getDeclaredField(var);
                fd.setAccessible(true);
                if(judge_item.get(var) < Integer.class.cast(fd.get(it))){
                    return false;
                }
            }catch (Throwable t){
                return false;
            }
        }
        return true;
    }

    abstract protected void set_judgeitem();
}

class Army extends Visitor{

    public Army(){
        set_judgeitem();
    }

    @Override
    protected void set_judgeitem() {
        judge_item.put("age",18);
        judge_item.put("height",180);

    }

}

class Factory extends Visitor{

    public Factory(){
        set_judgeitem();
    }
    protected void set_judgeitem() {
        judge_item.put("height",200);
    }


}