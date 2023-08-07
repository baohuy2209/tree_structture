package codejava.Collection.Unmodifiable_Collection;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class MySet{
    private Set<Integer> set_int = new HashSet<Integer>();

    public void addValueToSet(int value){
        set_int.add(value);
    }

    public Set<Integer> GetSet(){
        return Collections.unmodifiableSet(set_int);
    }
}
public class Example_with_Set {
    public static void main(String[] args){
        MySet ms = new MySet();

        ms.addValueToSet(1);
        ms.addValueToSet(2);
        ms.addValueToSet(3);
        ms.addValueToSet(4);
        ms.addValueToSet(5);
        ms.addValueToSet(6);

        Set<Integer> myset = new HashSet<Integer>();

        myset = ms.GetSet();
        System.out.println("Print My set :");
        for (Integer i : myset) {
            System.out.println(i);
        }

        // myset.add(7); // throw UnsupportedOperationException exception
    }
}
