package codejava.Collection.ConstructCollection.Mappingcollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Reversion_map_collection {
    public static void main(String[] args){
        Map<String, String> map_name = new HashMap<String, String>();

        map_name.put("1", "Nguyen Bao Huy");
        map_name.put("2", "Nguyen Thi Thuy Chi");
        map_name.put("3", "Tran Quoc Khanh");
        map_name.put("4", "Do Gia Lieu");
        map_name.put("5", "Banh Thi Teo");

        Iterator<Map.Entry<String, String>> mapIterator = map_name.entrySet().iterator();

        while(mapIterator.hasNext()){
            System.out.println(mapIterator.next());
        }
    }
}
