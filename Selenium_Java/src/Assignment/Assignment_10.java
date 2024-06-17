package Assignment;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment_10 
{

	public static void main(String[] args) 
	{
	
		ChromeOptions options = new ChromeOptions();
		HashMap<String,Object> cpre = new HashMap<String,Object>();
		String filepath = System.getProperty("user.dir")+"\\Files";
		cpre.put("download.default_directory", filepath);
		options.setExperimentalOption("prefs", cpre);
		
	
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("pdfbox")).sendKeys("This is Dummy File");
		
		WebElement button = driver.findElement(By.id("createPdf"));
		if(button.isEnabled())
		{
			button.click();
		}
		
		WebElement link = driver.findElement(By.id("pdf-link-to-download"));
		if(link.isEnabled())
		{
			link.click();
		}
		
	}

}
