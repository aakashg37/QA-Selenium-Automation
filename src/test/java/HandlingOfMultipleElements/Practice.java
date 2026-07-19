package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser : Chrome
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("problem_user");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.saucedemo.com/inventory.html");
		
		Thread.sleep(2000);
		
		//identify the price element and store it into a list 
		//List<WebElement> prices=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
		
		//taking the list of whole products 
		List<WebElement> products=driver.findElements(By.xpath("//div[@class='inventory_item']"));
		
		//System.out.println(products.size());
		
		Thread.sleep(2000);
		
		double cheapest = Double.MAX_VALUE;
		
		String cheapestProduct="";
		
		//extracting the each product one by one from the list of product
		for(WebElement product : products)
		{
			//identifying the productName
			//String productName=product.findElement(By.xpath("//div[@class='inventory_item_name ']")).getText();
			
			String productName = product.findElement(By.className("inventory_item_name")).getText();
			
			//identifying the product price
			//String priceText=product.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();			
			
			String priceText = product.findElement(By.className("inventory_item_price")).getText();
			
			//removing the $ by using replace method and removing the spaces
			priceText =priceText.replace("$", "").trim();
			
			//convert the String into double
			double amount= Double.parseDouble(priceText);
			
			if(amount < cheapest) {
				cheapest=amount;
				cheapestProduct=productName;
			}
			
		}
		System.out.println("Cheapest Amount is : $"+cheapest);
		System.out.println("Cheapest Product Name is : "+cheapestProduct);
		
		driver.quit();
	}
}
