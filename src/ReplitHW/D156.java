package ReplitHW;

public class D156 {
     public int i=10;
}
 class Bbb extends D156 {
     public int i = 20;

     public void printInfo() {
         System.out.println(i);
         System.out.println(super.i);

     }


     public static void main(String[] args) {
         Bbb obj = new Bbb();
         obj.printInfo();
     }
 }