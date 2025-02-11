package generic_Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility_03 
{
	
	public static WebElement waitForElementToClick(WebDriver driver, By loc)
	{
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait1.until(ExpectedConditions.elementToBeClickable(loc));
	}
	
	
	public static WebElement waitForElementToPresentToClick(WebDriver driver, By loc)
	{
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait2.until(ExpectedConditions.presenceOfElementLocated(loc));
	}
	
	
	public static WebElement waitForElementToVisible(WebDriver driver, By loc)
	{
		WebDriverWait wait3 = new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait3.until(ExpectedConditions.visibilityOfElementLocated(loc));
	}
	
	
	public static boolean waitForUrl(WebDriver driver, String url)
	{
		WebDriverWait wait4 = new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait4.until(ExpectedConditions.urlContains(url));
	}
	
	
	public static boolean waitForTitle(WebDriver driver, String title)
	{
		WebDriverWait wait5 = new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait5.until(ExpectedConditions.titleContains(title));
	}
}
