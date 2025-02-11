package package05_Calendar;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A02_CalendarGoibibo 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		
		
		String date = "30";
		String month = "December";
		String year = "2024";
		
		WebElement close = driver.findElement(By.xpath("//span[contains(@class,'logSprite')]"));
		
		if (close.isDisplayed())
		{
			close.click();
		}
		
		driver.findElement(By.xpath("(//span[contains(@class,'sc-12foipm-8')])[1]")).click();
		
		while(true)
		{
		String adate = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
		
		String amonth = adate.split(" ")[0];
		String ayear = adate.split(" ")[1];
		
		if(amonth.contains(month) && ayear.contains(year))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
	}
		
		
		List<WebElement> list = driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]/div//div"));
		for(WebElement i : list)
		{
			if(i.getText().contains(date))
			{
				i.click();
				break;
			}
		}
	}

}
