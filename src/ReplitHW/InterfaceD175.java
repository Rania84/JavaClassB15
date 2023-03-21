package ReplitHW;

public interface InterfaceD175 {
    interface firstInterface{
        void firstMethod();
    }
    interface secondInterface{
        void SecondMethod();

    }
    class Main implements firstInterface,secondInterface{

        @Override
        public void firstMethod() {
            System.out.println("First Method implementing multiple Inheritance");
        }

        @Override
        public void SecondMethod() {
            System.out.println("Second Method implementing multiple Inheritance");
        }
    }

    public static void main(String[] args) {
        Main main=new Main();
        main.firstMethod();
        main.SecondMethod();
    }

}
