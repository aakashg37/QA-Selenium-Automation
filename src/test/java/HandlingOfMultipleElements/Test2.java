package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		
		for(WebElement link : allLinks)
		{
			String linkText=link.getText();
			System.out.println(linkText);
		}
		
		driver.quit();
		
	}
	
	
}
