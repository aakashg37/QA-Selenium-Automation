package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Demo3 {
	//search with keyword in search bar and take screenshot of the autosuggestions on Amazon.in website
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement input=driver.findElement(By.xpath("//input[@name='field-keywords']"));
		
		input.sendKeys("Skybags");
		
		Thread.sleep(2000);
		
		takeScreenshot(driver);
		
		driver.quit();
	}
	
	public static void takeScreenshot(WebDriver driver) throws IOException{
		
		TakesScreenshot ts=(TakesScreenshot)driver;		
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		System.out.println(source);
		
		File destination=new File("D:\\21stMarchFSST\\Screenshot\\Test3.png");
		
		Files.copy(source, destination);
	}

}
