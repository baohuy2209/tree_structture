package codejava.List.Sorting_a_generic_list;

class Date {
    private int date, month, year;
    public Date(){}
    public Date(int date, int month, int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate(){return this.date;}
    public int getMonth(){return this.month;}
    public int getYear(){return this.year;}

    public void setDate(int date){
        boolean bool = false;
        while(!bool){
            if(this.getMonth() == 1 || this.getMonth() == 3 || this.getMonth() == 5 || this.getMonth() == 7 || this.getMonth() == 8 || this.getMonth() == 10 || this.getMonth() == 12){
                if(date < 32 && date > 0) {
                    this.date = date;
                    bool = true;
                }else{
                    System.out.println("Invalid value !!!");
                }
            }
            if (this.getMonth() == 2){
                if(this.getYear()%4 == 0){
                    if(date < 30 && date > 0){
                        this.date = date;
                        bool = true;
                    }else{
                        System.out.println("Invalid value !!!");
                    }
                }else{
                    if (date < 29 && date > 0){
                        this.date = date;
                        bool = true;
                    }else{
                        System.out.println("Invalid value !!!");
                    }
                }
            }
            if (this.getMonth() == 4 || this.getMonth() == 6 || this.getMonth() == 9 || this.getMonth() == 11){
                if(date < 31 && date > 0){
                    this.date = date;
                    bool = true;
                }else{
                    System.out.println("Invalid value !!!");
                }
            }
        }
    }
    public void setMonth(int month){
        boolean bool = false;
        while(!bool){
            if(month > 12 || month < 0){
                System.out.println("Invalid value !!!");
            }else{
                this.month = month;
                bool = true;
            }
        }
    }
    public void setYear(int year){
        boolean bool = false;
        while(!bool){
            if(year > 0){
                this.year = year;
                bool = true;
            }else{
                System.out.println("Invalid value !!!");
            }
        }
    }

    @Override

    public String toString(){
        return String.format(this.getDate()+"/"+this.getMonth()+"/"+this.getYear());
    }
}

class Certificate{
    public Date Release_Date;
    public int Rank ;
    public String Degree_Place;

    public Certificate(Date Release_Date, int Rank, String Degree_Place){
        this.Release_Date = Release_Date;
        this.Rank = Rank;
        this.Degree_Place = Degree_Place;
    }

    /*
    Rank has 4 types: engineer, master, bachelor, doctoral,
    corresponding to 1 2 3 4
    * */

    public String getReleease_Date(){return this.Release_Date.toString();}
    public String getRank(){
        String rank = " ";
        switch (this.Rank){
            case 1:
                rank = "Engineer";
                break;
            case 2:
                rank = "Master";
                break;
            case 3:
                rank = "Bachelor";
                break;
            case 4:
                rank = "Doctoral";
                break;
        }
        return rank;
    }
    public String getDegree_Place() {return this.Degree_Place;}

    public void setRank(int rank){
        boolean bool = false;
        while(!bool){
            if(rank > 0 && rank < 5){
                this.Rank = rank;
                bool = true;
            }else{
                System.out.println("Let's check your result, it is invalid value. Please enter from 1 to 4 ");
            }
        }
    }

    public void setRelease_Date(Date rd) {this.Release_Date = rd;}
    public void setDegree_Place(String dp) {this.Degree_Place = dp;}

    @Override
    public String toString(){
        return String.format("+ Release Date : "+this.getReleease_Date()+"\n"+
                                "+ Rank : "+this.getRank()+"\n"+
                                "+Place get degreee : "+this.getDegree_Place()+"\n");
    }
}
class Employee implements Comparable<Employee> {
    private String fullname, gender, email, Phone ;
    private int age;
    private Long id;
    private Date birthday;

    public Employee(String fullname, String gender, String email, String Phone, int age, Long id, Date bir){
        this.fullname = fullname;
        this.gender = gender;
        this.email = email;
        this.Phone = Phone;
        this.age = age;
        this.id = id;
        this.birthday = new Date();
    }
    public String toString(){
        return String.format("Information : \n"
                +"+ Fullname : "+this.fullname+"\n"
                +"+ Age : "+this.age+"\n"
                +"+ Gender : "+this.gender+"\n"
                +"+ ");
    }

    @Override
    public int compareTo(Employee o) {
        return this.fullname.compareTo(o.fullname);
    }
}
public class Example_classemployee {
    public static void main(String [] args){

    }
}
