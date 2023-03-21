package ReplitHW;

public class ChildInterface implements ParentInterFaceD176 {
    public void childMeth() {
        System.out.println("Child Method-hello Syntax");
    }

    @Override
    public void parentMethod() {
        System.out.println("Parent Method-welcome to Syntax");


    }

}
class Main7 extends ChildInterface{
    public static void main(String[] args) {
        Main7  output=new Main7();
        output.parentMethod();
        output.childMeth();
    }

}
