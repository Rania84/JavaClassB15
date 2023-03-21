package ReplitHW;

public class D145 {
    String dogName;
    double dogWeight;
    static String dogBreed= "Mutt";

    public D145(String dogName, String dogBreed,double dogWeight) {
        this.dogName = dogName;
        this.dogWeight = dogWeight;

    }




    public static void main(String[] args) {
        D145 dog1=new D145("Tarzan",dogBreed,50.0);
        System.out.println(dog1.dogName+" "+dogBreed+" "+dog1.dogWeight);
        D145 dog2=new D145("Lucy",dogBreed,10.0);
        System.out.println(dog2.dogName+" "+dogBreed+" "+dog2.dogWeight);
        }

    }


