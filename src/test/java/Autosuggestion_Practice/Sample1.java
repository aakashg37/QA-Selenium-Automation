package Autosuggestion_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//identify the search bar and enter the input
		driver.findElement(By.xpath("(//input[@name='q'])[1]")).sendKeys("Mobile");
		
		Thread.sleep(2000);
		
		//identify all autosuggestions
		//List<WebElement> Autosuggestions=driver.findElements(By.xpath("//ul[contains(@class,'VCplLH lTpUwR _1psv1ze5l _1psv1ze9l')]//li"));
		
		List<WebElement> Autosuggestions=driver.findElements(By.xpath("//div[@class='olwU0Z CXZSEo']//li"));
		
		for(WebElement autosuggestion : Autosuggestions)
		{
			String text=autosuggestion.getText();
			//System.out.println("text: "+ text);			
			
			if(text.equals("mobile under 20000rs")) {
				autosuggestion.click();
				break;
			}			
		}
		
		
	}
}









