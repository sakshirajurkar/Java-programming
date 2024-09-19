package Locators_demo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Locators_Script2 {

	public void locators() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement ele = driver.findElement(By.partialLinkText("forgotten"));
		ele.click();
	}

}
