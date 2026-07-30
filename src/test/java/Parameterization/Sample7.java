package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample7 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException{
		FileInputStream file=new FileInputStream("D:\\21stMarchFSST\\Parameterization.xlsx");
	
		int cellSize = WorkbookFactory.create(file).getSheet("Sheet4").getRow(0).getLastCellNum();
	
		System.out.println("Cell Size : "+ cellSize);
	
	}

}
