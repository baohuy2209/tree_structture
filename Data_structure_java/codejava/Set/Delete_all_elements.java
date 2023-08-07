package codejava.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Delete_all_elements {
    public static void main(String [] args) {
        Set<Integer> myset = new HashSet<>();
        myset.add(1);
        myset.add(2);
        myset.add(3);
        myset.add(4);
        myset.add(5);
        System.out.println("Before delete");
        Iterator<Integer> it = myset.iterator();
        System.out.println("My set :");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("After delete");
        myset.clear();
        System.out.println("My set :");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
