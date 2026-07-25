package WebTablePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/tables");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Identify all the rows present in the table
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
		
		int rowCount = allRows.size();
		
		System.out.println("No. of Rows present in the table are : " + rowCount);
		
		Thread.sleep(2000);
		
		//Identify all the columns present in the table
		List<WebElement> allColumns = driver.findElements(By.xpath("//table[@id='table1']//tr[1]//th"));
		
		int colCount = allColumns.size();
		
		System.out.println("No. of Columns present in the table are : "+colCount);
		
		driver.quit();
	}
	
}





