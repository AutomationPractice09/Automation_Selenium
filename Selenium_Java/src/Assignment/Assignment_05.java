package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Print all footer links from Amazon Home page

public class Assignment_05 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='navFooterColHead']//following::li"));
		
		for(WebElement i : links)
		{
			System.out.println(i.getText());
			
			if (i.getText().contains("Help"))
			{
				break;
			}
		}	
	}

}
