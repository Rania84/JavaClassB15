package project2;
/*Create a Class Car that would have the
following fields: carPrice and color and method
calculateSalePrice() which should be returning
a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck
class has a field as weight and has its own
implementation of calculateSalePrice() method
in which returned price is calculated as
following: if weight>2000 then returned price
car should include 10% discount, otherwise 20%
discount.
The Sedan class has field as length and also
does it is own implementation of
calculateSalePrice(): if length of sedan is >20
feet then returned car price should include 5%
discount, otherwise 10% discount-*/
public class Car {
    double price;
    String color;
     public Car(double price,String color){
         this.price=price;
         this.color=color;
     }
     double calculateSalePrice(){
         return price;
     }
}
class Turck extends Car{
    double weight;

    public Turck(double price, String color,double weight) {
        super(price, color);
        this.weight=weight;
    }

    @Override
    double calculateSalePrice() {
        if(weight>2000) {
            return price - (price * .10);
        }
        return price - (price * .20) ;
    }
}
class Sedan extends Car{
      double length;
    public Sedan(double price, String color,double length) {
        super(price, color);
        this.length=length;

    }

    @Override
    double calculateSalePrice() {
        if (length>20){
            return price - (price * .05);
        }
        return price - (price * .10);
    }
        }



