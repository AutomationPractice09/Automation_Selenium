package package10_Capabilities;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01_Capabilities {

	public static void main(String[] args) 
	{
	
		ChromeDriver driver = new ChromeDriver();
		Capabilities cap = driver.getCapabilities();
		
		Map<String,Object> all = cap.asMap();
		
		System.out.println(all);	
	}

}
