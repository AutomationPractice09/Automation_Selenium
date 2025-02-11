package Assignment;

import java.time.Duration;
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
		Utility_02.select(from, driver, "pu", "Nigdi");
		
		//To
		WebElement to = driver.findElement(By.id("dest"));
		Utility_02.select(to, driver, "kolh", "Kolhapura Bypass");
		
	}

}
