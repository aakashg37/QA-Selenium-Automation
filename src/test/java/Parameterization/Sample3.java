package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample3 {
	//Get the numeric cell value
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Step-1: Reach to the file
		FileInputStream file=new FileInputStream("D:\\21stMarchFSST\\Parameterization.xlsx");
		
		double value1=WorkbookFactory.create(file).getSheet("Sheet2").getRow(1).getCell(1).getNumericCellValue();
		
		System.out.println(value1);			
		
	}
}
