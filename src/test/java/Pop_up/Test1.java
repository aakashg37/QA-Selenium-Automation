package Pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	//How to Handle Alert Pop-up
	//Click Ok, when alert comes
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Thread.sleep(2000);
		
		//switch focus to Alert from  main page
		Alert alt=driver.switchTo().alert();
		
		alt.accept();
		
		Thread.sleep(2000);
		
		WebElement result=driver.findElement(By.cssSelector("#result"));
		
		String alertText=result.getText();
		
		System.out.println(alertText);
		
		driver.quit();
	}
	
}


