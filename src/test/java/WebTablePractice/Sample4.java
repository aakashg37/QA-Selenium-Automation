package WebTablePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//print all the rows from the table into the console
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		
		/*
		for(WebElement row: allRows) {
			System.out.println(row.getText());
		}*/
		
		//Q. 
		//Find the "due" [column where price is there] for the "Bach" [lastName column] from the given table
		
		for(WebElement row : allRows)
		{
			// to Find the first <td> inside the current <tr>. --> ./td[1]
			
			// . means current WebElement , so Selenium starts searching from the row element.
			// /td direct child
			// [1] means first matching element
			String lastName=row.findElement(By.xpath("./td[1]")).getText();
			
			if(lastName.equals("Conway")) {
				
				String due=row.findElement(By.xpath("./td[4]")).getText();
				System.out.println("Due for "+lastName+" is : "+due);
				break;
			}
			
		}
		
		driver.quit();
	}
}











