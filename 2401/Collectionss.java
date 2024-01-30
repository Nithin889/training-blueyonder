import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Collectionss{
    public static void main(String[] args) {
        ArrayList al=new ArrayList(100);
        //LinkedList al=new LinkedList();
        //Vector al=new Vector();
        //Stack al=new Stack();
        //HashSet al=new HashSet();
        //LinkedHashSet al=new LinkedHashSet();
        //TreeSet al=new TreeSet();

        al.add(11);
        al.add(12);
        al.add(13);
        al.add(14);
        al.add(15);
        al.add(16);
        al.add(17);
        al.add(18);
        al.add(19);
        al.add(20);
        al.add(21);
        al.add(22);
        al.add(23);
        al.add(24);
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(9);
        al.add(10);
        Iterator it=al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        Collections.sort(al);
        Collections.reverse(al);
        System.out.println(al);
        System.out.println("===========List iterator============   ");
        //ListIterator li=al.ListIterator();
        // while(li.hasNext()){
        //     System.out.println(li.next());
        // }
        System.out.println("===Enumeration iterator============");
        //		Enumeration e = al.elements();
//	      while (e.hasMoreElements()) {
//	        System.out.println(e.nextElement());
//	      }
		
		
		
		
		
//		System.out.println("==============");
//		System.out.println(al.peek());
//		al.remove(3);
//		System.out.println(al);
//		System.out.println(al.contains(200));
//		System.out.println(al.isEmpty());
//		System.out.println(al.firstElement());
//		System.out.println(al.lastElement());

    }
}