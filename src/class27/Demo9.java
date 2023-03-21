package class27;

import java.util.ArrayList;

public class Demo9 {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>();
        names.add("sam");
        names.add("rony");
        names.add("Mia");
        names.add("saba");
        names.add("Dodo");
        names.add("nana");
        System.out.println(names);
        names.clear();
        System.out.println(names);
    }
}
