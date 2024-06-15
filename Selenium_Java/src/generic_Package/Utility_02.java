package generic_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility_02 {
	

	public static void select(WebElement from, WebDriver driver, String search, String dest)
	{
	
		from.click();
		from.sendKeys(search);
		List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,'sc-dnqmqq')]//div/text[@class='placeHolderMainText']"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Total values in list are: "+list.size());
		for(WebElement i : list)
		{
			System.out.println(i.getText());
			
			if(i.getText().contains(dest))
			{
				i.click();
				break;
			}
		}
		
		
	}

}
