package package12_FrameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A02_NestedFrame 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");
		String parent = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		System.out.println(parent);
				
		WebElement cframe = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(cframe);
		String child = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		System.out.println(child);
		
//		driver.switchTo().defaultContent();     //this is to switch to parent frame
		driver.switchTo().parentFrame();
		System.out.println(parent);
		
		
	}

}
