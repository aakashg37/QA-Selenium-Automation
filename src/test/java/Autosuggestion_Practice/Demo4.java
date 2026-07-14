package Autosuggestion_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo4 {
	//working
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("video");
		
		Thread.sleep(4000);
		
		//List<WebElement> asgs=driver.findElements(By.xpath("//div[@id='gAC']//li"));
		
		List<WebElement> asgs=driver.findElements(By.xpath("//ul[@class='ebay-autocomplete-large ui-autocomplete']//li"));
		
		
		for( WebElement asg : asgs ) {
			
			String txt=asg.getText();
			
			if(txt.equals("video game")) {
				
				asg.click();
				break;
				
			}
			
		}
		
		
		
	}
}










