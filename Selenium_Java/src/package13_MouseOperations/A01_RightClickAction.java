package package13_MouseOperations;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A01_RightClickAction {

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions ac = new Actions(driver);
		ac.contextClick(ele).perform();
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,'context-menu-list context-menu-root')]//li"));
		
		for(WebElement i : list)
		{
			System.out.println(i.getText());
			
			if(i.getText().contains("Quit"))
			{
				i.click();
				break;
			}
		}
		
		Alert al = driver.switchTo().alert();
		al.accept();
		
		
	}

}
