package codejava.Collection.ImmutableEmptyCollections;

import java.util.Collections;
import java.util.Map;

public class ExampleWithMap {
    public static void main(String[] args){
        Map<String, String> map = Collections.emptyMap() ;
        map.forEach((k,v) -> System.out.println(k+" "+v));
    }
}
