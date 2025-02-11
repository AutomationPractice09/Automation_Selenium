package package11_AlertHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01_AlertHandling {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("digvijay");
		driver.findElement(By.className("signinbtn")).click();
		
		Alert alt = driver.switchTo().alert();     //switch control to alert by .switchTo().alert()
		
		System.out.println(alt.getText());
		
		alt.accept();
		
		driver.findElement(By.id("password")).sendKeys("34243");
		

	}

}
