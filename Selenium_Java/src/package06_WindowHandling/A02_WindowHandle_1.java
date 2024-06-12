package package06_WindowHandling;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A02_WindowHandle_1 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> ir = allWindows.iterator();
		String parentID = ir.next();
		String childID = ir.next();
		
		System.out.println(parentID);
		System.out.println(childID);
		
		driver.switchTo().window(childID);
		driver.findElement(By.id("Form_submitForm_EmailHomePage")).sendKeys("abc@gmail.com");
		
		driver.switchTo().window(parentID);
		driver.findElement(By.name("username")).sendKeys("Admin");
	}
}
