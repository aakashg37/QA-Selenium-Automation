package IFrame_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver = new ChromeDriver();
		
		//enter the url
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe");
		
		//switch focus to the iframe
		driver.switchTo().frame("iframeResult");
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//identify the element and store it in the object
		WebElement pTag=driver.findElement(By.tagName("p"));
		
		
		//get the Text and print in the console
		System.out.println("Text in the Iframe is :"+pTag.getText());
		
		
		//quit the browser
		driver.quit();
	}
	
	
}
