package ReplitHW;

public class D88 {
  //  In this class, you should specify the following attributes:
    //  breed, name, color, and
    //  following behaviors: bark(), run(), play().
    String name;
    String breed;
    String color;
    void bark(){ System.out.println(breed+"can play");}
        void run(){ System.out.println(breed +"can run");}
    void play(){
        System.out.println(breed+"can play");
    }

    public static void main(String[] args) {
        D88 dog1=new D88();
        dog1.name="Husky";
        System.out.println(dog1.name);


    }



}
