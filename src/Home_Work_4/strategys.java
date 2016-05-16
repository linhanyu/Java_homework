package Home_Work_4;

/**
 * Created by Henry on 16/5/2.
 */
public abstract class strategys{
    abstract String execute(String str);
    protected static String bucket_sort(char[] sequence){
        int A[] = new int[64];
        for (char a:
                sequence) {
            A[a-'A']++;

        }

        StringBuffer sb = new StringBuffer();
        for (int i=0;i<64;i++){
            for (int j=0;j<A[i];j++){
                sb.append((char) (i+'A'));
            }
        }

        return sb.toString();
    }
}

class Strategy_up extends strategys{


    @Override
    public String execute(String str) {
        return bucket_sort(str.toCharArray());
    }
}


class Strategy_down extends strategys{
    @Override
    public String execute(String str) {
        return new StringBuffer(bucket_sort(str.toCharArray())).reverse().toString();
    }
}


class Strategy_normal extends strategys{
    @Override
    public String execute(String str) {
        return str;
    }
}
