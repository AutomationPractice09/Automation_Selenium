package Package02_Locators;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class A04_Locators_d 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));       //add 10 seconds of implicit wait as site is taking time to load
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//locate using tagname
/*		List<WebElement> all = driver.findElements(By.tagName("input"));
		
		System.out.println("Total Input boxes webpage are: "+all.size());
*/		
		
		
		//find total links on web page, print href and text for all element
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of links on webpage is: "+linklist.size());
		
		for(WebElement i:linklist)
		{
			System.out.println(i.getAttribute("href"));
			System.out.println(i.getText());
			
		}
		
		
		
		
	}

}
