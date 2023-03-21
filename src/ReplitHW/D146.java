package ReplitHW;

public class D146 {
    public String name;
    public String lastName;
    public int employeeID;
    public String startDate;
    public int salary;


    public D146 (){

    }

    public D146(String name, String lastName, int employeeID, String startDate, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.startDate = startDate;
        this.salary = salary;
    }
    public void printInfo() {
        System.out.println( name + " " + lastName + " " + employeeID + " " + startDate+" "+salary);
    }
    public static void main(String[] args) {

            D146 employee1=new D146();
            employee1.printInfo();
        D146 employee2 = new D146("Joe", "Smith", 12345, "01/01/1970", 35000);
        employee2.printInfo();
    }

}
