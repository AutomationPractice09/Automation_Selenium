package package13_MouseOperations;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A02_DoubleClick 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		
		Actions ac = new Actions(driver);
		
		ac.doubleClick(ele).perform();
		
		Alert alt = driver.switchTo().alert();
		System.out.println("Text of alert is: "+alt.getText());
		alt.accept();
	}

}
