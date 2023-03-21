package ReplitHW;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class D207 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("ONE", "AAA");

        map.put("TWO", "BBB");

        map.put("THREE", "CCC");

        map.put("FOUR", "DDD");

        map.put("FIVE", "EEE");
        System.out.println("HashMap Before Replace : ");
        Iterator<Map.Entry<String, String>> info = map.entrySet().iterator();
        while (info.hasNext()) {
            Map.Entry<String, String> x=info.next();
            System.out.println(x.getKey()+" : "+x.getValue());
        }
        System.out.println("------------------");
        map.replace("THREE", "ASEL");
        map.replace("FIVE", "SUMAIR");
        System.out.println("HashMap After Replace :");
        Iterator<Map.Entry<String, String>> info2 = map.entrySet().iterator();
        while (info2.hasNext()) {
            Map.Entry<String, String> x=info2.next();
            System.out.println(x.getKey()+" : "+x.getValue());
        }

        }
    }

