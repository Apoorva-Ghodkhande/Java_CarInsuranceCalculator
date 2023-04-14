package InsuranceCalculator_Motorcycle;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageObjects.EnterVehicleDataPageObject;
import testBase.TestBase;

public class ErrorHandlingCylinderCapacity_001 extends TestBase {

	@Test(enabled=false)
	public void errorHandlingCylCap()
	{
		
		homePage.clickOnMotorcycleLink();
		
	}
	
	@Test(enabled = true)
	public void verifyModelOptionDropdown()
	{  
		homePage.clickOnMotorcycleLink();
		EnterVehicleDataPageObject e=new EnterVehicleDataPageObject();
		List<String> actualList=e.getDropDownOptionModel();
		test.log(Status.INFO,"Actual List is "+actualList);
		List<String> expectedList=Arrays.asList("– please select –","Scooter","Three-Wheeler","Moped","Motorcycle");
		test.log(Status.INFO,"Expected List is "+expectedList);
		Assert.assertEquals(actualList, expectedList,"Comparing the list element: ");
				
				
	
	}
}
