package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\21stMarchFSST\\Parameterization.xlsx");
		
		int lastRowIndex = WorkbookFactory.create(file).getSheet("Sheet6").getLastRowNum();
		
		System.out.println(lastRowIndex);
	}
	
}
