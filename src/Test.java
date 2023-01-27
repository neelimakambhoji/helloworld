import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test {
    public static void main(String[]args) throws IOException {
        // Load the properties
        FileInputStream fis = new FileInputStream("abc.properties");
        Properties Properties = new Properties();
        Properties.load(fis);

        // read the data  from Properties file
        System.out.println(Properties.getProperty("manager"));
        System.out.println(Properties.getProperty("password"));
    }
}
