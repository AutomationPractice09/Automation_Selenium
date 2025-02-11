package package14_jsScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01_JSExecutor 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Scroll to specific position
//		js.executeScript("window.scrollTo(0,3000)");
		
		
		//Scroll to botton end of page
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		//Scroll to top of page from end
//		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		
		
		//Scroll to specific Element
		WebElement ele = driver.findElement(By.xpath("//span[text()='Best Sellers in Sports, Fitness & Outdoors']"));
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
		
		
		//refresh the page
		js.executeAsyncScript("history.go(0)");
		
		
		//generate alert
		js.executeScript("alert('This is custom Alert')");
		
		
		//Handle alert
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
		
		//get page title
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);
	}

}
