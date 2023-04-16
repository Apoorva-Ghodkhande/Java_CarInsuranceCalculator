package reusableComponents;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperations {
	
	String filePath;
	public ExcelOperations() throws Exception {
	filePath=System.getProperty("user.dir")+PropertiesOperations.getValueForTheKey("Excelfilepath");
	}
	
	
	public HashedMap<String, String> getTestDataInMap(int rowNo) throws EncryptedDocumentException, IOException
	{
		File file=new File(filePath);
		Workbook wb=WorkbookFactory.create(file);
		Sheet sh=wb.getSheet("InsurancePremium");
		HashedMap<String, String> mp=new HashedMap<>();
		for (int i = 0; i < sh.getRow(0).getLastCellNum(); i++) {
			mp.put(sh.getRow(0).getCell(i).toString(), sh.getRow(rowNo).getCell(i).toString());
			
		}
		return mp;
	}  
	
	
public static void main(String[] args) throws Exception
{
	ExcelOperations ex= new ExcelOperations();
	System.out.println(ex.getTestDataInMap(1));
}

}
