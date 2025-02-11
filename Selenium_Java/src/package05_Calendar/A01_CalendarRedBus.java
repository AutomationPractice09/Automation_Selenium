package package05_Calendar;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A01_CalendarRedBus {

	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("onwardCal")).click();
		
		String year = "2024";
		String month = "Sep";
		String date = "12";
		
		
		while(true)
		{
		String adate = driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator')])[3]")).getText();
		System.out.println(adate);
		
		String amonth = adate.split(" ")[0];
		String ayear = adate.split(" ")[1];
		
		if(amonth.contains(month) && ayear.contains(year))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator')])[4]")).click();
		}
		}
		
		
		List<WebElement> dlist = driver.findElements(By.xpath("(//div[contains(@class,'DayTilesWrapper')])//div"));	
		
		for(WebElement i : dlist)
		{
			if(i.getText().contains(date))
			{
				i.click();
				break;
			}
		}
	}

}
