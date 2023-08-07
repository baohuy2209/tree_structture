package codejava.Collection.Unmodifiable_Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class MyMap{
    private Map<Integer, String> mymap = new HashMap<Integer, String>();

    public void addKey_ValueToMap(int key, String value){
        mymap.put(key, value);
    }

    public Map<Integer, String> GetMap(){
        return Collections.unmodifiableMap(mymap);
    }
}
public class Example_with_Map {
    public static void main(String [] args){
        MyMap mymap = new MyMap();

        mymap.addKey_ValueToMap(1, "Nguyen Bao Huy");
        mymap.addKey_ValueToMap(2, "Nguyen Bao Hung");
        mymap.addKey_ValueToMap(3, "Nguyen Bao Chi");
        mymap.addKey_ValueToMap(4, "Nguyen Bao Nguyen");
        mymap.addKey_ValueToMap(5, "Nguyen Bao Lan");
        mymap.addKey_ValueToMap(6, "Nguyen Kim Son");

        Map<Integer, String> map = new HashMap<Integer, String>();
        map = mymap.GetMap();

        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();

        while (it.hasNext()){
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey()+ ") " + entry.getValue());
        }

        // map.put(7, "Nguyen Ha Thu Lan"); => throw exception UnsupportedOperationException
    }
}
