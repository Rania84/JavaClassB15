package project2;

public class CarTester {
    public static void main(String[] args) {
        Car [] cars={ new Turck(10000,"blue",2800),new Sedan(8000,"red",1.5)};
        for (Car car:cars){
            System.out.println( " The price after discount is " +car.calculateSalePrice()+ " $");
        }
    }
}
