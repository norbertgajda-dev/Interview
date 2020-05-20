package pageactions;

import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageobjects.Pageobjects;

public class ExerciseOne {

    WebDriver driver;
    
    public ExerciseOne(WebDriver driver) {
        this.driver=driver;
    }
    
    public void delay(int delay){
        try {
            Thread.sleep(delay * 1000);
        } catch (InterruptedException ex) {
            System.out.println("Interrupted Delay" + ex);
        }
    }
    
    public void slider(WebElement slider){
        Actions move = new Actions(driver);
        move.dragAndDropBy(slider, -70, 0).build().perform();
    }
    
          
        
    public void exerciseOne(){
        driver.get("http://www.smartclient.com/smartgwt/showcase/#featured_tile_filtering");
        delay(5);
        Pageobjects.getAnimalNameInputField(driver).sendKeys("a");
        delay(1);
        slider(Pageobjects.getSlider(driver));
        delay(1);
        Pageobjects.getAscendingCheckbox(driver).click();
        delay(1);
        Pageobjects.getSortByDropDown(driver).click();
        delay(2);
        Pageobjects.getLifeSpan(driver).click();
        delay(2);
        
        List <WebElement> animals = Pageobjects.getFilteredAnimals(driver);
        for (WebElement animal : animals) {
            System.out.println(animal.getAttribute("innerText"));
        }
        delay(3);
        System.out.println("Test was successfully run!");
    }

}
