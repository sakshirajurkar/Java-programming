package Webdriver;

interface serach_context{
	abstract void findElement();
}
interface WebDriver extends serach_context{
	abstract void  get();
	abstract void quit();
	abstract void getWindowHandle();
	abstract void getWindowHandles();
	abstract void getTitle();
}
interface WebElement extends serach_context{
	abstract void getText();
	abstract void selected();
}
interface javascriptExecuter {
	abstract void pin();
	abstract void executeScript();
}
interface TakesScreenshot {
	abstract void getScreenShotAs();
}
public class RemoteWebdriver implements WebDriver,WebElement,javascriptExecuter {

	@Override
	public void findElement() {
		System.out.println("methond of find element");
		
	}

	@Override
	public void pin() {
		System.out.println("methond of pin");
		
	}

	@Override
	public void executeScript() {
		System.out.println("methond of executeScript");
		
	}

	@Override
	public void getText() {
		System.out.println("methond of getText");
		
	}

	@Override
	public void selected() {
		System.out.println("methond of find selected");
		
	}

	@Override
	public void get() {
		System.out.println("methond of get");
		
	}

	@Override
	public void quit() {
		System.out.println("methond of quit");
		
	}

	@Override
	public void getWindowHandle() {
		System.out.println("methond of getWindowHandle");
		
	}

	@Override
	public void getWindowHandles() {
		System.out.println("methond of getWindowHandles");
		
	}

	@Override
	public void getTitle() {
		System.out.println("methond of getTitle");
		
	}
  
 
}
