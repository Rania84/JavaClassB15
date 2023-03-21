package ReplitHW;

public class D157 {
    public static void main(String[] args) {
    Child1 a= new Child1();
    a.m2();
}
     void m1() {
         System.out.println("m1 method in parent class");

    }
    public static class Child1 extends D157 {
        @Override
        void m1() {
            System.out.println("m1 method in child class");
        }

        public void m2() {
            this.m1();
            super.m1();
        }
    }


}
