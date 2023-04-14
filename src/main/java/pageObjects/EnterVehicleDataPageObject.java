package pageObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testBase.ObjectRepo;

public class EnterVehicleDataPageObject extends ObjectRepo {

	@FindBy(id="model")
	WebElement ddModel;
	
	public EnterVehicleDataPageObject() {
	PageFactory.initElements(driver, this);
	}
		
	public List<String> getDropDownOptionModel()
	{
	return cm.getDropdownOptionsAsList(ddModel);
	
	}
}
