package codejava.LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Example {
    public static void main(String [] args){
        LinkedHashMap<String, String> mymap = new LinkedHashMap<>();
        mymap.put("1","one");
        mymap.put("2","two");
        mymap.put("3","three");

        Set myset = mymap.entrySet();
        Iterator i = myset.iterator();
        while(i.hasNext()){
            Map.Entry me = (Map.Entry) i.next();
            System.out.println(me.getKey()+ " : " +me.getValue());
        }

        System.out.println("The Key contains : "+mymap.containsKey("1")) ;
    }
}
