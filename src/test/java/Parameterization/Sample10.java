package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample10 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("D:\\21stMarchFSST\\Parameterization.xlsx");
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet6");
	
		int lastCellIndex = sheet.getRow(0).getLastCellNum()-1;
		
		
		for(int i=0; i<=lastCellIndex; i++ ) {
			
			String text =sheet.getRow(0).getCell(i).getStringCellValue();
			
			System.out.println(text);
		}
		
	}
	
}




