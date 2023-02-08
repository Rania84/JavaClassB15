package class20;

public class Sport {
    String name;
    String country;


    Sport(String name,String country) {
        this.name = name;
        this.country = country;
    }
    public void display(){
        System.out.println(name+"is play in"+country);
    }

    }
class Cricket extends Sport{
    String helmet;
    Cricket(String name,String country,String helmet){
        super(name,country);
        this.helmet=helmet;

    }
}
class Soccer extends Sport{
    String team;
    int numPlayer;
    Soccer(String name, String country,String team, int numPlayer){
        super(name,country);

         this.team= team;
         this.numPlayer=numPlayer;
    }
    void displayTeam(){
        System.out.println(team+"consist of"+numPlayer+"players");
    }
}
