package package10_Capabilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A02_DisableNotification {

	public static void main(String[] args) 
	{
		 
		ChromeOptions options = new ChromeOptions();          
		options.addArguments("--disable-notifications");      //we have disabled the notifications using chrome disabilities
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.hdfcbank.com/");
		

	}

}
