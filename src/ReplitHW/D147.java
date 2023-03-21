package ReplitHW;

public class D147 {
    String model;
    double price;
    int quantity;


    public D147(String model, double price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }

    public void printinfo() {
        double stcockValue = price * quantity;
        System.out.println(model + " StockValue " + stcockValue);
    }


    public static void main(String[] args) {
        D147 car1=new D147("Toyota 2019 ",50000,50);
        car1.printinfo();
        D147 car2=new D147("BMW 2019 ",54330,12);
        car2.printinfo();

    }
}