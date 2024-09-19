package WebDriverMethods1;
import org.openqa.selenium.chrome.ChromeDriver;
public class FindElementMethod {

	void FindElement() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/email-subscription-form-mailchimp/");
		driver.findElement(null);
	}

}
