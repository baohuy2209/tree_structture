package codejava.Collection.SubCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleWithList {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11)) ;
        List<Integer> sub1 = numbers.subList(0,3) ;
        List<Integer> sub2 = numbers.subList(5,8) ;
        System.out.println("Sub list 1 : ");
        sub1.forEach(System.out::println);
        System.out.println() ;
        System.out.println("Sub list 2 : ");
        sub2.forEach(System.out::println);
    }
}
