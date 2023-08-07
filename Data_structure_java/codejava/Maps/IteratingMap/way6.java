package codejava.Maps.IteratingMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class way6 {
    public static void main(String [] args){
        Map<Integer, String> mymap = new HashMap<>();
        mymap.put(1,"Nguyen Bao Huy");
        mymap.put(2,"Nguyen Bao Thi");
        mymap.put(3,"Tran Bao Khanh");

        for(Iterator<Map.Entry<Integer, String>> it = mymap.entrySet().iterator(); it.hasNext() ;){
            Map.Entry<Integer, String> pair = it.next();

            System.out.println(pair.getKey()+") "+pair.getValue());
        }
    }
}
