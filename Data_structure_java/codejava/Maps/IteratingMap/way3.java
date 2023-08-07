package codejava.Maps.IteratingMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class way3 {
    public static void main(String [] args){
        Map<Integer, String> mymap = new HashMap<>();
        mymap.put(1,"Nguyen Bao Huy");
        mymap.put(2,"Nguyen Bao Thi");
        mymap.put(3,"Tran Bao Khanh");

        Iterator<Map.Entry<Integer, String>> it = mymap.entrySet().iterator();
        System.out.println(("My map : "));
        mymap.forEach((k,v) -> System.out.println(k+") "+v));
    }
}
