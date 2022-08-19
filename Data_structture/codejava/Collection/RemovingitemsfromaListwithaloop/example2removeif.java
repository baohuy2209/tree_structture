package codejava.Collection.RemovingitemsfromaListwithaloop;

import java.util.*;

public class example2removeif {
    public static void display(List<String> lst) {
        Iterator<String> it = lst.iterator();
        while (it.hasNext()) {
            String obj = it.next();
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        List<String> subject = new ArrayList<String>();
        subject.add("math");
        subject.add("literature");
        subject.add("english");
        subject.add("biology");
        subject.add("physical");
        subject.add("chemistry");
        subject.add("history");
        subject.add("geography");

        System.out.println("Remove subjects : ");
        System.out.println("1. Remove math .");
        System.out.println("2. Remove literature .");
        System.out.println("3. Remove english .");
        System.out.println("4. Remove chemistry .");
        System.out.println("5. Remove biology .");
        System.out.println("6. Remove physical .");
        System.out.println("7. Remove history .");
        System.out.println("8. Remove geography .");
        System.out.println("9. Exit loop .");
        boolean check = true;

        while (check) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the operation : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    List<String> l1 = subject;
                    l1.removeIf(p -> "math".equals(p));
                    display(l1);
                    break;
                case 2:
                    List<String> l2 = subject;
                    l2.removeIf(p -> "literature".equals(p));
                    display(l2);
                    break;
                case 3:
                    List<String> l3 = subject;
                    l3.removeIf(p -> "english".equals(p));
                    display(l3);
                    break;
                case 4:
                    List<String> l4 = subject;
                    l4.removeIf(p -> "chemistry".equals(p));
                    display(l4);
                    break;
                case 5:
                    List<String> l5 = subject;
                    l5.removeIf(p -> "biology".equals(p));
                    display(l5);
                    break;
                case 6:
                    List<String> l6 = subject;
                    l6.removeIf(p -> "physical".equals(p));
                    display(l6);
                    break;
                case 7:
                    List<String> l7 = subject;
                    l7.removeIf(p -> "history".equals(p));
                    display(l7);
                    break;
                case 8:
                    List<String> l8 = subject;
                    l8.removeIf(p -> "geography".equals(p));
                    display(l8);
                    break;
                case 9:
                    check = true;
                    break;
                default:
                    System.out.println("Wrong entry !!!");
                    break;
            }
        }

        System.out.println();
    }
}
