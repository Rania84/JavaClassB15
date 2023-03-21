package class29;

import ReplitHW.D;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class iteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<Double>numbers= new ArrayList<>();
        numbers.add(10.0);
        numbers.add(15.20);
        numbers.add(20.0);
        numbers.add(30.0);
        numbers.add(40.5);
        numbers.add(10.3);

       // numbers.removeIf(number -> number > 11); // number like odj can be any work // Lambada
        Iterator<Double> iterator=numbers.iterator();
        /*System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(numbers);*/
        while(iterator.hasNext()){
            double number= iterator.next();
            if(number>11){
                iterator.remove();
            }
        }

        System.out.println(numbers);
    }

}