package codejava.Maps.Using_default_methods_of_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Using_computeIfPresent {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");

        map.computeIfPresent(3, (k,v) -> v+"0");

        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer, String> pair = it.next();

            System.out.println("Key : "+pair.getKey()+" Value : "+pair.getValue());
        }
    }
}
