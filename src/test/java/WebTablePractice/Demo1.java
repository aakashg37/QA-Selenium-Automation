package WebTablePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Identify the rows in the web table
		List<WebElement>  allRows=driver.findElements(By.xpath("//table[contains(@class,'-striped -highlight table')]//tr"));
		
		Thread.sleep(2000);
		
		//Identify all the columns present in web table
		List<WebElement> allColumns = driver.findElements(By.xpath("//table[contains(@class,'-striped -highlight')]//th"));
		
		int rowCount = allRows.size();
		int colCount = allColumns.size();
		
		System.out.println("No. of Rows present in table are : " + rowCount);
		System.out.println("No. of Columns present in table are : " + colCount);
				
		driver.quit();
		
	}	
		
}









