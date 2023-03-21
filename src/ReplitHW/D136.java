package ReplitHW;

public class D136 {
    private void privateMethod(){
        System.out.println("This is Private Method");

    }
    void defaultMethod(){
        System.out.println("This is Default Method");
    }
protected void protectedMethod(){
    System.out.println("This is Protected Method");
}
public void puipleMethod(){
    System.out.println("This is Public Method");
}

    public static void main(String[] args) {
        D136 accessModifier=new D136();
        accessModifier.privateMethod();
        accessModifier.defaultMethod();
        accessModifier.protectedMethod();
        accessModifier.puipleMethod();


    }
    }

