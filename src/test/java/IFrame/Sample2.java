package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	//switch to frame(by using frameID)
	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//by using frame id
		driver.switchTo().frame("iframeResult");
		
		//identify the element
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
				
		
	}
	
}
