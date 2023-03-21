package class33;

public class ExceptionDeme3 {
    public static void main(String[] args) {
        System.out.println("line 1");
        System.out.println("line 2");
        System.out.println("line3 ");
        System.out.println("line 4");
        System.out.println("line 5");
        System.out.println("line 6");
        // here we put the code which might throw an error
        System.out.println(10/0);
        String str="Java";
        str.charAt(10);

        System.out.println("line 7");
        System.out.println("line 8 ");
        System.out.println("line 9 ");

    }
}
