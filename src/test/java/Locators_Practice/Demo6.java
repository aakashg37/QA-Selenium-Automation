package Locators_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//ener the url
		driver.get("https://demoqa.com/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//navigate to elements webpage
		driver.navigate().to("https://demoqa.com/elements");
		
		Thread.sleep(2000);
		
		//click on tex-box
		driver.findElement(By.xpath("//a[@href='/text-box']")).click();
		
		Thread.sleep(2000);
		
		//enter input in userName
		driver.findElement(By.cssSelector("input#userName")).sendKeys("Virat Kohli");
		
		//driver.navigate().back();
		Thread.sleep(2000);
		
		//click on the check box
		driver.findElement(By.xpath("//a[@href='/checkbox']")).click();
		
		Thread.sleep(2000);
		
		//click on home check box
		driver.findElement(By.cssSelector("span.rc-tree-checkbox")).click();
		
		Thread.sleep(2000);
		
		//click on radio button
		driver.findElement(By.xpath("//a[@href='/radio-button']")).click();
		
		Thread.sleep(1000);
		
		//click on impressive option
		driver.findElement(By.cssSelector("input#impressiveRadio")).click();
		Thread.sleep(1000);
		
		//click on webtables
		driver.findElement(By.xpath("//a[@href='/webtables']")).click();
		Thread.sleep(1000);
		
		//click on buttons
		driver.findElement(By.xpath("//a[@href='/buttons']")).click();
		Thread.sleep(1000);
		
		//click on links
		driver.findElement(By.xpath("//a[@href='/links']")).click();
		Thread.sleep(1000);
		
		//click on broken links	::not clickable error
		//driver.findElement(By.xpath("//a[@href='/broken']")).click();
		
		//click on upload and download	::not clickable error
		//driver.findElement(By.xpath("//a[@href='/upload-download']")).click();		
		//driver.findElement(By.cssSelector("a[href='/upload-download']")).click();
		
		//collapse the elements tab	::not showing (bcoz it does not go to new link, ao we need to click on the inner tab of forms to go on that)
		//driver.findElement(By.xpath("//div[contains(@class,'element-list accordion-collapse collapse show')]")).click();
		//driver.findElement(By.xpath("(//div[contains(@class,'element-list accordion-collapse collapse')])[1]")).click();
	
		//navigate to form-->using this also we can do ::working
		driver.navigate().to("https://demoqa.com/forms");
	
		//driver.findElement(By.xpath("//a[@href='/automation-practice-form']")).click();
		//driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
	
	}
	

}














