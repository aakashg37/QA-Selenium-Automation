package Autosuggestion_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample3 {
	//not working
	//it not taking all elements -->size 0 is giving
	//pop-up of autosuggestion is not coming
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.meesho.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//identify the search input field and enter the laptop value in it
		//driver.findElement(By.xpath("//input[contains(@class,'sc-dOfePm kBqyGz sc-buN')]")).sendKeys("watches");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Try Saree, Kurti')]")).sendKeys("watches");
		
		
		Thread.sleep(4000);
		
		//identify all the autosuggestions and store it in list object
	 List<WebElement> autosuggestions=driver.findElements(By.xpath("//div[@class='search-results']//p"));
	
	 	System.out.println("before loop size: "+autosuggestions.size());
	 	
	 	
	 	for(WebElement suggestion : autosuggestions) {
	 		
	 		String text=suggestion.getText();
	 		
	 		if(text.equals("watches for boys combo")) 
	 		{
	 			System.out.println("inside if : "+ text);
	 			suggestion.click();
	 			break;
	 		}
	 		
	 	}
	 	System.out.println("outsied for loop");
	 
	 
	}
}










