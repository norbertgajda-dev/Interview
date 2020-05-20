package pageobjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pageobjects {
    public static WebElement getAnimalNameInputField (WebDriver driver) {
        return driver.findElement(By.xpath("//input[@name='commonName']"));
    }
    public static WebElement getSlider (WebDriver driver) {
        return driver.findElement(By.id("isc_2E"));
    }
    public static WebElement getAscendingCheckbox (WebDriver driver) {
        return driver.findElement(By.xpath("//span[contains(@class,'checkbox')]"));
    }
    public static WebElement getSortByDropDown (WebDriver driver) {
        return driver.findElement(By.id("isc_3G"));
    }
    public static WebElement getLifeSpan (WebDriver driver) {
        return driver.findElement(By.id("isc_PickListMenu_0_row_1"));
    }
    public static List<WebElement> getFilteredAnimals (WebDriver driver) {
        return driver.findElements(By.xpath("//div[contains(@eventproxy,'boundList')]//div[not(contains(@aria-hidden,'true'))]//tr[2]//td[@class]"));
    }
    public static WebElement getDropDown (WebDriver driver) {
        return driver.findElement(By.id("isc_2A"));
    }
    public static WebElement getDropDownForSelect (WebDriver driver) {
        return driver.findElement(By.id("isc_3P"));
    }
    public static List<WebElement> getDropDownElements (WebDriver driver) {
        return driver.findElements(By.xpath("(//div[contains(text(),'Exercise')]//..//..//div[contains(text(),'Ea')]//..//..//div[text()>'1.1'])[1]//../parent::tr"));
    }
    public static WebElement getSelectItem (WebDriver driver) {
        return driver.findElement(By.xpath("(//div[contains(text(),'Exercise')]//..//..//div[contains(text(),'Ea')]//..//..//div[text()>'1.1'])[1]//../parent::tr"));
    }
        
}
