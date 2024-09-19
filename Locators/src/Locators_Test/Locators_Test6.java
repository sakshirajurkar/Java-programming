package Locators_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators_Test6 {

	public void display() {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/GANESH/Downloads/Offline_Website_lyst1725891305722/Offline%20Website/index.html");
		
		WebElement ele = driver.findElement(By.cssSelector("input[id='email']"));
		ele.sendKeys("kiran@gmail.com");
		
		WebElement ele1 = driver.findElement(By.cssSelector("input[placeholder='Password']"));
		ele1.sendKeys("123456");
		
		WebElement ele2 = driver.findElement(By.cssSelector("button[type='submit']"));
		ele2.click();
		
		
	}

}
