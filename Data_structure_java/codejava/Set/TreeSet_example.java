package codejava.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_example {
    public static void main(String [] args){
        TreeSet<Integer> mytreeSet = new TreeSet<>() ;
        mytreeSet.add(1);
        mytreeSet.add(2);
        mytreeSet.add(3);
        mytreeSet.add(4);
        mytreeSet.add(5);

        System.out.println("My TreeSet :");
        Iterator<Integer> it = mytreeSet.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
