package WebTablePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		List<WebElement> rowDatas=driver.findElements(By.xpath("//table[@name='courses']//tr[6]/td"));
			
		for(WebElement row : rowDatas)	
		{
			System.out.println(row.getText());
		}
		
		driver.quit();
		
	}
	
	
}
