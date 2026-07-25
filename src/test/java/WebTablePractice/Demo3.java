package WebTablePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Identify all rows from web table
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@name='courses']//tr"));
		
		//get the count of rows
		int rowCount = allRows.size();
		
		//Identify all columns from the table
		List<WebElement> allColumns= driver.findElements(By.xpath("//table[@name='courses']//tr[1]//th"));
		
		//get the count of columns 
		int colCount = allColumns.size();
		
		
		//print the count of rows and columns
		System.out.println("No. of rows in table are : " + rowCount);
		System.out.println("No. of columns in table are : " + colCount);
		
		driver.quit();
		
	}
}
