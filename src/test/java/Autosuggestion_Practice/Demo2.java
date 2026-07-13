package Autosuggestion_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	//working
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("shoes");
		
		Thread.sleep(2000);
		
		List<WebElement> asg=driver.findElements(By.xpath("//div[@class=' desktop-autoSuggest desktop-showContent']//li"));
		
		for(WebElement as:asg)
		{
			String text=as.getText();
			if(text.equals("Casual Shoes Men")) {
				as.click();
				break;
			}
		}
		
	}
}








