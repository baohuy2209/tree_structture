package codejava.Collection.IterateCollections.List;

import java.util.*;

public class iteratingonlistforEach {
    public static void main(String[] args){
        System.out.println("Names : ") ;
        List<String> names = new ArrayList<>(Arrays.asList("Clementine", "Duran", "Mike"))  ;
        names.forEach(System.out::println);
        System.out.println("\n") ;
        System.out.println("Fruits : ") ;
        List<String> fruits = new ArrayList<>(Arrays.asList("apple", "strawberry", "banana", "orange")) ;
        fruits.forEach(System.out::println);
        System.out.println("\n") ;
        System.out.println("Subjects : ") ;
        List<String> subject = new ArrayList<>(Arrays.asList("math", "literature", "english", "biology", "physical", "chemistry", "history", "geography")) ;
        subject.forEach(System.out::println);
    }
}
