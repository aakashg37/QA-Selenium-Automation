package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {
	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		WebDriver driver=new ChromeDriver();
				
		//enter the url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
		//maximize the window
		driver.manage().window().maximize();
				
		//wait for 2 sec
		Thread.sleep(2000);
		
		//find the logo element
		WebElement logo=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]"));
		
		//check if logo is displayed or not
		boolean t7=logo.isDisplayed();
		
		//display the boolean value of t7 
		System.out.println(t7);
		
	}
}



