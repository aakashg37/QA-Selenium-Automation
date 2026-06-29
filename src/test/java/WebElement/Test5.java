package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Identify an element
		WebElement s1=driver.findElement(By.xpath("//a[text()='Data Entry Form']"));
		
		//get the String from identified WebElement using getText()
		String text=s1.getText();
		
		//print the text into console
		System.out.println(text);
		
		//quit the browser
		driver.quit();
	}
	
}





