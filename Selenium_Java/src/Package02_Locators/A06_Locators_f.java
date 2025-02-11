package Package02_Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A06_Locators_f {

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.cssSelector("input[placeholder*='rname']")).sendKeys("standard_user");        //here we used placeholder attribute with * means partial value 
		
		driver.findElement(By.cssSelector("input[placeholder^='Pass']")).sendKeys("secret_sauce");          //here we used placeholder attribute value with ^ means prefix value
		
//		driver.findElement(By.cssSelector("input.submit-button.btn_action")).click();
		
		driver.findElement(By.cssSelector("input[data-test$='button']")).click();     //here we used attribute as data-test with $ means suffix valu[e 
		
	}

}
