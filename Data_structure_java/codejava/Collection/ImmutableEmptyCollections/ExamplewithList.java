package codejava.Collection.ImmutableEmptyCollections;

import java.util.Collections;
import java.util.List;

public class ExamplewithList {
    public static void main(String[] args){
        List<String> anEmptyList = Collections.emptyList() ;
        anEmptyList.forEach(System.out::println);
    }
}
