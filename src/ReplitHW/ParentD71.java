package ReplitHW;

public abstract class ParentD71 {
       public abstract void m1();
       public abstract void m2( String Parameter);
    }
    class Main1 extends ParentD71 {

        @Override
        public void m1() {
            System.out.println("m1 without parameters");
        }

        @Override
        public void m2(String Parameter) {
            System.out.println("m1 method with parameter");
        }

        public static void main(String[] args) {
            Main1 main1=new Main1();
            main1.m1();
            main1.m2("parameter");

        }
    }