package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Find the size of the rows
		List<WebElement> allRows=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		
		int rowCount = allRows.size();
		
		
		for(int i=2; i<=rowCount; i++){
			//Identify the Author --> "Amit"
			WebElement author = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[2]"));
			
			String authorName = author.getText();
			
			if(authorName.equals("Amit")){
				
				//Identify the BookName for the current author
				WebElement book = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[1]"));
				
				String bookName = book.getText();
			
				System.out.println(bookName);
			}		
		}
		
		driver.quit();
	}
}

