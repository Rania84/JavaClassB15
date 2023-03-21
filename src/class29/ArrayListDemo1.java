package class29;

import  java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        //Dog d1 = new Dog ("Mango", "Dachund", 2);

        ArrayList <Dog> newDog = new ArrayList<>();
        newDog.add(new Dog ("Mango", "Dachund", 2));
        newDog.add(new Dog ("Kiwi", "Dachund", 1));
        newDog.add(new Dog ("Lime", "Dachund", 1));

        for (Dog dogZ : newDog) {
            dogZ.printDogName();
        }
    }
}