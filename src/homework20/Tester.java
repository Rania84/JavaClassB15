package homework20;

public class Tester extends FullTime {
     double overTime;
     Tester(String name, int ID,String title,double overTime){
         super(name,ID,title);
         this.overTime=overTime;
     }
     void printOverTime(){
         System.out.println(overTime);
     }

    public static void main(String[] args) {
        Employee employee=new Employee("Tom",123);
        employee.printName();
        employee.printID();

        FullTime fullTime=new FullTime("Rony",235,"Customer Service");
        fullTime.printTitle();
        fullTime.printName();
        fullTime.printID();

        PartTime partTime=new PartTime("Rio",56,"FrontDesk",3);
        partTime.printName();
        partTime.printID();
        partTime.printTitle();
        partTime.printTimeOfContract();

        Tester tester=new Tester("Mia",653,"Tec.",3.5);
        tester.printName();
        tester.printID();
        tester.printTitle();
        tester.printOverTime();

    }
}
