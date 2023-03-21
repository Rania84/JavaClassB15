package ReplitHW;

public class D138 {
    private String method1(){
        return "private";
    }
    String method2(){
        return "default";
    }
    public String method3(){
        return "public";
    }
    protected String method4(){
        return "protected";
    }

    public static void main(String[] args) {
        D138 methods=new D138();
        System.out.println(methods.method1());
        System.out.println(methods.method2());
        System.out.println(methods.method3());
        System.out.println(methods.method4());
        }


    }

