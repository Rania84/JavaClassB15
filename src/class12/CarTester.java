package class12;

public class CarTester {
    public static void main(String[] args) {
        Car bmw= new Car();
        bmw.make="BMW";
                bmw.model="i7";
                bmw.year=2023;
                bmw.color="blue";
        bmw.moveForward();
        bmw.applybrakes();



        // Create two classes of your choice and call
        // the methods from those classes
        Car audi = new Car();
        audi.model = "E-tron";
        audi.make="Audi";
        audi.year=2022;
        audi.color="Black";
        audi.moveForward();

    }
}
