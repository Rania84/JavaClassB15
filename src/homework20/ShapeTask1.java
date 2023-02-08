package homework20;

public class ShapeTask1 {
    //Write program: Shape class has a constructor that takes the radius and
    // has a subclass as  circle class. In circle class create
    // a method to calculate the area of circle. Test your code
    double radius;
    public ShapeTask1(double radius){
        this.radius=radius;
    }
}
class Circle extends ShapeTask1{

     Circle(double radius) {
        super(radius);

    }
    void areaOfCircle(){
        System.out.println(Math.PI*radius*radius);
    }

    public static void main(String[] args) {
        Circle circle=new Circle(4.5);
        circle.areaOfCircle();
    }
}