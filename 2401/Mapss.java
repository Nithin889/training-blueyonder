import java.util.*;

public class Mapss {
    public static void main(String[] args) {
        //Hashtable mp=new Hashtable();//legacy class
        //Hashmap mp=new Hashmap();//no duplicate + no order
        //LinkedHashMap mp=new LinkedHashMap();
        TreeMap mp=new TreeMap();
        mp.put(11,11);
        mp.put(12,12);
        mp.put(11,11);
        mp.put(12,12);
        mp.put(13,13);
        mp.put(14,14);
        mp.put(15,15);
        mp.put(16,16);
        mp.put(17,17);
        mp.put(18,18);
        mp.put(19,19);
        mp.put(20,20);
        mp.put(21,21);
        mp.put(22,22);
        mp.put(23,23);
        mp.put(24,24);
        mp.put(1,1);
        mp.put(2,2);
        Set s = mp.entrySet();
        Iterator it=s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
