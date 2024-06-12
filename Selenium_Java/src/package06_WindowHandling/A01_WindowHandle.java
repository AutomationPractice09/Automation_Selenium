package package06_WindowHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01_WindowHandle {

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentID = driver.getWindowHandle();
		System.out.println(parentID);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> allWindows = driver.getWindowHandles();            //here we get all opened window handles 
		System.out.println(allWindows);
		
		for(String childID : allWindows)
		{
			if(!parentID.equals(childID))
			{
				driver.switchTo().window(childID);
				driver.findElement(By.id("Form_submitForm_EmailHomePage")).sendKeys("abc@gmail.com");
			}
		}
		
		driver.switchTo().window(parentID);
		driver.findElement(By.name("username")).sendKeys("Admin");
	}

}
