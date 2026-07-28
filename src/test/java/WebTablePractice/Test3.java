package WebTablePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	//Q. Update the salary where department=Insurance
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		//locate the insurance department and click on Edit Action
		driver.findElement(By.xpath("//table[contains(@class,'-striped')]/tbody/tr[1]/td[7]//span[1]")).click();
		
		Thread.sleep(3000);
		
		//Identify input fields of the form
		List<WebElement> formInputs=driver.findElements(By.xpath("//form[@id='userForm']//input"));
		
		
		for(WebElement input : formInputs)
		{
			String value=input.getAttribute("id");
			
			if(value.equals("salary")) {
				
				input.clear();
				Thread.sleep(1000);
				input.sendKeys("200000");
				driver.findElement(By.cssSelector("button#submit")).click();
				
				break;
			}
			
		}	
		
		
	}
}
