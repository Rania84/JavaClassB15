package ReplitHW;


public class D87 {
    String Color;
    int year;
    String Make;

    public static void main(String[] args) {
        D87 car1=new D87();
        car1.Color="Black";
        car1.year=2019;
        car1.Make="BMW";
        D87 car2=new D87();
        car2.Color="White";
        car2.year=2018;
        car2.Make="Toyota";
        System.out.println("Car color is "+car1.Color+" and car year is "+car1.year+" and car model is "+car1.Make);
        System.out.println("Car color is "+car2.Color+" and car year is "+car2.year+" and car model is "+car2.Make);

    }

}
