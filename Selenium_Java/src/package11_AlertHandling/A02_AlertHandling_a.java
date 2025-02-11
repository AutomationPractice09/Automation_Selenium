package package11_AlertHandling;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import generic_Package.Utility_04;

public class A02_AlertHandling_a 
{
	
	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement restext = driver.findElement(By.id("result"));
		
		List<WebElement> alerts = driver.findElements(By.xpath("//ul//li//button"));
		
		System.out.println("Total number of Alerts: "+alerts.size());
		
		for(WebElement i : alerts)
		{
			if(i.getText().contains("Alert"))
			{
				i.click();
				Utility_04.alertOK(restext, driver);
			}
			else if (i.getText().contains("Confirm"))
			{
				i.click();
				Utility_04.cancelAlert(restext, driver);
			}
			else if (i.getText().contains("Prompt"))
			{
				i.click();
				Utility_04.alertPrompt(restext, driver, "This is Passed...!!!");
			}
		}

	}

}
