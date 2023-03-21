package ReplitHW;
public class AnimalD166 {
    String type;

    public AnimalD166(String type) {
        this.type = type;
    }

    void eat() {
        System.out.println(type+" eats");
    }

    void sleep() {

    }
}
class CAt extends AnimalD166{

    public CAt (String type) {
        super(type);
    }
     void sleep(){
         System.out.println(type+ " sleep a lot");

        }
    }
    class Kitten1 extends CAt{
        public Kitten1(String type) {
            super(type);
        }

        @Override
        void eat() {
            System.out.println(type+" eats milk");
        }
    }
class Kitten2 extends CAt{
    public Kitten2(String type) {
        super(type);
    }

    @Override
    void eat() {
        System.out.println(type+" eats snacks");
    }
}
class Kitten3 extends CAt{
    public Kitten3(String type) {
        super(type);
    }

    @Override
    void eat() {
        System.out.println(type+" eats eats everything");
    }

    public static void main(String[] args) {
        AnimalD166 [] animalD166= {new CAt("Cat"), new Kitten1("Kitten1"),new Kitten2("Kitten2"),new Kitten3("Kitten3")};
        for (AnimalD166 animals: animalD166){
            animals.eat();
            animals.sleep();

        }
    }
}








