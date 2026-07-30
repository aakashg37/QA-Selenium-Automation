package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample5 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException{
		FileInputStream file=new FileInputStream("D:\\21stMarchFSST\\Parameterization.xlsx");
	
		int RowSize = WorkbookFactory.create(file).getSheet("Sheet3").getLastRowNum()+1;
	
		System.out.println("Last Row Index : "+RowSize);
	
	}
	
	
}
