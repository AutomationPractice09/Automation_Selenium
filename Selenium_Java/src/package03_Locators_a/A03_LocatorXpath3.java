package package03_Locators_a;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class A03_LocatorXpath3 {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//a[text()='Best Sellers']")).click();       //xpath with text() method
		
		System.out.println(driver.findElement(By.xpath("//span[@id='zg_banner_text']")).getText());   
		
		driver.findElement(By.xpath("//span[normalize-space()='Cart']")).click();     //xpath with normalize-space() method where text having some white spaces
		
		System.out.println(driver.findElement(By.xpath("//h2[normalize-space()='Your Amazon Cart is empty']")).getText()); 
		
		driver.findElement(By.xpath("//input[contains(@id,'twotab')]")).sendKeys("iphone14",Keys.ENTER);     //xpath with contains(@attribute,'value')
		
		WebElement search = driver.findElement(By.xpath("//input[starts-with(@id,'twota')]"));     //xpath with starts-with(@attribute,'value')
		
		
		search.clear();
		
		search.sendKeys("Air Conditioner", Keys.ENTER);		
			
	}

}
