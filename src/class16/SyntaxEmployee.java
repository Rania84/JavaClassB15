package class16;

public class SyntaxEmployee {

    /* Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects*/

    String empID;
    int salary;
    static String CEO = "Sumair";

    public static void main(String[] args) {
        SyntaxEmployee employee1 = new SyntaxEmployee();
        employee1.empID = "S888";
        employee1.salary = 7000;

        SyntaxEmployee employee2 = new SyntaxEmployee();
        employee2.empID = "R999";
        employee2.salary = 6000;


        System.out.println( employee1.empID );
        System.out.println( employee2.empID );
    }}