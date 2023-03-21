package ReplitHW;

import java.util.LinkedHashMap;
import java.util.Map;

public class D200 {
    public static void main(String[] args) {
        Map<String, String> info = new LinkedHashMap<>();
        info.put("Street", "Patrick ST");
        info.put("Suite", "265");
        info.put("City", "Vienna");
        info.put("Zip", "22180");
        info.put("Country", "United State");
        for (String data : info.values()
        ){
            System.out.println(data);
    }
}}