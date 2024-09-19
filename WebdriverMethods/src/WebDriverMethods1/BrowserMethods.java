package WebDriverMethods1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserMethods {

	public void BrowserMethodTestScript() {
		//select the browser
		EdgeDriver driver = new EdgeDriver();
		
		//open url on browser
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		String Title = driver.getTitle ();
		System.out.println(Title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String PageSource = driver.getPageSource();
		System.out.println(PageSource);
	}

}
