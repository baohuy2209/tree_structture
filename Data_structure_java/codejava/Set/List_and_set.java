package codejava.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List_and_set {
    public static void main(String[] args){
        System.out.println("List example : ... ");
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for(Integer temp : list){
            System.out.println(temp);
        }

        System.out.println(("Set example : ..."));
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);

        for(Integer temp : set){
            System.out.println(temp);
        }
    }
}
