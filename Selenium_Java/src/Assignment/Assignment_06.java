package Assignment;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//Automate RedBus dropdown and get all options, Select location

public class Assignment_06 {

	public static void main(String[] args) 
	{
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("----disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.redbus.in/");
		
		//From
		WebElement from = driver.findElement(By.id("src"));
		from.click();
		from.sendKeys("pu");
		List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,'sc-dnqmqq')]//div/text[@class='placeHolderMainText']"));
		System.out.println("Total values in list are: "+list.size());
		for(WebElement i : list)
		{
			System.out.println(i.getText());
			
			if(i.getText().contains("Nigdi"))
			{
				i.click();
				break;
			}
		}
		
//--------------------------------------------------------------------------------------------------------------------------------
		
        //To
		WebElement to = driver.findElement(By.id("dest"));
		to.click();
		to.sendKeys("kolh");
		List<WebElement> list1 = driver.findElements(By.xpath("//ul[contains(@class,'sc-dnqmqq')]//div/text[@class='placeHolderMainText']"));
		System.out.println("Total values in list are: "+list1.size());
		
		for(WebElement i : list1)
		{
			System.out.println(i.getText());
			
			if(i.getText().contains("Shiroli Phata"))
			{
				i.click();
				break;
			}
		}		
	}
}

