package WebTablePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3Updated {
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		//where department is insurance
		for(int i=1; i<=3; i++)
		{
			String deptName=driver.findElement(By.xpath("//table[contains(@class,'-striped')]/tbody/tr["+i+"]/td[6]")).getText();
			
			if(deptName.equals("Insurance"))
			{
				//click on the Edit Action
				driver.findElement(By.xpath("//table[contains(@class,'-striped')]/tbody/tr[1]/td[7]/div/span[1]")).click();
				
				//Update the value into the Salary input field
				List<WebElement> inputFields=driver.findElements(By.xpath("//form[@id='userForm']//input"));
				
				for(WebElement input : inputFields){
					
					if(input.getAttribute("id").equals("salary")){
						
						input.clear();
						Thread.sleep(1000);
						input.sendKeys("20000");
						
						//submit the form
						driver.findElement(By.cssSelector("button#submit")).click();
						
						break;
					}
				
				} 		
			
			}
		
		}	
		
		Thread.sleep(4000);
		
		driver.quit();
	}
}
