package Assignment;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

//Automate crm application login and logout using cssSelectors

public class Assignment_03 {

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://automationplayground.com/crm/");
		
		//CRM Login
		driver.findElement(By.cssSelector("a#SignIn")).click();
		driver.findElement(By.cssSelector("input#email-id")).sendKeys("test2024@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("test@123");
		driver.findElement(By.cssSelector("button.btn-primary")).click();
		System.out.println("Login Successful");
		
		//CRM Logout
		driver.findElement(By.cssSelector("a.nav-link")).click();
		System.out.println("Logout Successful");
	}

}