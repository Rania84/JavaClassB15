package ReplitHW;

public class D116 {
    boolean trust (int num1,int num2){
        if (num1%2==0&& num2 %2==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        D116 fact=new D116();
        System.out.println(fact.trust(3,4));
    }
}
