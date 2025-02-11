package package04_Dropdowns;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A03_BootStrap 
{

	public static void main(String[] args) 
	{
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.redbus.in/");
		
		WebElement from = driver.findElement(By.id("src"));
		
		from.click();
		from.sendKeys("pu");
		
		List<WebElement> values = driver.findElements(By.xpath("//ul[contains(@class,'sc-dnqmqq')]//div/text[@class='placeHolderMainText']"));
		
		System.out.println("Total items in list: "+values.size());
		
		for(WebElement i : values)
		{
			System.out.println(i.getText());
			
			if(i.getText().contains("Nashik Phata"))
			{
				i.click();
				break;
			}
		}
	
	}

}
