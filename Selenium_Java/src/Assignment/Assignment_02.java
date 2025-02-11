package Assignment;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

// Automate OrangeHRM Login and Logout application using cssSelector

public class Assignment_02 
{
	
	public static void main(String[] args)
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//login into OrangeHRM
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[class$='login-button']")).click();
		System.out.println("Login Successful");
		
		
		//Logout from OrangeHRM
		driver.findElement(By.cssSelector("span.oxd-userdropdown-tab")).click();
		driver.findElement(By.cssSelector("a[href='/web/index.php/auth/logout']")).click();	
		System.out.println("Logout Successful");
	}

}
