package Autosuggestion_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	//not working
		//it not taking all elements -->size 0 is giving
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ajio.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("shoes");
		
		Thread.sleep(4000);
		
		//identify the element suggestions and store it in list
		List<WebElement> autosuggestions=driver.findElements(By.xpath("//div[@class='FUM3I']//li"));
		
		System.out.println(autosuggestions.size());
		
		for(WebElement asg: autosuggestions)
		{
			String text=asg.getText();
			
			if(text.equals("Shoes For Men")) {
				asg.click();
				break;
			}
			
		}
		
	}
}







