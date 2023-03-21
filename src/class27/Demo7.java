package class27;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Nam");
        names.add("Mam");
        names.add("Sam");
        names.add("Man");
        names.add("Ran");
        System.out.println(names.contains("Rania"));
        System.out.println(names);
        names.remove("Sam");
        System.out.println(names);
        names.set(3,"james");
        System.out.println(names);
        System.out.println(names.indexOf("Mam"));
    }
}
