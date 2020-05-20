package automationselenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageactions.ExerciseOne;
import pageactions.ExerciseTwo;

public class AutomationSelenium {

    public static WebDriver driverInitialize() {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
    
    
    public static void main(String[] args) {
      
        //I use chrome 81, so I attached that chromedriver
        System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
        WebDriver driver = driverInitialize();
        
                
        try{
            ExerciseOne eOne = new ExerciseOne(driver);
            eOne.exerciseOne();
            driver.quit();
            
            driver = driverInitialize();
            ExerciseTwo eTwo = new ExerciseTwo(driver);
            eTwo.exerciseTwo();
        } catch (Exception e){
            System.out.println("Something went wrong!\n"  + e);
        } finally {
            driver.quit();
        }
    }
}
    
