package ReplitHW;

public class D163 {
    public void method(){
        System.out.println("Parent method");

    }
    static class Child extends D163{
        @Override
        public void method() {
            System.out.println("Child method");
        }
    }

    public static void main(String[] args) {
        D163 d163=new D163();
        d163.method();
        Child child= new Child();
        child.method();

    }
}
