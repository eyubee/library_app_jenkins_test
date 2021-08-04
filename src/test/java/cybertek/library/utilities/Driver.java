package cybertek.library.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    /** creating a private constructor so this class object isn't accessible from outside
     * */
    private Driver(){

    }
    /** making our driver instance private so that it isn't reachable from outside of the class
     * we make it static becuase we want it to run before everything else and also we will be able to use it in static method */
    private static WebDriver driver;
    /**creating re-usable utility method that will return same 'driver' instance everytime we call it */
    public static WebDriver getDriver(){
        if (driver ==null){
            /** we are reading our browser type from configuratuion.properties file using .getProperty method we created in that class*/
            String browsserType = ConfigurationReader.getProperty("browser");
            /** depending on the type of the browser, the switch statment will determine to open specific type of browser/ driver */
            switch (browsserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver= new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver =new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }
        }
        /** same driver instance will be returned everytime we call driver.getdriver(); method */
        return driver;

    }
    /**this methos makes sure we have some form of driver session or driver id has either null or not null must exist */
    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
