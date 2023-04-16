package pageObjects;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.ObjectRepo;

public class EnterInsurantDataPageObject extends ObjectRepo{

	
	@FindBy(id="firstname")
	WebElement tBoxFirstName;
	
	@FindBy(id="lastname")
	WebElement tBoxLastName;
	
	@FindBy(id="birthdate")
	WebElement tboxBirthDate;
	
	
	@FindBy(xpath="//input[@name='Gender']/parent::label")
	List<WebElement> radioGender;	
	
	//input[@name='Gender']/parent::label
	
	@FindBy(id="streetaddress")
	WebElement tBoxStreetAddress;
	
	@FindBy(id="country")
	WebElement ddCountry;	
	
	@FindBy(id="zipcode")
	WebElement tBoxZipCode;
	
	@FindBy(id="city")
	WebElement tBoxCity;	
	
	@FindBy(id="occupation")
	WebElement ddOccupation;	
	
	@FindBy(xpath="//input[ @name='Hobbies']/parent::label")
	List<WebElement> checkBoxHobbies;		
	
	@FindBy(id="website")
	WebElement tboxWebsite;
	
	@FindBy(id="nextenterproductdata")
	WebElement btnNext;	
	
	public EnterInsurantDataPageObject() {
	PageFactory.initElements(driver, this);
	}
	
	
	public void enterInsurantData(HashMap<String, String> testData)
	{
		tBoxFirstName.sendKeys(testData.get("Insurant_FirstName"));
		tBoxLastName.sendKeys(testData.get("Insurant_LastName"));
		tboxBirthDate.sendKeys(testData.get("Insurant_birthdate").toString());
		cm.selectRadioButton(radioGender, testData.get("Insurant_gender"));
		tBoxStreetAddress.sendKeys("aaaa aaa a");
		cm.selectValueInDropdown(ddCountry, testData.get("Insurant_country"));
		tBoxZipCode.sendKeys(testData.get("Insurant_zipcode"));
        tBoxCity.sendKeys("Mumbai");
        cm.selectValueInDropdown(ddOccupation, testData.get("Insurant_occupation"));
        cm.selectCheckboxes(checkBoxHobbies, testData.get("Insurant_Hobby"));
        tboxWebsite.sendKeys("http://sampleapp.tricentis.com/101/app.php");
        btnNext.click();
	}
}
