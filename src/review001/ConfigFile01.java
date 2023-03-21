package review001;
import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class ConfigFile01 {
    public static void main(String[] args) {

        // location of the file
        String path="Files/config.properties";
        // navigating to the file

        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            Properties properties=new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            System.out.println("Something went wrong");
        }catch (NullPointerException e){
            System.out.println("You are trying to call a method on Null object");
        }catch (IIOException e){
            System.out.println("IO Exception Occurred");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

