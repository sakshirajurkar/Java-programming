package Locators_demo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Locators_Script3 {

	public void locators3() {
		//invoke the browser
		WebDriver driver = new ChromeDriver();
		
		//open url
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		WebElement ele = driver.findElement(By.id("username"));
		ele.sendKeys("student");
		
		WebElement ele2 = driver.findElement(By.name("password"));
		ele2.sendKeys("Password123");
		
		WebElement ele3 = driver.findElement(By.id("submit"));
		ele3.click();
		
	}

}
