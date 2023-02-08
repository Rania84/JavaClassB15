package class19;

public class Donkey {
    String name;
    int age;
    double wieght;

    Donkey(String donname,int donAge){
        name=donname;
        age=donAge;
    }
    void print(){
        System.out.println("Donkey's is name  "+name+" age is "+age+"and wieght is"+wieght);
    }
}
