package Locators_demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators_Script4 {

	public void display() {
		//invoke the browser
		WebDriver driver = new ChromeDriver();
		//open url
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=11711873962590681361&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302820&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("watch");
		
		WebElement ele1 = driver.findElement(By.className("nav-line-1 nav-progressive-content"));
		ele1.click();
		
	}

}
