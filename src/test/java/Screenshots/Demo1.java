package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		
		//identify the element
		WebElement loginBtn=driver.findElement(By.cssSelector(".button-orange"));
		
		File source=loginBtn.getScreenshotAs(OutputType.FILE);	//path
		
		System.out.println(source);
		
		File destination=new File("D:\\21stMarchFSST\\Screenshot\\Demo1.png");
		
		Files.copy(source,destination);
		
		driver.quit();
	}
}




