package Pop_up_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#name")).sendKeys("Virat Kohli");
		
		Thread.sleep(1000);
		
		//Identify the confirm element and click on it
		driver.findElement(By.cssSelector("#confirmbtn")).click();
		
		Thread.sleep(1000);
		
		//switch focus to alert from main page
		Alert alt=driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		//alt.accept();
		alt.dismiss();
		
		Thread.sleep(1000);
		
		driver.quit();
		
	}

}
