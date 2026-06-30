package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {
	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//find login element
		WebElement loginButton=driver.findElement(By.xpath("//button[text()=' Login ']"));
		
		//check if Login button is enabled
		boolean t6=loginButton.isEnabled();
		
		System.out.println(t6);
		
	}
}
