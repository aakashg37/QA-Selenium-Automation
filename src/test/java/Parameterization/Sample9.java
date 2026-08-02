package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample9 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("D:\\21stMarchFSST\\Parameterization.xlsx");
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet4");
		
		int lastRowIndex=sheet.getLastRowNum();
		
		
		for(int i=0; i<=lastRowIndex; i++) {
			
			String text=sheet.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println(text);
			
		}
		
		
	}
}
