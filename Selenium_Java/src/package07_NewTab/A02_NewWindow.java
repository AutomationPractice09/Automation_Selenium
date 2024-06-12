package package07_NewTab;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class A02_NewWindow {


			public static void main(String[] args) 
			{
			
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				WebDriver newwindow = driver.switchTo().newWindow(WindowType.WINDOW);
				newwindow.get("https://facebook.com");
			}

		}

