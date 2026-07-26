package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/bus-tickets/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Identify the hidden division and click to close it
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		
		Thread.sleep(2000);
		
		//click on the from field
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		
		Thread.sleep(1000);
		
		//Identify the input field and enter the source city into it
		WebElement input =driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest__input')]"));
		
		input.sendKeys("Pune");
		
		Thread.sleep(1000);
		
		List<WebElement> citySuggestions = driver.findElements(By.xpath("//div[contains(@class,'react-autosuggest__section-container')]//li"));
		
		System.out.println(citySuggestions.size());
		
		for(WebElement city : citySuggestions)
		{
			if(city.getText().equals("Pune, Maharashtra")) {
				System.out.println("Pune found and clicked");
				city.click();
				break;
			}
		}
		System.out.println("for eneded");
		
		Thread.sleep(4000);
	
		//Identify the input field and enter the Destination city into it
		//driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest__input')]")).sendKeys("Bangalore");
		
		input = driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest__input')]"));
		
		input.sendKeys("Bangalore");
		
		Thread.sleep(1000);
		
		//update the citySuggestion with latest one as both have the same xpath
		citySuggestions = driver.findElements(By.xpath("//div[contains(@class,'react-autosuggest__section-container')]//li"));
		
		System.out.println(citySuggestions.size());
		
		for(WebElement city : citySuggestions)
		{
			if(city.getText().equals("Electronic City, Bengaluru")) {
				System.out.println("Bangalore found and clicked");
				city.click();
				break;
			}
		}
		
		Thread.sleep(2000);

		//Identify the date element and click on the date
		//driver.findElement(By.xpath("//input[@id='travelDate']")).click();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@aria-label='Sat Aug 01 2026']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button#search_button")).click();
		
		//driver.quit();
	}
	
}	










