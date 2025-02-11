package Package01_WebTest;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4_NavigationCommands 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		//navigate().to(url)
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		//navigate().back()
		driver.navigate().back();
		
		//navigate().forward();
		driver.navigate().forward();
		System.out.println("Page Title is: "+driver.getTitle());
		
		//navigate().refresh
		driver.navigate().refresh();
	}

}
