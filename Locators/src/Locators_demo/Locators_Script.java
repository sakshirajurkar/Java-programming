package Locators_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators_Script {

	 public void display() {
		//invoke the browser
		ChromeDriver driver = new ChromeDriver();
		
		//open url
		driver.get("https://www.flipkart.com/");
		
		//WebElement ele = driver.findElement (By.name("q"));
		//ele.sendKeys("mobile");
		
		WebElement ele2 = driver.findElement(By.className("Pke_EE"));
		ele2.sendKeys("laptop");
		
		WebElement ele3= driver.findElement(By.linkText("Login"));
		ele3.click();
		
	}
}
