package WebTablePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/tables");	
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//fetch the 3rd row from the table and print it into the console
		for(int i=1; i<=6; i++) {
			WebElement s2=driver.findElement(By.xpath("//table[@id='table1']//tbody/tr[2]/td["+i+"]"));
			
			System.out.println(s2.getText());
			
		}
	
		driver.quit();
	}
}
