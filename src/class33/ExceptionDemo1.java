package class33;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        System.out.println("line 1");
        System.out.println("line 2");
        System.out.println("line3 ");
        System.out.println("line 4");
        System.out.println("line 5");
        System.out.println("line 6");
        try {
            System.out.println(10/0);
           /* String name =null;
            System.out.println(name.length());*/
        } catch (NullPointerException npe) {
            System.out.println("we are trying to access amethod on anull object");

        }catch (ArithmeticException e){
            System.out.println("some one is trying to divide by 0");
        }
        catch (Exception e){
            System.out.println("something went wrong");
        }
        System.out.println("line 7");
        System.out.println("line 8 ");
        System.out.println("line 9 ");

    }
}
