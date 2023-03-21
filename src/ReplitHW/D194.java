package ReplitHW;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class D194 {
    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

       // countries.removeIf(country->country.startsWith("A"));
        Iterator<String> iterator=countries.iterator();
        while(iterator.hasNext()){
            String s=iterator.next();
            if(s.startsWith("A")){
                iterator.remove();
            }
        }
        System.out.println(countries);
    }

    }

