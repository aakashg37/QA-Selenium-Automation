package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Group2 {

	@Test	(groups="Regression")
	public void verifyLoginBtnEnabled() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		boolean isEnabled=driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		System.out.println("Is button Enabled? :"+isEnabled);
		
	}
	
	
	
}






