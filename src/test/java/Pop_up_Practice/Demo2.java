package Pop_up_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.testmuai.com/selenium-playground/javascript-alert-box-demo/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[text()='Click Me'])[3]")).click();
		
		Alert alt=driver.switchTo().alert();
		
		Thread.sleep(1000);
		
		alt.sendKeys("Virat Kohli");
		alt.accept();

		
		Thread.sleep(2000);
		
		String text=driver.findElement(By.cssSelector("#prompt-demo")).getText();
		
		System.out.println(text);
		
		driver.quit();
	}

}
