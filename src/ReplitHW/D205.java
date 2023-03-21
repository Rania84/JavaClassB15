package ReplitHW;

import java.util.HashMap;

import java.util.Map;

public class D205 {
    public static void main(String[] args) {
        Map<String, String> info = new HashMap<>();
        info.put("Street", "Patrick ST");
        info.put("Suite", "265");
        info.put("City", "Vienna");
        info.put("Zip", "22180");
        info.put("Country", "United State");
        for (Map.Entry<String, String> entry : info.entrySet()) {
            String value = entry.getValue().toUpperCase();
            System.out.println(value);

        }
    }
}
