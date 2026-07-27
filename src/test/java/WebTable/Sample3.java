package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window();
		
		Thread.sleep(2000);
		
		//Get/fetch/read/ the text from the table --> "Javascript"
		WebElement s1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]/td[3]"));
		
		String text = s1.getText();
		
		System.out.println(text);
		
		driver.quit();
		
	}

}
