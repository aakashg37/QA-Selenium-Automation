package Locators_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test3 {
	
	//automating indeed website
	public static void main(String[] args) throws InterruptedException {
		
		
		//Launch the browser
		WebDriver driver=new EdgeDriver();
		
		//enter the url
		driver.navigate().to("https://in.indeed.com/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//enter the value in job input
		driver.findElement(By.cssSelector("input#text-input-what")).sendKeys("QA Automation");
		
		//enter the values in location input
		driver.findElement(By.cssSelector("input#text-input-where")).sendKeys("Bangalore");
		
		//wait for 3 sec
		Thread.sleep(2000);
		
		
		driver.findElement(By.cssSelector("input#text-input-where")).clear();
		
		//wait for 3 sec
		Thread.sleep(2000);
		
		
		driver.findElement(By.cssSelector("input#text-input-where")).sendKeys("Mumbai");
		
		
		//click on the find jobs button
		driver.findElement(By.cssSelector("button.yosegi-InlineWhatWhere-primaryButton")).click();
		
		waitAndNavigateBack(driver);
		
		//click on the Get Started button
		driver.findElement(By.cssSelector("button.css-1yxihf5")).click();
		
		waitAndNavigateBack(driver);
		
		//click on the sign-in button 
		driver.findElement(By.cssSelector("a[class='css-ubxxrl e71d0lh0']")).click();
		
		waitAndNavigateBack(driver);
		
		//click on companyReviews
		//driver.findElement(By.xpath("//a[@id='CompanyReviews']")).click();
		
		driver.findElement(By.cssSelector("a#CompanyReviews")).click();
		
		waitAndNavigateBack(driver);
		
		//click on salary guide
		driver.findElement(By.cssSelector("a#FindSalaries")).click();
		
		waitAndNavigateBack(driver);
		
		//click on the What's trending
		driver.findElement(By.cssSelector("button.css-yaskgp ")).click();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//click on the What's trending
		driver.findElement(By.cssSelector("button.css-1ltw9ze")).click();
				
		//wait for 2 sec
		Thread.sleep(2000);
		
		//click on the Employers Resource
		driver.findElement(By.cssSelector("button.mosaic-provider-linking-widget-zsj8eh")).click();
		
		
		//wait for 2 sec
		Thread.sleep(2000);
				
		//click on the Employers Resource
		driver.findElement(By.cssSelector("button.mosaic-provider-linking-widget-zsj8eh")).click();
		
		Thread.sleep(2000);
		
		//clcik on the employers tab
		driver.findElement(By.cssSelector("a#EmployersPostJob")).click();
		
		
		waitAndNavigateBack(driver);
		
		
		//click on the career advice on bottom
		driver.findElement(By.xpath("//a[text()='Career advice']")).click();
		
		waitAndNavigateBack(driver);
		
		driver.quit();
		
		//click on the hindi button
		//driver.findElement(By.cssSelector("a[class='css-1k2hae4 e19afand0']")).click();
		
		//wait for 3 sec
		//Thread.sleep(3000);
		
		//click on english button
		//driver.findElement(By.cssSelector("a.css-1k2hae4")).click();
		
		//driver.close();
	}
	
	
	
	public static void waitAndNavigateBack(WebDriver driver) throws InterruptedException {
		//wait for 1 sec
		Thread.sleep(3000);
		
		//navigate back to main page
		driver.navigate().back();
						
		//wait for 1 sec
		Thread.sleep(1000);
		
	}
	
	
}










