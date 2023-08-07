package codejava.Maps.IteratingMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class way4 {
    public static void main(String [] args){
        Map<Integer, String> mymap = new HashMap<>();
        mymap.put(1,"Nguyen Bao Huy");
        mymap.put(2,"Nguyen Bao Thi");
        mymap.put(3,"Tran Bao Khanh");

        System.out.println("Key : ");
        for(Integer key : mymap.keySet()){
            System.out.println(key);
        }

        System.out.println("Value : ");
        for(String value : mymap.values()){
            System.out.println(value);
        }
    }
}
