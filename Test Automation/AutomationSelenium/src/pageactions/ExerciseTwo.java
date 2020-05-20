package pageactions;

import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pageobjects.Pageobjects;

public class ExerciseTwo {

    WebDriver driver;
    
    public ExerciseTwo(WebDriver driver) {
        this.driver=driver;
    }
    
    public void delay(int delay){
        try {
            Thread.sleep(delay * 1000);
        } catch (InterruptedException ex) {
            System.out.println("Interrupted Delay" + ex);
        }
    }
    
   
    public void exerciseTwo(){
        driver.get("https://www.smartclient.com/smartgwt/showcase/#featured_dropdown_grid_category");
        delay(10);
        Pageobjects.getDropDown(driver).click();
        delay(1);
        
        while (Pageobjects.getDropDownElements(driver).size() < 1){
            Pageobjects.getDropDownForSelect(driver).sendKeys(Keys.PAGE_DOWN);
        }
        
        Pageobjects.getDropDownForSelect(driver).sendKeys(Keys.PAGE_DOWN);
        delay(1);
        Pageobjects.getSelectItem(driver).click();
        delay(3);
        System.out.println("Test was successfully run!");
    
    }
    
    
}
