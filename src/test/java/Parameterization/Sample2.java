package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample2 {	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Step-1: Reach to the file
		FileInputStream file = new FileInputStream("D:\\21stMarchFSST\\Parameterization.xlsx");
		
		//Step-2: Open the File
		//Step-3: Enter to the Sheet
		//Step-4: Highlight the 4th row (3rd rowIndex)
		//Step=5: Highlight the 3rd cell/column (2nd cellIndex) 
		//Step-6: Fetch/Read the value of highlighted field/tab
		
		String value = WorkbookFactory.create(file).getSheet("Sheet2").getRow(3).getCell(2).getStringCellValue();
		
		//print the value into the console
		System.out.println(value);		
		
	}

}
