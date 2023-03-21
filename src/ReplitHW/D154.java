package ReplitHW;

public class D154 {

    public D154() {
        System.out.println("Parent Constructor without argument");
    }

    public D154(int number) {
        System.out.println(number);

    }
}
     class Child extends D154 {
        public Child() {
            System.out.println("Child Constructor without argument");
        }

        public Child(int number){
        super(number);
    }

         public static void main(String[] args) {
            Child ch1=new Child();
            Child ch2=new Child(10);

         }
}