package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//get the text from the table --> 2000
		WebElement s2=driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]/td[4]"));
		
		String text=s2.getText();
		
		System.out.println(text);
		
		
		driver.quit();
	}
}



