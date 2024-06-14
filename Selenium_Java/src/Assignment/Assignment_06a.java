package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import generic_Package.Utility_02;

public class Assignment_06a {

	public static void main(String[] args)
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("----disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.redbus.in/");
		
		//From
		WebElement from = driver.findElement(By.id("src"));
		List<WebElement> values = driver.findElements(By.xpath("//ul[contains(@class,'sc-dnqmqq')]//div/text[@class='placeHolderMainText']"));
		
		Utility_02.from(from, values, "pu", "Nigdi");
	}

}
