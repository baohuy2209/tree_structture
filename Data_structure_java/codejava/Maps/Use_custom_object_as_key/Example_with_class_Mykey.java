package codejava.Maps.Use_custom_object_as_key;

import java.util.*;

class MyKey{
    private String name;
    public MyKey(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof MyKey){
            return this.name.equals(((MyKey)obj).name);
        }
        return false;
    }

    @Override
    public int hashCode(){
        return this.name.hashCode();
    }
}
public class Example_with_class_Mykey {
    public static void main(String[] args){
        Map<Integer, MyKey> myset_mykey = new HashMap<Integer ,MyKey>();
        myset_mykey.put(1, new MyKey("Nguyen Bao Huy")) ;
        myset_mykey.put(2, new MyKey("Nguyen Bao Khanh")) ;
        myset_mykey.put(3, new MyKey("Nguyen Thi Thuy")) ;
        myset_mykey.put(4, new MyKey("Tran Quoc Khanh")) ;
        myset_mykey.put(5, new MyKey("Nguyen Ngoc Bao Han")) ;

        Iterator<Map.Entry<Integer, MyKey>> it = myset_mykey.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer, MyKey> pair = it.next();
            System.out.println("Key : "+pair.getKey()+" Hashcode : "+pair.getValue().hashCode());
        }
    }
}
