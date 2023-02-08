package class17;

public class Dog {
    String name ;
    String breed ;
    String color;
    int age;
    double weight;
    Dog(String dogName,String dogBreed,String dogcolor,int dogAge,double dogWight){
        name= dogName;
        breed=dogBreed;
        color=dogcolor;
        age= dogAge;
        weight=dogWight;
    }
    void printInfo(){
        System.out.println("Name"+name+"breed"+breed+"age"+age+"weight"+weight);
    }
}




