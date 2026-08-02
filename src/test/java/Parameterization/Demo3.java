package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo3 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("D:\\21stMarchFSST\\Parameterization.xlsx");
		
	 	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet6");
		
	 	
	 	
	 	int lastRowIndex=sh.getLastRowNum();
	 	
	 	for(int j=0; j<=lastRowIndex; j++) {
	 			
	 		int lastCellIndex = sh.getRow(j).getLastCellNum()-1;
	 			
	 		for(int i=0; i<=lastCellIndex; i++) {
	 			
	 		    String text=sh.getRow(j).getCell(i).getStringCellValue();
	 			
	 		    System.out.print(text+" ");
	 		}
	 		System.out.println();
	 	}
	}
}
