package reusableComponents;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperations {
	
	String filePath;
	Sheet sh;
	public ExcelOperations() {
	try {
		filePath=System.getProperty("user.dir")+PropertiesOperations.getValueForTheKey("Excelfilepath");
	} catch (IOException e) {

		e.printStackTrace();
	}
	File file=new File(filePath);
	Workbook wb;
	try {
		wb = WorkbookFactory.create(file);
	    sh=wb.getSheet("InsurancePremium");
	} catch (EncryptedDocumentException e) {
		e.printStackTrace();
	} catch (IOException e) {

		e.printStackTrace();
	}

	}
	
	
	public HashMap<String, String> getTestDataInMap(int rowNo) throws EncryptedDocumentException, IOException
	{

		HashMap<String, String> mp=new HashMap<>();
		for (int i = 0; i < sh.getRow(0).getLastCellNum(); i++) {
			sh.getRow(rowNo).getCell(i).setCellType(CellType.STRING);
			mp.put(sh.getRow(0).getCell(i).toString(), sh.getRow(rowNo).getCell(i).toString());
			
		}
		return mp;
	}  
	
public int getRowCount() {
	return sh.getLastRowNum();	
}	



public int getColumnCount() {
return sh.getRow(0).getLastCellNum();
}

}