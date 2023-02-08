package homework20;

public class Employee {
    //Create an Employee class that will have variables and methods.
    // Constructor that should initialize instance variables
    //Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
    //Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
    //Test your code!

    String name;
    int ID;

public Employee(String name,int ID){
    this.name=name;
    this.ID=ID;
}
void printName(){
    System.out.println(name);
}
void printID(){
    System.out.println(ID);
}
}

