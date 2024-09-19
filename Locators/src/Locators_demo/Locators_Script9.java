package Locators_demo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Locators_Script9 {
    public void disply() {
    	WebDriver driver= new ChromeDriver();
    	driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
    	
    	WebElement ele = driver.findElement(By.id("first_name"));
    	ele.sendKeys("Sakshi");
    	
    	
    }
	
}
