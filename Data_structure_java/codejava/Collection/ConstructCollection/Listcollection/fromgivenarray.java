package codejava.Collection.ConstructCollection.Listcollection;

import java.util.List;
import java.util.Iterator;
import java.util.Arrays;

public class fromgivenarray {
    public static void main(String[] args) {
        Integer[] array = new Integer[] { 1, 2, 3, 4, 5, 6, 7 };
        List<Integer> datas = Arrays.asList(array);
        Iterator<Integer> it = datas.iterator();
        while (it.hasNext()) {
            Integer value = it.next();
            System.out.println(value);
        }
    }
}
