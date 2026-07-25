package WebTablePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/tables");
	
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
		
		Thread.sleep(2000);
		
		 List<WebElement> allColumns = driver.findElements(By.xpath("//table[@id='table1']//thead//th"));
		
		int rowCount = allRows.size();
		int colCount = allColumns.size();
		
		System.out.println("No. of rows present in table : " + rowCount);
		System.out.println("No. of columns present in table : " + colCount);
		
		driver.quit();
	}
	
	
}










