package class22;

public class Employee {
    String name ;
   static int basesalary=30000;
   static int baseHolidays=10;
    void printSalary(){
        System.out.println(basesalary);
    }
    void printHolidays(){
        System.out.println(baseHolidays);
    }
}
class officeBoy extends Employee{

}
class Manager extends Employee{
    @Override
    void printSalary() {
        System.out.println((basesalary*3)+200000);
    }
}
class Developer extends Employee{
    void printSalary() {
        System.out.println((basesalary*5)+200000);
    }
}
class QA extends Employee{
    void printSalary(){
        System.out.println(baseHolidays+5);
    }
}