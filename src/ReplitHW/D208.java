package ReplitHW;

import java.util.HashMap;
import java.util.Map;

public class D208 {
    public static void display(Map<String, Integer> map ){
        if (map.isEmpty()) {
            System.out.println("map is empty");
        }
        for (Map.Entry<String, Integer> entry:map.entrySet()
        ) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }

    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("mango", 10);

        map.put("apple", 30);

        map.put("orange", 20);
        display(map);
        map.clear();
        display(map);
    }
}
