package codejava.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_example {
    public static void main(String [] args){

        LinkedHashSet<Integer> mylinkedhashset = new LinkedHashSet<Integer>();
        mylinkedhashset.add(1);
        mylinkedhashset.add(2);
        mylinkedhashset.add(3);
        mylinkedhashset.add(4);
        mylinkedhashset.add(5);
        mylinkedhashset.add(6);

        System.out.println("My LinkedHashSet : ");
        Iterator<Integer> it = mylinkedhashset.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
