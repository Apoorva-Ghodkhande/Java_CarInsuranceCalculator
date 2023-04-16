package pageObjects;

import java.util.ArrayList;
import java.util.HashMap;
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
	
	public void enterVehicleData(HashMap<String, String> testData)
	{
		cm.selectValueInDropdown(ddMake, testData.get("Vehicle_Make"));
		cm.selectValueInDropdown(ddModel, testData.get("Vehicle_Model"));
		tboxCylinderCapacity.sendKeys(testData.get("Vehicle_CylinderCapacity"));
		tboxEnginePerformance.sendKeys(testData.get("Vehicle_Engine Performance"));
		tboxDateofManufacture.sendKeys(testData.get("Vehicle_Date of Manufacture").toString());
		cm.selectValueInDropdown(ddNumberOfSeatsMotorcycle, testData.get("Vehicle_No of Seats_motorcycle"));
		tboxListPrice.sendKeys(testData.get("Vehicle_ListPrice"));
		tboxAnnualMileage.sendKeys(testData.get("Vehicle_Annual Mileage"));
	    btnNextEnterInsurantdata.click();
	}
}
