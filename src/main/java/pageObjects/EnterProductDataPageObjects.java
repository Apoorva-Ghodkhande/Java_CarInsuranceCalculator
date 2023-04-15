package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.ObjectRepo;

public class EnterProductDataPageObjects extends ObjectRepo{

	@FindBy(id="startdate")
	WebElement tboxStartDate;
	
	@FindBy(id="insurancesum")
	WebElement ddInsuranceSum;	
	
	@FindBy(id="damageinsurance")
	WebElement ddDamageInsurance;
	
//	@FindBy(xpath="//input[@name='Optional Products[]']")
//	List<WebElement> checkBoxOptionalProducts;	
	
	@FindBy(xpath="//input[ @name='Optional Products[]']/parent::label")
	List<WebElement> checkBoxOptionalProducts;
	
	@FindBy(id="nextselectpriceoption")
	WebElement btnNext;	
	
	public EnterProductDataPageObjects() {
	PageFactory.initElements(driver, this);
	}
	
	public void enterProductData()
	{
		tboxStartDate.sendKeys("06/01/2023");
		cm.selectValueInDropdown(ddInsuranceSum, "3000000");
		cm.selectValueInDropdown(ddDamageInsurance, "No Coverage");
		cm.selectCheckboxes(checkBoxOptionalProducts, "Euro Protection");
		btnNext.click();
		

		
	}


}
