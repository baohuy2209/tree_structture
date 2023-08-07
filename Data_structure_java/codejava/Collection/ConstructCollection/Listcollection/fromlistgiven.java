package codejava.Collection.ConstructCollection.Listcollection;

import java.util.*;

public class fromlistgiven {
    public static void main(String[] args ){
        List<String> name = new ArrayList<>() ;
        name.add("huy") ;
        name.add("luan") ;
        name.add("dung") ;
        name.add("nga") ;
        List<String> name2 = new ArrayList<>() ;
        name2.addAll(name) ; // add lists given to new list.
        Iterator<String> it =name2.iterator() ;
        while(it.hasNext()){
            System.out.println(it.next()) ;
        }

        System.out.println(" ") ;
    }
}
