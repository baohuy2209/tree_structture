package codejava.TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap_of_a_simple_Java_type {
    public static void main(String[] args){
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        tm.put(1,"Nguyen Bao Huy ");
        tm.put(2,"Nguyen Bao Khanh ");
        tm.put(3,"Nguyen Bao Thy ");
        tm.put(4,"Tran Thi Diep ");
        tm.put(5,"Du Quoc Dong ");
        tm.put(6,"Nguyen Khanh Ngan  ");
        tm.put(7,"Nguyen Bao Linh ");

        System.out.println(tm.firstEntry());
        System.out.println(tm.lastEntry());
        System.out.println(tm.size());
        System.out.println(tm.get(1));
        System.out.println(tm.get(9));

        for(Map.Entry<Integer, String> entry : tm.entrySet()){
            System.out.println(entry + " ");
        }

        Iterator<Map.Entry<Integer, String>> it = tm.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer, String> m = it.next();
            System.out.println(m.getKey()+" : "+m.getValue());
        }
    }
}
