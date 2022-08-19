package codejava.Collection.IterateCollections.Map;
import java.util.* ;
public class way1_1 {
    public static void main(String[] args){
        Map<String, Integer> markmath = new HashMap<>() ;
        markmath.put("Nguyen Bao Huy ", 10) ;
        markmath.put("Tran Thanh Luan ", 9) ;
        markmath.put("Nguyen Duy Buu ", 8) ;
        markmath.put("Ho Quoc Dat ", 7) ;
        markmath.put("Nguyen Duy Tien ", 5) ;
        markmath.put("Dang Thi Cam Thu ", 3) ;
        markmath.put("Nguyen Tran Quoc Bao ", 8) ;
        markmath.put("Nguyen Duy Nam ", 5) ;
        markmath.put("Nguyen Thang Loi  ", 9) ;
        markmath.put("Cao Ky Duyen ", 7) ;
        markmath.put("Doan Tran Quoc Bao ", 10) ;
        Iterator<Map.Entry<String, Integer>> entry1 = markmath.entrySet().iterator() ;
        System.out.println("Result of math test : ") ;
        while(entry1.hasNext()){
            Map.Entry<String, Integer> pair1 = entry1.next() ;
            System.out.println("+ "+pair1.getKey()+" : "+pair1.getValue()) ;
            System.out.println(" ") ;
        }

        Map<Integer, String> listofstudent = new HashMap<>() ;
        listofstudent.put(1, "Nguyen Bao Huy");
        listofstudent.put(2, "Tran Thanh Luan");
        listofstudent.put(3, "Nguyen Duy Buu");
        listofstudent.put(4, "Ho Quoc Dat");
        listofstudent.put(5, "Nguyen Duy Tien");
        listofstudent.put(6, "Dang Thi Cam Thu");
        listofstudent.put(7, "Nguyen Tran Quoc Bao");
        listofstudent.put(8, "Nguyen Duy Nam");
        listofstudent.put(9, "Nguyen Thang Loi");
        listofstudent.put(10, "Cao Ky Duyen");
        listofstudent.put(11, "Doan Tran Quoc Bao");
        Iterator<Map.Entry<Integer, String>> entry2 = listofstudent.entrySet().iterator() ;
        System.out.println("List of students : ") ;
        while(entry2.hasNext()){
            Map.Entry<Integer, String> pair2 = entry2.next() ;
            System.out.println("+ "+pair2.getKey()+")"+pair2.getValue()) ;
            System.out.println(" ") ;
        }

        Map<String, String> typeofconduct = new HashMap<>() ;
        typeofconduct.put("Nguyen Bao Huy ", "tot") ;
        typeofconduct.put("Tran Thanh Luan ", "kha") ;
        typeofconduct.put("Nguyen Duy Buu ", "tot") ;
        typeofconduct.put("Ho Quoc Dat ", "trung binh") ;
        typeofconduct.put("Nguyen Duy Tien ", "kha") ;
        typeofconduct.put("Dang Thi Cam Thu ", "tot") ;
        typeofconduct.put("Nguyen Tran Quoc Bao ", "Kha") ;
        typeofconduct.put("Nguyen Duy Nam ", "tot") ;
        typeofconduct.put("Nguyen Thang Loi  ", "kha") ;
        typeofconduct.put("Cao Ky Duyen ", "kha") ;
        typeofconduct.put("Doan Tran Quoc Bao ", "trung binh") ;

        Iterator<Map.Entry<String, String>> entry3 = typeofconduct.entrySet().iterator() ;
        System.out.println("type of conduct of students : ") ;
        while(entry3.hasNext()){
            Map.Entry<String, String> pair3 = entry3.next() ;
            System.out.println("+ "+pair3.getKey()+" : "+pair3.getValue()) ;
            System.out.println(" ") ;
        }

    }
}
