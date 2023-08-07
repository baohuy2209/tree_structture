package codejava.List.Sorting_a_generic_list;

import java.util.Arrays;
import java.util.List;

class User implements Comparable<User>{
    public final Long id;
    public final String username;
    User(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    @Override
    public String toString(){
        return String.format("%s %d \n", username, id);
    }

    @Override
    public int compareTo(User o){
        return id.compareTo(o.id);
    }
}
public class Example_class_user {
    public static void main(String [] args){
        List<User> users = Arrays.asList(
                new User(33L, "BaoHuy_2209"),
                new User(23L, "NguyenHuy_314"),
                new User(34L, "Baohuy")
        );

        System.out.println(users);
    }
}
