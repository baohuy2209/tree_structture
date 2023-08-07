package codejava.Collection.IterateCollections.List;
import java.util.* ;
public class iteratinglistbywhileloop {
    public static void main(String[] args){
        System.out.println("Names : ");
        List<String> names = new ArrayList<>(Arrays.asList("Clementine", "Duran", "Mike"))  ;
        Iterator<String> it1 = names.iterator() ;
        while(it1.hasNext()){
            System.out.println(it1.next()) ;
        }

        System.out.println("Fruits : ") ;
        List<String> fruits = new ArrayList<>(Arrays.asList("apple", "strawberry", "banana", "orange")) ;
        Iterator<String> it2 = fruits.iterator() ;
        while(it2.hasNext()){
            System.out.println(it2.next()) ;
        }

        System.out.println("Subjects : ") ;
        List<String> subject = new ArrayList<>(Arrays.asList("math", "literature", "english", "biology", "physical", "chemistry", "history", "geography")) ;
        Iterator<String> it3 = subject.iterator() ;
        while(it3.hasNext()){
            System.out.println(it3.next()) ;
        }
    }
}
