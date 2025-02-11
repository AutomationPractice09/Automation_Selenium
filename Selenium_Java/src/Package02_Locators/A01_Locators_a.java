package Package02_Locators;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01_Locators_a {

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		
/*		//way-1: locate using By class + identify Webelement + perform action
		By searchBox = By.id("APjFqb");
		
		driver.findElement(searchBox).sendKeys("testing");
*/		
		
		//way-2: Identify + validate WebElement + action
		WebElement ele1 = driver.findElement(By.id("APjFqb"));
		
		System.out.println("is this element is displayed: "+ele1.isDisplayed());
		System.out.println("is this element is enabled: "+ele1.isEnabled());
		
		ele1.sendKeys("Selenium");
	}

}
