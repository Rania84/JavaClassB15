package project01.HomeWork11;

public class task6 {
    public static void main(String[] args) {
        // Write a program to swap 2 numbers without a temporary variable
        int x = 10;
        int y = 5;
        x=x*y;
        y=x/y;
        x=x/y;

        System.out.println("After swapping:" + " x = " + x + ", y = " + y);

        // x = (x * y) / (y = x); Diff way
    }
}
