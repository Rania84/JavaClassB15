package homework20;

public class FullTime extends Employee {
    String title;
    FullTime(String name, int ID, String title){
        super(name, ID);
        this.title= title;

    }
   void printTitle(){
       System.out.println(title);
   }
}
