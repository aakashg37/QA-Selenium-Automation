package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {
	//switch to frame(by using WebElement)
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
		//wait for 2 sec
		Thread.sleep(2000);
		
		//switch by using webelement
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		
		//identify the element and click on it
		driver.findElement(By.xpath("//button[@type='button']")).click();
				
	}
	
	
}
