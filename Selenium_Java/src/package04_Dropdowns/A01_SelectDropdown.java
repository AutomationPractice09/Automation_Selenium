package package04_Dropdowns;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A01_SelectDropdown {

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		WebElement dd = driver.findElement(By.xpath("//select[contains(@class,'nav-search-dropdown searchSelect')]"));
		
		Select drop = new Select(dd);
		drop.selectByIndex(3);
		drop.selectByValue("search-alias=alexa-skills");
		drop.selectByVisibleText("Appliances");
		
		System.out.println("Is dropdown support multiple select"+drop.isMultiple());
		
		List<WebElement> values = drop.getOptions();
		
		System.out.println("Total dropdown values are: "+values.size());
		
		for(WebElement i : values)
		{
			if(i.getText().contains("Baby"))
			{
				System.out.println(i.getText());
				i.click();
				System.out.println("Option found.....Test Pass");
				break;
			}
		}
		
		
		
		
	}

}
