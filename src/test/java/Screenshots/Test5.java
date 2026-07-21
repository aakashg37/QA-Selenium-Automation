package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Test5 {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/health-personal-care-appliances/personal-care-appliances/trimmers/~cs-fcd986f0a357ac4dbc7f91b70631e4b1/pr?sid=zlw%2C79s%2Cby3&marketplace=FLIPKART&restrictLocale=true&BU=Mixed");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement element=driver.findElement(By.xpath("(//div[@data-id='TMRHNVGFNJGEH5QQ'])[1]"));
		
		File source=element.getScreenshotAs(OutputType.FILE);
		
		System.out.println(source);
		
		File destination=new File("D:\\21stMarchFSST\\Screenshot\\Test5.png");
		
		Files.copy(source, destination);
	
		driver.quit();
	}
}
