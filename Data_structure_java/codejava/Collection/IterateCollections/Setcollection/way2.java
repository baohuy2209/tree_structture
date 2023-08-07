package codejava.Collection.IterateCollections.Setcollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class way2 {
    public static void main(String[] args){
        Set<Integer> numbers = new HashSet<>() ;
        numbers.add(1) ;
        numbers.add(2) ;
        numbers.add(3) ;
        numbers.add(4) ;
        numbers.add(5) ;
        numbers.add(6) ;
        numbers.add(7) ;
        numbers.add(8) ;

        Iterator<Integer> it = numbers.iterator() ;
        while(it.hasNext()){
            System.out.println(it.next()) ;
        }
    }
}
