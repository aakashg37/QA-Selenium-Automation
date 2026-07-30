package WebTablePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//select the language on the alert
		driver.findElement(By.xpath("//button[text()='English']")).click();
		
		Thread.sleep(2000);
		
		//click on the Calendar
		driver.findElement(By.xpath("//span[@class='ng-tns-c69-9 ui-calendar']")).click();
		
		Thread.sleep(2000);
		
		//locate the date in the table and click on it
		driver.findElement(By.xpath("//table[contains(@class,'ui-datepicker-calendar')]/tbody/tr[5]/td[6]")).click();
		
		Thread.sleep(2000);
		
		//Identify All Classes and click on it
		driver.findElement(By.xpath("//div[contains(@class,'ng-tns-c76-10 ui-dropdown')]")).click();
		
		Thread.sleep(2000);
		
		//Select the class from the dropdown
		List<WebElement> allClasses=driver.findElements(By.xpath("//div[@class='ui-dropdown-items-wrapper ng-tns-c76-10']//p-dropdownitem"));
		
		System.out.println(allClasses.size());
		
		Thread.sleep(2000);
		
		for(WebElement Class : allClasses)
		{
			String text=Class.getText();
			System.out.println(text);
			
			if(text.equals("AC First Class (1A)")) {
				
				Class.click();
				break;				
			}			
			
		}
		
		
		
	}
}










