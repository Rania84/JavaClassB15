package ReplitHW;

import java.util.ArrayList;
import java.util.Iterator;

public class D191 {
    public static void main(String[] args) {


        ArrayList<Boolean> listA = new ArrayList<>();
        listA.add(true);
        listA.add(false);
        listA.add(false);

        ArrayList<Boolean> listB = new ArrayList<>();
        for (Boolean aBoolean : listA) {
            System.out.println(aBoolean.booleanValue());
        }

    }
}