package InsuranceCalculator_Motorcycle;

import java.util.HashMap;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import reusableComponents.ExcelOperations;
import testBase.TestBase;

public class EndToEndTest extends TestBase {
	ExcelOperations ex =new ExcelOperations();
 @Test(dataProvider = "vehicleData")
	public void InsuranceMotorcycle(Object obj1) throws Exception
	{
	 HashMap<String, String> testData= (HashMap<String, String>) obj1;
	 System.out.println("Test Data is: "+testData);
	 homePage.clickOnMotorcycleLink();
	 enterVehicleDataPage.enterVehicleData(testData);
	 enterInsurantDataPage.enterInsurantData(testData);
	 enterProductDataPage.enterProductData(testData);
	 enterPriceOption.selectPlanOptionAndClickNext(testData);
	}
 
 @DataProvider(name="vehicleData")
 public Object[][] getVehicleData() throws Exception
 {
	 Object[][] obj=new Object[ex.getRowCount()][1];
	
	 for (int i = 1; i <= ex.getRowCount(); i++) {
		 HashMap<String, String> hs=ex.getTestDataInMap(i);
		obj[i-1][0]=hs;
	}
	 return obj;
 }
	}

