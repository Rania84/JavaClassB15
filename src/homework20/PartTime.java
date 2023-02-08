package homework20;

public class PartTime extends FullTime{
    int timeOfContract;
    PartTime(String name,int ID,String title,int TimeOfContract){
        super(name, ID, title);
        this.timeOfContract=TimeOfContract;

    }
    void printTimeOfContract(){
        System.out.println(timeOfContract);
    }
}
