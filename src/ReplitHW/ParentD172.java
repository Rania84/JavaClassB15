package ReplitHW;

public class ParentD172 {

         public void m1() {

        }

         public void m2() {
            System.out.println("Parent class providing implementation");
        }

    }
    class Main3 extends ParentD172 {
        public void m1() {
            System.out.println("Child class providing implementation");

        }

        public static void main(String[] args) {
            Main3 main3=new Main3();
            main3.m1();
            main3.m2();

        }
    }

