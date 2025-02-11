package package16_FileDownload;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A01_FileDownload {

	public static void main(String[] args) 
	{
	
		ChromeOptions options = new ChromeOptions();
		HashMap<String,Object> cpref = new HashMap<String,Object>();
		String filepath = System.getProperty("user.dir")+"\\Files";
		cpref.put("download.default_directory", filepath);
		options.setExperimentalOption("prefs", cpref);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/download");
		
		driver.findElement(By.xpath("//a[text()='dummy.pdf']")).click();

	}

}
