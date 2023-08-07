package codejava.Maps.Using_default_methods_of_map;

import java.util.HashMap;
import java.util.Map;

public class Using_getOrDefault {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");

        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        System.out.println(map.get(4));
        System.out.println(map.getOrDefault(4, "Default element!!!"));
    }
}
