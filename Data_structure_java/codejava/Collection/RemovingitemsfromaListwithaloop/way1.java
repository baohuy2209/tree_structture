package codejava.Collection.RemovingitemsfromaListwithaloop;

import java.util.*;

public class way1 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");

        Iterator<String> fruitIterator = fruits.iterator();

        while (fruitIterator.hasNext()) {
            String fruit = fruitIterator.next();
            System.out.println(fruit);
            if ("Apple".equals(fruit)) {
                fruitIterator.remove();
            }
        }

    }
}