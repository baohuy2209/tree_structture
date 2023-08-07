package codejava.List.Sorting_a_generic_list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Covert_List_Integer_to_String {
    public static void main(String [] args){
        List<Integer> nums = Arrays.asList(1,2,3,4,5);

        List<String> strings = nums.stream().map(Object::toString).collect(Collectors.toList());

        Iterator<String> it = strings.iterator();

        while(it.hasNext()){
            System.out.println(it.next() instanceof String) ;
        }
    }
}
