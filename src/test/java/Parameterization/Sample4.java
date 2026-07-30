package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample4 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException{
		
		FileInputStream file=new FileInputStream("D:\\21stMarchFSST\\Parameterization.xlsx");
		
		boolean value=WorkbookFactory.create(file).getSheet("Sheet2").getRow(6).getCell(3).getBooleanCellValue();
		
		System.out.println(value);
	}
}
