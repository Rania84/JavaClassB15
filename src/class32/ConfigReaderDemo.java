package class32;

import utils.Configreader;

import java.io.IOException;
import java.util.Properties;

public class ConfigReaderDemo {
    public static void main(String[] args) throws IOException {
        Properties properties= Configreader.read();
        System.out.println(properties.getProperty("user"));
    }
}
