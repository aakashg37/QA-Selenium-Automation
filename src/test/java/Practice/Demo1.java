package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("testing");
		
		Thread.sleep(3000);
		
		List<WebElement> autosuggestions=driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]//li"));
		
		for(WebElement suggestion : autosuggestions)
		{
			String text=suggestion.getText();
			
			if(text.equals("testing types")) {
				
				suggestion.click();
				break;				
			}
			
		}
	}
}
