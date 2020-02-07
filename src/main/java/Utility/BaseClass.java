package Utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public WebDriver driver;
    public Properties prop;
    public WebDriver initializer() throws IOException {

         prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Drivers\\data.properties");
        prop.load(fis);

        String browser = prop.getProperty("Browser");


        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Selenium\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        } else if (browser == "ie") {
        } else if (browser == "Firefox") {
        }
        driver.manage().window().maximize();
        return driver;

    }

    public void Snapshot()
    {
            TakesScreenshot takesScreenshot = ((TakesScreenshot)driver);
            File fle = takesScreenshot.getScreenshotAs(OutputType.FILE);
            try{
                FileUtils.copyFile(fle,new File("C:\\Drivers\\Scrennsht.png"));
            }catch (Exception e)
            {
                System.out.println("file is not matched");
            }



    }
}
