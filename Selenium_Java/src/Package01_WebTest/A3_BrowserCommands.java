package Package01_WebTest;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3_BrowserCommands 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		
		//get(URL)
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//getTitle()
		String PageTitle = driver.getTitle();
		System.out.println("Page Title is: "+PageTitle);
		
		//getCurrentUrl()
		String URL = driver.getCurrentUrl();
		System.out.println("Url of Application is: "+URL);
		
		//getPageSource()
		System.out.println(driver.getPageSource());
		
		//close()
//		driver.close();
		
		//quit()
		driver.quit();
	}

}
