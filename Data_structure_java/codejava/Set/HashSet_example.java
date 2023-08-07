package codejava.Set;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class HashSet_example {
    public static void main(String [] args){
        Set<Integer> myset = new HashSet<>();
        myset.add(1);
        myset.add(2);
        myset.add(3);
        myset.add(4);
        myset.add(5);

        Iterator<Integer> it = myset.iterator();
        System.out.println("My set :");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
