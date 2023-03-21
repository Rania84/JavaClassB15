package project2;
/*Create an Interface 'Shape' with undefined
        methods as calculateArea and
        calculatePerimiter. Create 2 classes Circle &
        Square that implements functionality defined in
        the Shape Interface. Test your code.*/
public interface Shape {
    void calculateArea();
    void calculatePerimeter();
}

      class Circle implements Shape{
       double radius;
          Circle(double radius) {
              this.radius=radius;
          }
          @Override
    public void calculateArea() {
              double area= Math.PI*(radius*radius);
              System.out.println("the Area of circle is "+ area);
    }
    @Override
    public void calculatePerimeter() {
              double perimeter= 2*radius*Math.PI;
        System.out.println("the perimeter of the circle is "+perimeter);
    }
}
    class Square implements Shape{
          double side;
          Square(double side){
              this.side=side;
          }

        @Override
        public void calculateArea() {
            double area= side*side;
            System.out.println("the Area of square is" + area);

        }

        @Override
        public void calculatePerimeter() {
            double perimeter= 4*side;
            System.out.println("the perimeter of the square is " + perimeter);

        }
    }

