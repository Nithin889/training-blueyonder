import java.util.ArrayList;
import java.util.Iterator;

public class Collections{
    public static void main(String[] args) {
        ArrayList al=new ArrayList();//size flexible && datatype flexible
        al.add(100);
        al.add(true);
        al.add("Nithin");
        Iterator it=al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(al.get(2));

    }
}