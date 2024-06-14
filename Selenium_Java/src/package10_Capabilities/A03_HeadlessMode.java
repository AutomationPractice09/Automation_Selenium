package package10_Capabilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A03_HeadlessMode {

	public static void main(String[] args) 
	{
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");                         //to run tests in headless mode
		
		WebDriver driver = new ChromeDriver(options); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://google.com");
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("testng");
		
		List<WebElement> values = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		
		System.out.println("Total search results are: "+values.size());
		
		for(WebElement i : values)
		{
			System.out.println(i.getText());
		}

	}

}
