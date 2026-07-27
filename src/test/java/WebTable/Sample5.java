package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample5 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		for(int i=1; i<=4; i++)
		{
			
			//Fetch the complete row of the table
			//iterate through each column of the particular row and get the data
			WebElement tableRow = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td["+i+"]"));
		
			String rowData = tableRow.getText();
			
			System.out.println(rowData);
		}
	
		driver.quit();
	}
	
}
