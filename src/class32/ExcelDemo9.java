package class32;

import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelDemo9 {
    public static void main(String[] args) throws IOException {
      //  List<Map<String,String>> exelDate=ExcelReader.read();
       // Map<String,String>firstRow=exelDate.get(1);
        //System.out.println(firstRow.get("salary"));
       // System.out.println(firstRow);
     //   var exelData= ExcelReader.read();
       // System.out.println(exelData);
        List<Map<String,String>> excelData= ExcelReader.read();

        for (Map<String,String> row:excelData) {
            for (Map.Entry<String,String> entry:row.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
            System.out.println("**");
        }
    }
}




