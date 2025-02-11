package package08_ExplicitWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A01_ExplicitWait 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//locators
		By username =By.id("input-emailwe");
		By password = By.name("password");
		By button = By.xpath("//input[@value='Login']");
		
//		driver.findElement(username).sendKeys("abc@gmail.com");
		
		WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(5));      					//to wait for specific element to visible
		waits.until(ExpectedConditions.visibilityOfElementLocated(username)).sendKeys("abc@gmail.com"); //it wait until the specific element is visible  
		
		waits.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys("Password");
	}

}
