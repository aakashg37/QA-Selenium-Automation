package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#login-button")).click();
		
		TakesScreenshot	ts =(TakesScreenshot) driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		System.out.println(source);
		
		File destination=new File("D:\\21stMarchFSST\\Screenshot\\Demo2.png");
		
		Files.copy(source, destination);
		
		Thread.sleep(1000);
		
		driver.quit();
		
	}
	
	
}
