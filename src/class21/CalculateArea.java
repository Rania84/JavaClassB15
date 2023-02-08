package class21;

public class CalculateArea {
    void calculateArea(int width, int length) {
        System.out.println("Area of rectangle is "+width * length);
    }

    void calculateArea(int side) {
        System.out.println("Area of square is "+side * side);
    }

    public static void main(String[] args) {
        CalculateArea area=new CalculateArea();
        area.calculateArea(10);
        area.calculateArea(10,20);
    }
}