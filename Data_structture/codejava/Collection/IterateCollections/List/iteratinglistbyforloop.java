package codejava.Collection.IterateCollections.List;
import java.util.* ;
public class iteratinglistbyforloop {
    public static void main(String[] args){
        System.out.println("Names : ");
        List<String> names = new ArrayList<>(Arrays.asList("Clementine", "Duran", "Mike"))  ;
        for(int i = 0 ; i < names.size() ; i++){
            System.out.println(names.get(i)) ;
        }

        System.out.println("Fruits : ") ;
        List<String> fruits = new ArrayList<>(Arrays.asList("apple", "strawberry", "banana", "orange")) ;
        for(int i = 0 ; i < fruits.size() ; i++){
            System.out.println(fruits.get(i)) ;
        }
        System.out.println("Subjects : ") ;
        List<String> subject = new ArrayList<>(Arrays.asList("math", "literature", "english", "biology", "physical", "chemistry", "history", "geography")) ;
        for(int i = 0 ; i < subject.size() ; i++){
            System.out.println(subject.get(i)) ;
        }
    }
}
