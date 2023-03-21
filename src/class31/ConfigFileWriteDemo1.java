package class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteDemo1 {
    public static void main(String[] args) throws IOException {
        /* Path where want to creat the new file and the name of the file
        */
        String path ="Files/test.properties";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        // we use setPropety method to store data inside aproperties files
        Properties properties=new Properties();

        properties.setProperty("Name","Rania");
        //method to write the data to the disk
        properties.store(fileOutputStream,"A new name had been added");
    }
}
