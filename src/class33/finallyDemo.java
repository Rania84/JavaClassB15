package class33;

public class finallyDemo {
    public static void main(String[] args) {

        System.out.println("1");

        try {
            System.out.println("2");
            //System.out.println(10/0);
            String name=null;
            name.length();
            System.out.println("3");

        } catch (ArithmeticException ae) {
            System.out.println("4");
            System.out.println(10/0);
            System.out.println("5");

        } finally {
            System.out.println("will always be executed");
        }
        System.out.println("6");
    }
}
