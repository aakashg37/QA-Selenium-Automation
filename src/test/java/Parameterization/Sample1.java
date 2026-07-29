package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Step-1: Reach to the file
		FileInputStream file=new FileInputStream("D:\\21stMarchFSST\\Parameterization.xlsx");
		
		//Step-2: Open an ExcelSheet
		//Step-3: Enter into a particular sheet
		//Step-4: Highlight the row (0th row index)
		//Step-5: Highlight the cell/column (0th cell index)
		//Step-6: Read/fetch the data from the highlighted field
		
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		//Step-7: Print the data into the console
		System.out.println(value);
	}
}
