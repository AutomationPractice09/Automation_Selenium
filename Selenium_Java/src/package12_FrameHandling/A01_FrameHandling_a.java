package package12_FrameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01_FrameHandling_a 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
	
//		driver.switchTo().frame("frame1");                        //this is using id
		
		WebElement fele = driver.findElement(By.id("frame1"));    //this is using WebElement
		driver.switchTo().frame(fele);        
		
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
	}

}
