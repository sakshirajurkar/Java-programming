package Webdriver;

public class TestIntt {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.findElement();
		
		FirefoxDriver driver2 = new FirefoxDriver();
		driver2.get();
		
		SafariDriver driver3 = new SafariDriver();
		driver3.getTitle();
		
		IEDriver driver4 = new IEDriver();
		driver4.getWindowHandle();
		
		EdgeDriver driver5 = new EdgeDriver();
        driver5.pin();
	}

}
