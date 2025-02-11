package package13_MouseOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A06_Resizing 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement ele = driver.findElement(By.xpath("(//div[contains(@class,'ui-resizable-handle ui-resizable')])[3]"));
		
		Actions ac = new Actions(driver);
		ac.clickAndHold(ele).dragAndDropBy(ele, 100, 100).build().perform();
		

	}

}
