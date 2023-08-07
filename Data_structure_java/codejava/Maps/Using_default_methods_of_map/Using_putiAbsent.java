package codejava.Maps.Using_default_methods_of_map;

import java.util.HashMap;
import java.util.Map;

public class Using_putiAbsent {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");

        map.putIfAbsent(4, "four");
        map.forEach((key,value) -> System.out.println("Key : "+key+" Value : "+value));

    }
}
