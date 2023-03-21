package ReplitHW;

public class D155A {
    public D155A() {
        System.out.println("I");
    }
}
     class B2 extends D155A {
         public B2() {
             System.out.println("am");
         }
     }
       class C2 extends B2 {
           public C2() {
               super();
               System.out.println("Taster");

           }

           public static void main(String[] args) {
               C2 c =new C2();
           }}





