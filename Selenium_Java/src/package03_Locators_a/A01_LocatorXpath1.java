package package03_Locators_a;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


//Xpath with synatx: //tagname[@attribute='{values}']


public class A01_LocatorXpath1 {

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("apache@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("apache@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		if(driver.getCurrentUrl().contains("account"))
		{
			System.out.println("Test is Passed");
		}
		else
		{
			System.out.println("Test is failed");
		}
		
		
		
		
		
		
		//input[@name='email']
		
		
	}

}
