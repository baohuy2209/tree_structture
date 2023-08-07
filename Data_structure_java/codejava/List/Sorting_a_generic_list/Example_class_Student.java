package codejava.List.Sorting_a_generic_list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Student implements Comparable<Student>{
    public String Fullname;
    public String gender;
    public String SchoolName;
    public int age;

    public Student(String fullname, String gender, String SchoolName, int age){
        this.Fullname = fullname;
        this.gender = gender;
        this.SchoolName = SchoolName;
        this.age = age;
    }

    public String toString(){
        return String.format("Information : \n" +
                "Fullname : %s \n Gender : %s \n School_Name: %s \n Age: %d",Fullname, gender, SchoolName, age);
    }
    @Override
    public int compareTo(Student o) {
        return Fullname.compareTo(o.Fullname);
    }
}
public class Example_class_Student {

    public static void main(String [] args){
        List<Student> mystudents = Arrays.asList(
                new Student("Nguyen Bao Huy", "Nam","THPT Quang Trung", 18),
                new Student("Nguyen Thuy Linh", "Nu","THPT Tay Son", 17),
                new Student("Tran Bao Khanh", "Nam","THPT Vo Lai", 16),
                new Student("Dang Bich Tram", "Nu","THPT Bac Ninh", 18),
                new Student("Nguyen Thi Thuy Nga", "Nu","THPT Quang Trung", 17),
                new Student("Nguyen Bao Luc", "Nam","THPT Quang Linh", 16),
                new Student("Nguyen Bao Chung", "Nam","THPT Nguyen Hue", 18),
                new Student("Nguyen Bich Diem", "Nu","THPT Vo Lai ", 18)
        );

        Collections.sort(mystudents);

        Iterator<Student> it = mystudents.iterator();

        while(it.hasNext()){
            System.out.print(it.next().toString()+"\n");
        }
    }
}
