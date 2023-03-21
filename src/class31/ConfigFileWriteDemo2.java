package class31;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteDemo2 {
    public static void main(String[] args) throws IOException {
        /* Path where want to creat the new file and the name of the file
        */
        String path ="Files/data.properties";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        // we use setPropety method to store data inside aproperties files
        Properties properties=new Properties();

        properties.setProperty("SchoolName","Syntax");
        properties.setProperty("SchoolLocation","Chantilly");

        //method to write the data to the disk
        properties.store(fileOutputStream,"A new name had been added");
    }
}
