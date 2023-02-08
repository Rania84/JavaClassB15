package class17;

public class Student {
    String name ;

    String ID;
    int age;
    double weight;
    Student(String firstName,  String id, int theAge, double theWight){
        name= firstName;
        ID=id;
        age= theAge;
        weight=theWight;
    }
    void printInfo(){
        System.out.println("Student name is "+name+" the student ID # "+ID+" the age is"+age+" the weight is "+weight);
    }
}



