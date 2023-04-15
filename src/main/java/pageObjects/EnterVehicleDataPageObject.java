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
	
	@FindBy(id="make")
	WebElement ddMake;	
	
	@FindBy(id="cylindercapacity")
	WebElement tboxCylinderCapacity;	
	
	@FindBy(id="engineperformance")
	WebElement tboxEnginePerformance;
	
	@FindBy(id="dateofmanufacture")
	WebElement tboxDateofManufacture;
	
	@FindBy(id="numberofseatsmotorcycle")
	WebElement ddNumberOfSeatsMotorcycle;	
	
	@FindBy(id="listprice")
	WebElement tboxListPrice;
	
	@FindBy(id="annualmileage")
	WebElement tboxAnnualMileage;
	
	@FindBy(id="nextenterinsurantdata")
	WebElement btnNextEnterInsurantdata;
	
	public EnterVehicleDataPageObject() {
	PageFactory.initElements(driver, this);
	}
		
	public List<String> getDropDownOptionModel()
	{
	return cm.getDropdownOptionsAsList(ddModel);
	
	}
	
	public void enterVehicleData()
	{
		cm.selectValueInDropdown(ddMake, "BMW");
		cm.selectValueInDropdown(ddModel, "Motorcycle");
		tboxCylinderCapacity.sendKeys("1000");
		tboxEnginePerformance.sendKeys("1111");
		tboxDateofManufacture.sendKeys("03/10/2010");
		cm.selectValueInDropdown(ddNumberOfSeatsMotorcycle, "2");
		tboxListPrice.sendKeys("20000");
		tboxAnnualMileage.sendKeys("200");
	    btnNextEnterInsurantdata.click();
	}
}
