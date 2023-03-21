package ReplitHW;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class D199 {
    public static void main(String[] args) {
        Set<String> names=new LinkedHashSet<>();
        names.add("null");
        names.add("Sohil");
        names.add("Diego");
        names.add("Alijon");
        names.add("Asel");
        names.add("Sumair");
        for (String name:names
             ) {
            System.out.println(name);
        }
        Iterator<String> iterator= names.iterator();
        while (iterator.hasNext()){
            String info= iterator.next();
            System.out.println(info);
        }

    }
}
