package codejava.Maps.IteratingMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class way5 {
    public static void main(String [] args){
        Map<Integer, String> mymap = new HashMap<>();
        mymap.put(1,"Nguyen Bao Huy");
        mymap.put(2,"Nguyen Bao Thi");
        mymap.put(3,"Tran Bao Khanh");

        System.out.println("Key of map : ");
        Iterator<Integer> itkey = mymap.keySet().iterator();
        while(itkey.hasNext()){
            System.out.println(itkey.next());
        }

        System.out.println("Value of map :");
        Iterator<String> itvalue = mymap.values().iterator();
        while(itvalue.hasNext()){
            System.out.println(itvalue.next());
        }
    }
}
