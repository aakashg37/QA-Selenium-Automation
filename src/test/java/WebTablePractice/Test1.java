package WebTablePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//print all the data from the table into the console
		
		//fetch all the rows from the table
		//List<WebElement> allRows=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		
		//iterate from each row of the table
		for(int i=2; i<=7; i++){
			
			//iterating inside the each row and printing the data into the console
			for(int j=1; j<=4; j++) {
				
				WebElement	row=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td["+j+"]"));
				
				System.out.print(row.getText()+" - ");
			
			}
			System.out.println();
		}
		
		driver.quit();
	}
	
	
}
