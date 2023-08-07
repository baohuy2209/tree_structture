package codejava.Maps.Using_default_methods_of_map;

import java.util.HashMap;
import java.util.Map;

public class Using_forEach {
    public static void main(String [] args){
        Map<Integer, String> mymap = new HashMap<>();
        mymap.put(1, "one");
        mymap.put(2, "two");
        mymap.put(3, "three");

        mymap.forEach((key,value) -> System.out.println("Key : "+key+"; Value : "+value));
    }
}
