package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Test6 {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/health-personal-care-appliances/personal-care-appliances/trimmers/~cs-fcd986f0a357ac4dbc7f91b70631e4b1/pr?sid=zlw%2C79s%2Cby3&marketplace=FLIPKART&restrictLocale=true&BU=Mixed");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//WebElement fullPage=driver.findElement(By.cssSelector("div#container"));
		
		File source=driver.getFullPageScreenshotAs(OutputType.FILE);
	
		File destination=new File("D:\\21stMarchFSST\\Screenshot\\Test6.png");
		
		Files.copy(source, destination);
		
		driver.quit();
		
	}
}
