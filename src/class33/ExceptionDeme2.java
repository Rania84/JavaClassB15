package class33;

public class ExceptionDeme2 {
    public static void main(String[] args) {
        System.out.println("line 1");
        System.out.println("line 2");
        System.out.println("line3 ");
        System.out.println("line 4");
        System.out.println("line 5");
        System.out.println("line 6");
        try {
           System.out.println(10/0);

            //int[]arr=new int [-5];

           /* String name =null;
            System.out.println(name.length());*/
        } catch (NullPointerException npe) {
            System.out.println("we are trying to access amethod on anull object");

        }catch (ArithmeticException e){
            System.out.println("some one is trying to divide by 0");
        }
        catch (Exception e){  // this is Generic one and the parant for all the exception.
            System.out.println("something went wrong");
        }
        System.out.println("line 7");
        System.out.println("line 8 ");
        System.out.println("line 9 ");

    }
}
