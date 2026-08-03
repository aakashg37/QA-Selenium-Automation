package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("D:\\21stMarchFSST\\Parameterization.xlsx");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet7");
		
		int rowLastIndex=sh.getLastRowNum();
		
		for(int i=0; i<=rowLastIndex; i++) {
			
			 int cellLastIndex=sh.getRow(i).getLastCellNum()-1;
			
			for(int j=0; j<=cellLastIndex; j++)
			{
				
				String text=sh.getRow(i).getCell(j).getStringCellValue();				
				
				System.out.print(text+" ");
				
			}
			
			System.out.println();
		}
		
	}
	
}







