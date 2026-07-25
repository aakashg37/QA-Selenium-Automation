package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Identify all Columns present in WebTable
		List<WebElement> allColumns=driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th"));
		
		int columnCount = allColumns.size();
		
		System.out.println("Columns Present in Table : " + columnCount);
		
		driver.quit();
	}
}	




