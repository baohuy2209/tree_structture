package codejava.Collection.IterateCollections.Setcollection;
import java.util.* ;
public class way1 {
    public static void main(String[] args){
        Set<Integer> numbers = new HashSet<>() ;
        numbers.add(1) ;
        numbers.add(2) ;
        numbers.add(3) ;
        numbers.add(4) ;
        numbers.add(5) ;
        numbers.add(6) ;
        numbers.add(7) ;
        numbers.add(8) ;

        numbers.forEach(System.out::println);

    }
}
