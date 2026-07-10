package IFrame_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		
		//switch focus to iframe
		driver.switchTo().frame("frame1");
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//identify the element and store it in object
		WebElement heading=driver.findElement(By.cssSelector("h1#sampleHeading"));
		
		//get the text of the heading and print in the console
		System.out.println("Iframe Heading text is : "+heading.getText());
		
		
	}
}
