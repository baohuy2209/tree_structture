package codejava.Maps.IteratingMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class way8 {
    public static void main(String [] args){
        Map<Integer, String> mymap = new HashMap<>();
        mymap.put(1,"Nguyen Bao Huy");
        mymap.put(2,"Nguyen Bao Thi");
        mymap.put(3,"Tran Bao Khanh");

        mymap.entrySet().stream().parallel().forEach(e -> System.out.println(e.getKey()+") "+e.getValue()));
    }
}
