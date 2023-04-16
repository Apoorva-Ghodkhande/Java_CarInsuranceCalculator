package pageObjects;

import java.util.HashMap;
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
	
	public void enterProductData(HashMap<String, String> testData)
	{
		tboxStartDate.sendKeys(testData.get("Product_startdate").toString());
		cm.selectValueInDropdown(ddInsuranceSum, testData.get("Product_insurancesum"));
		cm.selectValueInDropdown(ddDamageInsurance, testData.get("Product_damageinsurance"));
		cm.selectCheckboxes(checkBoxOptionalProducts, testData.get("ProductOptional_Products"));
		btnNext.click();	
	}


}
