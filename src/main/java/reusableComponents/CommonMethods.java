package reusableComponents;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {

	
	public void selectValueInDropdown(WebElement ele, String option)
	{
		Select select = new Select(ele);
		select.selectByValue(option);
	}
	
  public void selectRadioButton(List<WebElement> elements,String option)
  {
	  for (WebElement ref : elements) 
	  {
		if(ref.getText().equalsIgnoreCase(option))
				{
			ref.click();
				}
	  }
  }
  
  public void selectCheckboxes(List<WebElement> elements, String options)
  {
	  String[] checkBoxValue= options.split(",");
	  for (WebElement ele : elements) {
		for (String ch : checkBoxValue) {
			if(ele.getText().equalsIgnoreCase(ch))
			{
				ele.click();
			}
		}
	}
	  
  }
	
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
