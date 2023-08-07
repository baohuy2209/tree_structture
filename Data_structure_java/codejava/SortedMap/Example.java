package codejava.SortedMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;

public class Example {
    public static void main(String[] args){
        TreeMap <String, Double> tm = new TreeMap<>();
        tm.put("1", 123.31);
        tm.put("2", 213.23);
        tm.put("3", 324.324);
        tm.put("4", 45234.3324);

        Set myset = tm.entrySet();
        Iterator i = myset.iterator();
        while(i.hasNext()) {
            Map.Entry<String, Double> pair = (Map.Entry) i.next();
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
}
