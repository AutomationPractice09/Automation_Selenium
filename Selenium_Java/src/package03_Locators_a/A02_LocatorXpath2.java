package package03_Locators_a;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class A02_LocatorXpath2 {

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Digvijay");
		driver.findElement(By.xpath("//input[@class='form-control' and @name='lastname']")).sendKeys("Patil");
		driver.findElement(By.xpath("//input[@class='form-contr' or @name='email']")).sendKeys("royal35012@gmail.com");
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("9676123412");
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=5]")).sendKeys("royal@12350");
		driver.findElement(By.xpath("(//input[@class='form-control'])[6]")).sendKeys("royal@12350");

		
		List<WebElement> list = driver.findElements(By.xpath("(//div[@class='col-sm-10'])[8]//label"));
		System.out.println("Total Element i list is: "+list.size());
		
		WebElement ele = driver.findElement(By.xpath("//label[@class='radio-inline']"));
		
		for(WebElement i : list)
		{
			if(!(i.isSelected()))
					{
						System.out.println(ele.getText());
						i.click();
						break;
					}
		}
		
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		WebElement title = driver.findElement(By.xpath("(//h1)[2]"));
		String exp = "Created!";
		
		if(title.getText().contains(exp))
		{
			System.out.println(title.getText()+" Test is Passed");
		}
		else
		{
			System.out.println("Test is Failed");
		}
		
		
		
	}

}
