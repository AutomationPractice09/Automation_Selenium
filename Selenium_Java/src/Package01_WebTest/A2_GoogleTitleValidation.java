package Package01_WebTest;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2_GoogleTitleValidation {

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		String title = driver.getTitle();
		
		if(title.equalsIgnoreCase("google"))
		{
			System.out.println("Page title is correct");
		}
		else
		{
			System.out.println("Page title is wrong");
		}
		
		driver.close();
		
	}

}
