package ReplitHW;

public class D143 {
    public String name;
    public String model;
    public int numberOfDoor;
    public  int topSpeed;
    public double price;
    public D143(String name, String model, int numberOfDoor, int topSpeed, double price){
        this.model=model;
        this.name=name;
        this.numberOfDoor= numberOfDoor;
        this.price=price;
        this.topSpeed=topSpeed;
    }
    public D143(String name, String model, int topSpeed, double price){
        this(name,model,4,topSpeed,price);

    }
    public D143(int numberOfDoor, int topSpeed, double price){
        this("unknown","unkown",numberOfDoor,topSpeed,price);

    }
    public D143(String name, String model){

        this(name,model,90,0);
    }
    public void display(){
        System.out.println(name + " " + model + " " + numberOfDoor + " " + topSpeed + " " + price);
    }

    public static void main(String[] args) {
        D143 car1=new D143("Toyota", "Prius", 4, 120, 30000.0);
              car1.display();
        D143 car2=new D143("Toyota", "Prius", 4, 120, 30000.0);
        car2.display();

        D143 car3 = new D143(4, 120, 30000.0);
        car3.display();
        D143 car4=new D143("Toyota","Prius");
        car4.display();
        }
    }


