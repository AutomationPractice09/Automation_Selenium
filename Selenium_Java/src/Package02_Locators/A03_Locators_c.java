package Package02_Locators;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class A03_Locators_c 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
		//locator using linkText
//		driver.findElement(By.linkText("Sign In")).click();        //this is linkText where all text is mandatory
		
		//locator using partialLinkText
		driver.findElement(By.partialLinkText("In")).click();      //this is partialLinkText where partial text is sufficient
		
		
	}

}
