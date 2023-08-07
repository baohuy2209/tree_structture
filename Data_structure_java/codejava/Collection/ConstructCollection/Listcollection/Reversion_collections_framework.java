package codejava.Collection.ConstructCollection.Listcollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Reversion_collections_framework {
    public static void main(String [] args){
        List<String> listperson = Arrays.asList("huy", "bao", "nguyen");

        System.out.println("Print List of people : ");
        Iterator<String> it1 = listperson.iterator();
        while(it1.hasNext()){
            String key = it1.next();

            System.out.println(key);
        }

        System.out.println("==========================================");

        Integer[] array = new Integer[] {1,2,3,4,5,6,7,8,9};

        List<Integer> listinteger = Arrays.asList(array);
        System.out.println("Print List of Number :");
        Iterator<Integer> it2 = listinteger.iterator();
        while(it2.hasNext()){
            Integer val = it2.next();
            System.out.print(val+" ");
        }
        System.out.println("\n");
        System.out.println("==========================================");

        List<List<String>> list_information_person = new ArrayList<List<String>>();

        List<String> per_1 = new ArrayList<String>();
        per_1.add("Nguyen Bao Huy");
        per_1.add("Nam");
        per_1.add("18");

        List<String> per_2 = new ArrayList<String>();
        per_2.add("Nguyen Thi Thuy Chi ");
        per_2.add("Nam");
        per_2.add("18");

        List<String> per_3 = new ArrayList<String>();
        per_3.add("Nguyen Ha Diep Linh");
        per_3.add("Nu");
        per_3.add("17");

        list_information_person.add(per_1);
        list_information_person.add(per_2);
        list_information_person.add(per_3);
        int i = 1;
        System.out.println("List information : ");
        Iterator<List<String>> it3 = list_information_person.iterator();
        while(it3.hasNext()){
            Iterator<String> it = it3.next().iterator();
            System.out.print(i+") ");
            while(it.hasNext()){
                System.out.print(it.next()+" ") ;
            }
            i += 1;
            System.out.println("\n");
        }
    }
}
