import java. awt.*;
import java. io.*;
public class E{
    public static void main(String args[]){
        try{
            File file=new File("p.txt");
            FileOutputStream out=new FileOutputStream( file);
            PrintStream ps=new PrintStream( out);
            ps.print(12345.6789);
            ps. println("how are you");
            ps. println( true);
            ps. close();
        }
        catch(IOException e){}
    }
}
