package class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReadDemo1 {
    public static void main(String[] args) throws IOException {
        // location of file on the computer
        String path="Files/Book1.xlsx";
        // Navigating to the file
        FileInputStream fileInputStream=new FileInputStream(path);
        //  It's a class that know how to read and write data to an Excel file
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        // from the excel file we need to get the sheet first using below method
        Sheet sheet1=xssfWorkbook.getSheet("Sheet1");

        Row row =sheet1.getRow(1);
        Cell cell= row.getCell(1);
        System.out.println(cell);

    }
}
