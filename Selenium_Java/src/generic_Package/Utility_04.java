package generic_Package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility_04 
{
	
	public static void alertOK(WebElement restext, WebDriver driver)              //this is utility to accept the alert
	{
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		
		alt.accept();
		
		System.out.println(restext.getText());
	}
	
	public static void cancelAlert(WebElement restext, WebDriver driver)          //this is utility to cancel the alert
	{
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		
		alt.dismiss();
		
		System.out.println(restext.getText());
	}
	
	public static void alertPrompt(WebElement restext, WebDriver driver, String msg)          //this is utility to cancel the alert
	{
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		
		alt.sendKeys(msg);
		alt.accept();
		
		System.out.println(restext.getText());
	}

}
