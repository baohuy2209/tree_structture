package codejava.Collection.ImmutableEmptyCollections;

import java.util.Collections;
import java.util.Set;

public class ExampleWithSet {
    public static void main(String [] args){
        Set<Integer> set = Collections.emptySet() ;
        set.forEach(System.out::println);
    }
}
