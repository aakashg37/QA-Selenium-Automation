package WebTablePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//fetch the 4th row from the table and the data into the console
		
		for(int i=1; i<=6; i++) {
			
			WebElement s3=driver.findElement(By.xpath("//table[contains(@class,'-striped')]//tbody/tr[3]/td["+i+"]"));
			
			System.out.println(s3.getText());
		}
		
		driver.close();
	}
	
}
