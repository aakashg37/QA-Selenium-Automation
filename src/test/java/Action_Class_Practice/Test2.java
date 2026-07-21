package Action_Class_Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Test2 {
	//Hover the mouse over Account&Lists and take screenshot of it
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement hoverElement=driver.findElement(By.cssSelector("#nav-link-accountList"));
		
		Actions action=new Actions(driver);
		
		Thread.sleep(2000);
		
		action.moveToElement(hoverElement).perform();
		
		takeScreenshot(driver);
		
		Thread.sleep(2000);
		
		driver.quit();
	}
	
	public static void takeScreenshot(WebDriver driver) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		System.out.println(source);
		
		File destination=new File("D:\\21stMarchFSST\\Screenshot\\Test2.png");
		
		Files.copy(source, destination);
		
	}
	
	
}
