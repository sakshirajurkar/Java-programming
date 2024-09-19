package Locators_demo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Locators_Script8 {

	public void display() {
		//invoke the browser
		WebDriver driver = new ChromeDriver();
		//open url
		driver.get("file:///C:/Users/GANESH/Downloads/Offline_Website_lyst1725891305722/Offline%20Website/index.html");
		
		//maximize the window
		driver.manage().window().maximize();
		//pass email on
		WebElement ele = driver.findElement(By.className("form-control"));
		ele.sendKeys("kiran@gmail.com");
		
		WebElement ele1 = driver.findElement(By.id("password"));
		ele1.sendKeys("123456");
		
		WebElement ele2 = driver.findElement(By.cssSelector("button[type='submit']"));
		ele2.click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String ExpectedTitle = "JavaByKiran | Dashboard";
		
		
		if(title.equals(ExpectedTitle)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		String ExpectedUrl = "file:///C:/Users/GANESH/Downloads/Offline_Website_lyst1725891305722/Offline%20Website/index.html";
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if(url.equals(ExpectedUrl)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		WebElement ele3 = driver.findElement(By.className("small-box-footer"));
		ele3.click();
		
		//WebElement ele4 = driver.findElement(By.cssSelector("p[style='color:red;text-align:center']"));
		//driver.
		
		WebElement ele4 = driver.findElement(By.cssSelector("body > div > div.login-box-body > p:nth-child(2)"));
		String ActualResult = ele4.getText();
		
		String ExpectedResult = "logout not successfully";
		
		if(ActualResult.equals(ExpectedResult)) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case failed");
		}
		
		
		
		
		
		
	}
}
