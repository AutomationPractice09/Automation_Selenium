package generic_Package;

import java.util.List;
import org.openqa.selenium.WebElement;

public class Utility_02 {
	
	List<WebElement> list;

	public static void from(WebElement from, List<WebElement> list, String search, String dest) 
	{
	
		from.click();
		from.sendKeys(search);
		System.out.println("Total values in list are: "+list.size());
		for(WebElement i : list)
		{
			System.out.println(i.getText());
			
			if(i.getText().contains(dest))
			{
				i.click();
				break;
			}
		}
		
		
	}

}
