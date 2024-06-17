package package15_FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01_FileUpload 
{

	public static void main(String[] args) 
	{	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		
		WebElement ele = driver.findElement(By.id("file-upload"));     //this will work if type of that webElement is file
		
		ele.sendKeys("C:\\Users\\hp\\Desktop\\Digvijay_QA_4+yrs_ExpNP.pdf");
		
		driver.findElement(By.id("file-submit")).click();
	}

}
