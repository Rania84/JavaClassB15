package review001;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.Key;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelD {
    public static void main(String[] args) throws IOException {
        String path="Files/Book2.xlsx";
        try{
            FileInputStream fis=new FileInputStream(path);
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fis);
            Sheet sheet1= xssfWorkbook.getSheet("Sheet1");
            //Row row=sheet1.getRow(3);
         //   System.out.println(row.getCell(2));
            int noOFRows=sheet1.getPhysicalNumberOfRows();
          //  var excelData=new ArrayList<Map<String,String>>();
             List<Map<String,String>> excelData=new ArrayList();
             Row row0=sheet1.getRow(0);
            for (int i = 1; i <noOFRows ; i++) {
                LinkedHashMap<String,String > rowMap=new LinkedHashMap<>();
                Row row=sheet1.getRow(i);
                int noOfCells=row.getPhysicalNumberOfCells();
                for (int j = 0; j <noOfCells ; j++) {
                    String key=row0.getCell(j).toString();
                    String values=row.getCell(j).toString();
                    rowMap.put(key,values);

                }
                excelData.add(rowMap);


            }

            System.out.println(excelData);

        } catch (FileNotFoundException e) {
            System.out.println("please check the path of the file");
        }
    }
}
