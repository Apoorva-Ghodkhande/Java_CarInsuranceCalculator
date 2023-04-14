package reusableComponents;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {

	public List<String> getDropdownOptionsAsList(WebElement ele)
	{
		Select select = new Select(ele);
		List<WebElement> list_of_opiton= select.getOptions();
		List<String> list= new ArrayList<>();
		for (WebElement webElement : list_of_opiton) {
			list.add(webElement.getText());
		}
		return list;		
	}
	
}
