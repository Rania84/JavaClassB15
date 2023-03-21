package ReplitHW;

public class D160 {
    public void display(int number){
        System.out.println(number);
    }
    public void display (String words){
        System.out.println(words);
    }
    public void display(double num){
        System.out.println(num);
    }

    public static void main(String[] args) {
        D160 d160= new D160();
        d160.display(100);
        d160.display("Syntax Technologies");
        d160.display(100.09);
    }
}
