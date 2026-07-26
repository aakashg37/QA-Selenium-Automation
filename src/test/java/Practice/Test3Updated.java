package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test3Updated {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(
	            driver,
	            Duration.ofSeconds(10)
	        );
		
		driver.get("https://www.makemytrip.com/bus-tickets/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Identify the hidden division and click to close it
		WebElement closePopup = driver.findElement(By.xpath("//span[@class='commonModal__close']"));
		
		wait.until(
                ExpectedConditions.elementToBeClickable(closePopup)
            ).click();
		
		//click on the from field
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		
		
		selectCity(driver,wait,"Pune","Pune, Maharashtra");
	
		selectCity(driver,wait,"Bangalore","Electronic City, Bengaluru");
		
		
		
	}
	
	
	public static void selectCity(WebDriver driver,WebDriverWait wait,String selectCity,String expectedCity) throws InterruptedException {
		
		Thread.sleep(2000);
		
		//Identify the input field and enter the source city into it
		WebElement input =driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest__input')]"));
		
		wait.until(ExpectedConditions.elementToBeClickable(input)).click();
		
		input.sendKeys(selectCity);
				
				
		List<WebElement> citySuggestions = driver.findElements(By.xpath("//div[contains(@class,'react-autosuggest__section-container')]//li"));
				
		//System.out.println(citySuggestions.size());
				
			for(WebElement city : citySuggestions)
			{
				if(city.getText().equals(expectedCity)) {
					System.out.println(expectedCity + " , "+ city.getText() + "  clicked");
					city.click();
					break;
				}
			}
		
		return;
	}
	
	
	
}
















