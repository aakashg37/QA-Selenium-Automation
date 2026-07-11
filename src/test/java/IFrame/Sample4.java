package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 {
	//switch to frame(by using frameIndex)
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//switch to frame (by index)
		driver.switchTo().frame(0);
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//identify the element and click on it
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//wait for 2 sec
		Thread.sleep(1000);
		
		//close the browser
		driver.quit();
		
	}

}
