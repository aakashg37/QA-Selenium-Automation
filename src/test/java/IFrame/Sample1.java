package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	public static void main(String[] args) {
		
		//Launch the browser: Chrome
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		//maximize the screen
		driver.manage().window().maximize();
		
		//switch the focus to iframe by using name attribute value
		driver.switchTo().frame("SingleFrame");
		
		//identify the tab and click on it
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Virat Kohli");
		
		
		
	}
}





