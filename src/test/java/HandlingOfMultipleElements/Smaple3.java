package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Smaple3 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("problem_user");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.saucedemo.com/inventory.html");
		
		Thread.sleep(2000);
		
		//identify the price element and store it into a list 
		List<WebElement> prices=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
		
		Thread.sleep(2000);
		
		double cheapest = Double.MAX_VALUE;
		
		for(WebElement price : prices)
		{
			String priceText=price.getText();
			
			//removing the $ by using replace method and removing the spaces
			priceText =priceText.replace("$", "").trim();
			
			//convert the String into double
			double amount= Double.parseDouble(priceText);
			
			if(amount < cheapest) {
				cheapest=amount;
			}
			
		}
		System.out.println("Cheapest Amount is : $"+cheapest);
		
		driver.quit();
	}
}






