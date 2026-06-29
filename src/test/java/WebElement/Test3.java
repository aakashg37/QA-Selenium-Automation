package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {	
	
	public static void main(String[] args) {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//get the text of webpage using getText() present in WebElement(I)
		String text=driver.findElement(By.xpath("//a[text()='Data Entry Form']")).getText();
		
		System.out.println(text);
	}

}
