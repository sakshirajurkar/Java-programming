package Locators_demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators_Script7 {

	public void display() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		WebElement ele = driver.findElement(By.cssSelector("input[type='text']"));
		ele.sendKeys("student");
		
		WebElement ele1 = driver.findElement(By.cssSelector("input[name='password']"));
		ele1.sendKeys("Password123");
		
		WebElement ele2 = driver.findElement(By.cssSelector("button[id='submit']"));
		ele2.click();
	}

}
