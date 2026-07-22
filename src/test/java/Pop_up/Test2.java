package Pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	//How to Handle Alert Pop-up
	//Click Cancel, when alert comes
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Thread.sleep(2000);
		
		Alert alt=driver.switchTo().alert();
		
		alt.dismiss();
		
		Thread.sleep(2000);
		
		WebElement  alertText=driver.findElement(By.cssSelector("#result"));
		
		System.out.println(alertText.getText());
		
		driver.quit();
	}
}








