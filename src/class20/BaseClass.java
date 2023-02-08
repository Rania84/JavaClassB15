package class20;

public class BaseClass {
    String name=" Jhon";
    void hello(){
        System.out.println("Hello method from baseClass");
    }
}
class Child extends BaseClass{
    String name="Jane";
    void callMe(){
        System.out.println(name);
        System.out.println(super.name);
    }
    void hello() {
        System.out.println("Hello method fron child class");
    }
    public static void main(String[] args) {
        Child child=new Child();
        child.callMe();
    }
    void calligParentMethod(){
        super.hello();
    }
    }