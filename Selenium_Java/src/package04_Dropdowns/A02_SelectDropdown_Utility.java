package package04_Dropdowns;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import generic_Package.Utility_01;

public class A02_SelectDropdown_Utility {
	
	
	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement ele1 = driver.findElement(By.id("day"));
		Utility_01.selectOptions(ele1, "23");                                    //this is called as code utility as we write code once for select dropdown in another package with utility class (static methods)
		
		WebElement ele2 = driver.findElement(By.id("month"));
		Utility_01.selectOptions(ele2,"Oct");
		
		WebElement ele3 = driver.findElement(By.id("year"));
		Utility_01.selectOptions(ele3,"2001");
	
	}

}
