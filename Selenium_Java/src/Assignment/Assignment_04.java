package Assignment;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

//Print all suggestions results for Testng on Google

public class Assignment_04 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://google.com");
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("testng");
		
		Thread.sleep(5000);
		
//		driver.findElement(By.xpath("(//li[@class='sbct PZPZlf'])[1]")).click();
		
		List<WebElement> values = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		
		System.out.println("Total search results are: "+values.size());
		
		for(WebElement i : values)
		{
			System.out.println(i.getText());
		}

	}

}
