package codejava.Collection.Unmodifiable_Collection;

import java.util.*;

class MyPojo {
    private List<Integer> intList = new ArrayList<Integer>();

    public void addValueToIntList(int value){
        intList.add(value);
    }

    public List<Integer> GetIntegerList (){
        return Collections.unmodifiableList(intList);
    }
}
public class Example_With_List {
    public static void main(String[] args){
        MyPojo pj = new MyPojo();

        pj.addValueToIntList(1);
        pj.addValueToIntList(2);
        pj.addValueToIntList(3);
        pj.addValueToIntList(4);
        pj.addValueToIntList(5);


        List<Integer> mylist = pj.GetIntegerList();

        Iterator<Integer> it = mylist.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        mylist.add(6);
    }
}

/*
Sometime it's not a good practice expose an internal collection since it can lead to a malicious code vulnerable due to it's mutable characteristic.
In order to provide 'read-only' collections java provides its unmodifiable versions.

An unmodifiable collection is often a copy of a modifiable coleection which guarantees the collection itself cannot be altered.
Attempts to modify it will result in an UnsupportedOperationException exception.
* */