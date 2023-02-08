package class19;

public class ConstructorChain {
    ConstructorChain(){
        System.out.println("Iam non agrument constructor" );
    }
    ConstructorChain(String str){
        this();
        System.out.println(str);
    }
    ConstructorChain(int number){
        this("hello");
        System.out.println("this is construter with int parameter");
    }

    public static void main(String[] args) {
        ConstructorChain obj=new ConstructorChain(10);
        System.out.println("--- End of the code -----");
    }
}
