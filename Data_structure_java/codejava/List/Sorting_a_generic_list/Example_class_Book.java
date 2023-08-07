package codejava.List.Sorting_a_generic_list;

class Book{
    private String author ;
    private int Number_of_pages;
    private Date Release_date;

    public Book(String author, int num, Date rd){
        this.author = author ;
        this.Number_of_pages = num;
        this.Release_date = rd;
    }

    public String getAuthor() {return this.author;}
    public int getNumber_of_pages() {return this.Number_of_pages;}
    public String getRealease_Date() {return this.Release_date.toString();}

}
public class Example_class_Book {
    public static void main(String [] args){

    }
}
