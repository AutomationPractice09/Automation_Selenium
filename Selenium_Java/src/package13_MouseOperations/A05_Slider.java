package package13_MouseOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A05_Slider {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/slider/");
		
		driver.switchTo().frame(0);
		
		WebElement ele = driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));
		
		Actions ac = new Actions(driver);
		ac.clickAndHold(ele).dragAndDropBy(ele, 200, 0).build().perform();
		
		
	}

}
