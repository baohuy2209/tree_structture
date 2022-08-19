package codejava.Collection.RemovingitemsfromaListwithaloop;

import java.util.*;
import java.util.stream.Collectors;

public class way3 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");

        List<String> filteredList = fruits.stream().filter(p -> !"Apple".equals(p)).collect(Collectors.toList());

        Iterator<String> it = filteredList.iterator();
        while (it.hasNext()) {
            String fruit = it.next();
            System.out.println(fruit);
        }
    }
}
