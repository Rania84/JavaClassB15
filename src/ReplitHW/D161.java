package ReplitHW;

public class D161 {
    private static void m1(){
        System.out.println("private m1 method");

    }
    private static void m1 (String words){
        System.out.println("private m1 method with int parameter");

    }

    public static void main(String[] args) {
     D161.m1();
      D161.m1("name");

    }
}
