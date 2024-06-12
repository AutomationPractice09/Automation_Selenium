package Assignment;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

//Automate Go-ibibo dropdown

public class Assignment_07 {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		
		WebElement close = driver.findElement(By.xpath("//span[contains(@class,'logSprite')]"));
		
		if (close.isDisplayed())
		{
			close.click();
		}
		
		WebElement close1 = driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']"));
		if (close1.isDisplayed())
		{
			close1.click();
		}
		
		
		WebElement from = driver.findElement(By.xpath("//p[@class='sc-12foipm-6 erPfRs']"));
		from.click();
		from.sendKeys("pu");
		
		List<WebElement> values = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//li//span[@class='autoCompleteTitle ']"));
		
		System.out.println("Total number of dropdown values: "+values.size());
		
		for(WebElement i : values)
		{
			System.out.println(i.getText());
			
			if(i.getText().contains("Pullman, United States"))
			{
				i.click();
			}
		}
	}

}
