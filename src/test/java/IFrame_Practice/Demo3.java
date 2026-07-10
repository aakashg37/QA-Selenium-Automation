package IFrame_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser : Chrome
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		//switch the focus to iframe
		driver.switchTo().frame("mce_0_ifr");
		
		//wait for 2 sec
		Thread.sleep(1000);
		
		//identfy the element and store it in the object
		WebElement ptag=driver.findElement(By.tagName("p"));
		
		//get the text of the identified element
		System.out.println("Text in the iframe is :"+ptag.getText());
		
		driver.quit();
	}
	
	
}
