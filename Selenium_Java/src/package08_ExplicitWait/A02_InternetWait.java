package package08_ExplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic_Package.Utility_03;

public class A02_InternetWait 
{

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		By start = By.xpath("//button[text()='Start']");
		By text = By.xpath("(//h4)[2]");
		
		driver.findElement(start).click();
		
		String te = Utility_03.waitForElementToVisible(driver, text).getText();
		System.out.println(te);
	}

}
