package codejava.Collection.ConstructCollection.Mappingcollection;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class byCollectionsFramework {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "huy");
        map.put(2, "luan");
        map.put(3, "dung");
        map.put(4, "nga");

        Iterator<Map.Entry<Integer, String>> entry = map.entrySet().iterator();
        while (entry.hasNext()) {
            System.out.println(entry.next());
        }
    }
}
