package ReplitHW;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class D198 {
    public static void main(String[] args) {
        Set<String>countries=new TreeSet<>();
        countries.add("India");
        countries.add("Australia");
        countries.add("South Africa");
        countries.add("India");
        countries.add("America");
        countries.add("America");
        System.out.println(countries);
    }
}
