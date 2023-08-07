package codejava.Collection.ConstructCollection.Listcollection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class byCollectionsFramework {
    public static void main(String[] args) {
        List<String> datas = Arrays.asList("huy", "luan", "dung", "nga");

        System.out.println("Print list : ");
        Iterator<String> it = datas.iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key);
        }
    }
}
