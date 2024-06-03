package Assignment;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment_01 {

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.naukri.com/");
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of links available are: "+list.size());
		
		String exp = "https://www.naukri.com/hr-jobs?src=gnbjobs_homepage_srch";
		
		for(WebElement i:list)
		{
			System.out.println(i.getAttribute("href"));
			System.out.println(i.getText());
			try
			{
			if(i.getAttribute("href").contains(exp))
			{
				System.out.println("Link found and Test is Passed!!!");
				break;
			}
			}catch(NullPointerException e)
			{
				System.out.println("The href doesnt consist any values");
			}
		}
		
	}

}
