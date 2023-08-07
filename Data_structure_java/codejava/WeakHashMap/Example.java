package codejava.WeakHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class Example {
    public static void main(String[] args){
        Map <String,String> hashmap = new HashMap<String, String>() ;

        Map <String, String> weakhashmap = new WeakHashMap<String, String>();

        String keyhashmap = "keyHashMap";
        String keyWeakhashmap = "keyweakHashMap";
        hashmap.put(keyWeakhashmap,"Ankita");
        weakhashmap.put(keyWeakhashmap,"Atul");

        System.gc();

        System.out.println("Before : hash map value: "+hashmap.get("keyHashMap")+"and weak hash map value :"+weakhashmap.get("keyweakHashMap"));

        keyhashmap = null;
        keyWeakhashmap = null;
        System.gc();

        System.out.println("After : hash map value : "+hashmap.get("keyHashMap"+"and weak hash map value :"+weakhashmap.get("keyweakHashMap")));
    }
}
