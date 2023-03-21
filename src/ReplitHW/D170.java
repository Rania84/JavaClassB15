package ReplitHW;

public class D170 {
    boolean m1;
    String m2;


    protected final void  printMethod (boolean m1){

        System.out.println("Final method with boolean parameter");

    }
    public  final  void printMethod  (String m2){
        System.out.println("Final method with string parameter");

    }

    public static void main(String[] args) {
        D170 main= new D170();
        main.printMethod(true);
        main.printMethod("words");
    }
}
