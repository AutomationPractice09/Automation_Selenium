package Package02_Locators;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class A05_Locators_e 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");     //used cssSelector with id (tagname#id_values)
        
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_sauce");
		
//		driver.findElement(By.cssSelector("input.submit-button.btn_action")).click();
		
		driver.findElement(By.cssSelector("input.submit-button.btn_action[value='Login']")).click();  //cssSelector with multiple attribute 
		
		if(driver.getCurrentUrl().contains("inventory"))
		{
			System.out.println("Login is Passed");
		}
		else
		{
			System.out.println("Login is Failed");
		}
		
	}

}
