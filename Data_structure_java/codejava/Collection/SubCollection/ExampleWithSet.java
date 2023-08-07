package codejava.Collection.SubCollection;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set ;
import java.util.Arrays ;

public class ExampleWithSet {
    public static void main(String[] args){
        Set<Integer> numbers = new TreeSet<>(new HashSet<>()) ;
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7)) ;
        Set<Integer> sub1 = ((TreeSet<Integer>) numbers).subSet(1,4) ;
        Set<Integer> sub2 = ((TreeSet<Integer>) numbers).subSet(3,6) ;
        System.out.println("Sub set 1 : ");
        sub1.forEach(System.out::println);
        System.out.print("\n") ;
        System.out.println("Sub set 2 :");
        sub2.forEach(System.out::println) ;
    }
}
