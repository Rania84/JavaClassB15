package ReplitHW;

public class D122 {
    String nameOfcountry;
    String capital;
    int populationSize;
    public D122(){

    }

    public static void main(String[] args) {
         D122 main=new D122();
         main.capital="USA";
         main.nameOfcountry="Washington DC";
        main.populationSize=330000000;

        D122 main1= new D122();
        main1.capital="Kazakhstan";
        main1.nameOfcountry="Astana";
        main1.populationSize=18500000;
        System.out.println("The capital of "+ main.capital +" is " + main.nameOfcountry +" and population is " + main.populationSize);
        System.out.println("The capital of "+ main1.capital +" is " + main1.nameOfcountry +" and population is " + main1.populationSize);

    }
}
