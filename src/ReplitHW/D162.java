package ReplitHW;

public class D162 {
    private static void m1() {
        System.out.println("static method without parameter");

    }

    private static void m1(String words) {
        System.out.println("static method with int parameter");

    }

    public static void main(String[] args) {
        D162.m1();
        D162.m1("name");

    }
}