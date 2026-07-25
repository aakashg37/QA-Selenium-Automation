package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Identify the rows present in table
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		
		int count = allRows.size();
		
		System.out.println("Rows present in the table : " + count);
		
		driver.quit();
	}
	
	
}









