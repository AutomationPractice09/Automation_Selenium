package generic_Package;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility_01 
{
	
	public static void selectOptions(WebElement ele, String value)
	{
		Select dd = new Select(ele);
		
        System.out.println("Is dropdown is multi selectable: "+dd.isMultiple());
		
        List<WebElement> allOptions = dd.getOptions();
        
        System.out.println("Total number of values in dropdown: "+allOptions.size());
        
        for(WebElement i : allOptions)
        {
        	System.out.println(i.getText());
        	
        	if(i.getText().contains(value))
        	{
        		i.click();
        		break;
        	}
        }
	}

}
