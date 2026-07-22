package Pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	//How to Handle Alert Pop-up
	//Print the text mentioned on the alert
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Alert alt=driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		System.out.println(alt.getText());
		
		driver.quit();
	}
}
