package codejava.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_of_a_simple_Java_type {
    public static void main(String[] args){
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(5);
        ts.add(6);

        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.size());
        System.out.println(ts.contains(1));
        System.out.println(ts.contains(11234));

        System.out.println("for loop :");
        for(Integer i : ts){
            System.out.println(i);
        }
        System.out.println("While loop : ");
        Iterator<Integer> it = ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
