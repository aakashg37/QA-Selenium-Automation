package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	//Find the cheapest price product from a product grid.
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");

		Thread.sleep(4000);
		
		List<WebElement> priceList=driver.findElements(By.xpath("//span[@class='price-new']"));
		
		System.out.println(priceList.size());
		
		String lowestPrice;
		
		for(WebElement price : priceList) 
		{
			System.out.println(price.getText());
		}
		
		driver.quit();
		
	}
	
}	

















