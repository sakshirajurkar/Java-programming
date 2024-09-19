package Locators_demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators_Script5 {

	void display() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		WebElement ele = driver.findElement(By.linkText("Drag and Drop"));
		ele.click();
	}

}
