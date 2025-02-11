package Package02_Locators;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class A02_Locators_b 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		
		//username
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		
		
	    //password
		WebElement psw = driver.findElement(By.id("password"));
		
		if(psw.isDisplayed() && psw.isEnabled())
		{
			psw.sendKeys("secret_sauce");
		}
		
		//login button
//		driver.findElement(By.className("submit-button btn_action")).click();   //since class values has 2 values seperated by space so it is throwing InvalidSelectorException
	    
		driver.findElement(By.className("submit-button")).click();      //here we selected only 1 values from class attribute
	
	}

}
