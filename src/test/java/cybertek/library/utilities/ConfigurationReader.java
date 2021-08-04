package cybertek.library.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    //create properties object
    private static Properties properties= new Properties();

    static {

        try {
            // load the file into FileInputStream
            FileInputStream file= new FileInputStream("configuration.properties");
//load properties object wit the file
            properties.load(file);
            //close the file
            file.close();

        } catch (IOException e) {
            System.out.println("file not found in configuration properties. ");
        }


    }
    //use the abouve created logic to create a re-usable static method
    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }
}
