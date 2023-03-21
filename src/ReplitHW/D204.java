package ReplitHW;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class D204 {
    public static void main(String[] args) {
        Map<String, String> info = new LinkedHashMap<>();
        info.put("Street", "Patrick ST");
        info.put("Suite", "265");
        info.put("City", "Vienna");
        info.put("Zip", "22180");
        info.put("Country", "United State");
        Iterator<String> data=info.values().iterator();
        while (data.hasNext()) {
            System.out.println(data.next());
        }
    }
}