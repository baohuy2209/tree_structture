package codejava.Collection.RemovingitemsfromaListwithaloop;

import java.util.*;

public class way2 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");

        for (int i = (fruits.size() - 1); i >= 0; i--) {
            System.out.println(fruits.get(i));
            if ("Apple".equals(fruits.get(i))) {
                fruits.remove(i);
                i--;
            }
        }
    }
}
