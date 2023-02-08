package class16;

public class Students {
    //Create a Class called Students
    //Create three  variables  Name , ID  and  numberOfStudents
    //Create three objects of the Students Class
    //Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    //Print out  total number of students
    String Name;
    String ID;
   static int numberOfStudents;

    public static void main(String[] args) {
        Students student1=new Students();
        student1.Name="Zafer";
        student1.ID="A699";
        student1.numberOfStudents++;

        Students student2=new Students();
        student2.Name="Urwa";
        student2.ID="A399";
        student2.numberOfStudents++;

        Students student3=new Students();
        student3.Name="Olga";
        student3.ID="A659";
        student3.numberOfStudents++;
        System.out.println(Students.numberOfStudents);


    }
}
