package TestNGPractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Sample2 {

	WebDriver driver;
	
	@Test(priority=-1)
	public void launchChromeBrowser() {
		driver=new ChromeDriver();
		Reporter.log("Chrome browser launched",true);
	}
	
	@Test
	public void loginTest() {
		driver.get("https://kite.zerodha.com/");
		driver.findElement(By.cssSelector("#userid")).sendKeys("Virat K");
		driver.findElement(By.cssSelector("#password")).sendKeys("Virat@123");
		Reporter.log("Login Details entered",true);
	}
	
	
	@Test
	public void takeLoginScreenshotTest() throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		File destination=new File("D:\\21stMarchFSST\\Screenshot\\LoginZerodha1.png");
		
		Files.copy(source, destination);
		
		Reporter.log("Login Screen Screenshot taken successfully",true);
	}
	
	
}
