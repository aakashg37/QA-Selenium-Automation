package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//identify search bar and enter skybags in it
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("skybags");
		
		Thread.sleep(2000);
		
		//identify all the autosuggestions 
		List<WebElement> autosuggestions=driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]//li"));
		
		
		for(WebElement autosuggestion :autosuggestions)
		{
			String text=autosuggestion.getText();
			
			if(text.equals("skybags backpack")) {
				autosuggestion.click();
				break;
			}
			
		}
		
		
	}
	
	
}








