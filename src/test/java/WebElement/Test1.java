package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	//APPROACH - I
	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//TASK-> enter the name in input
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Rohit Sharma");
		
		Thread.sleep(2000);
		
		//clear entered value
		driver.findElement(By.xpath("//input[@id='name']")).clear();
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input#name")).sendKeys("Virat Kohli");
		
		
	}
}





