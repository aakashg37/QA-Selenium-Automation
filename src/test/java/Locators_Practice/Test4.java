package Locators_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser: Chrome
		WebDriver driver=new ChromeDriver();
		
		
		//enter the url
		driver.get("https://www.air.irctc.co.in/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//TASK--> input into origin
		driver.findElement(By.xpath("//input[@id='stationFrom']")).sendKeys("Pune");
		
		//TASK--> input into destination
		driver.findElement(By.cssSelector("input#stationTo")).sendKeys("Bangalore");
		
		//TASK--> Select the origin date
		driver.findElement(By.cssSelector("input#originDate")).click();
		
		//select the date
		driver.findElement(By.xpath("//span[text()=\" 28\"]")).click();
		
		//TASK--> Select the return date
		driver.findElement(By.cssSelector("input#returnDate")).click();
		
		//select the return date
		driver.findElement(By.xpath("(//span[text()=' 29'])[2]")).click();
		
		//TASK--> Select the travellers 
		driver.findElement(By.cssSelector("input#noOfpaxEtc")).click();
		
		//TASK--> Add the traveller
		driver.findElement(By.xpath("(//a[@class='font-14'])[2]")).click();
		
		//wait for 3 sec
		Thread.sleep(2000);
		
		//TASK--> click on the search button
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-md yellow-gradient ')]")).click();
		
		Thread.sleep(1000);
		
		//close the pop-up
		driver.findElement(By.xpath("//button[@class='close white-text']")).click();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//TASK--> click on the login button
		driver.findElement(By.xpath("//a[@class='nav-link selectable']")).click();
		
		Thread.sleep(1000);
		
		//TASK--> enter userID into input field
		driver.findElement(By.cssSelector("input#loginuseridUser")).sendKeys("akash@123");
		
		//TASK--> enter the password into input field
		driver.findElement(By.xpath("(//input[@placeholder='Enter Password'])[1]")).sendKeys("aakash@123");
	
	
		//wait for 2 sec
		Thread.sleep(2000);
		
		//TASK--> hit the login button
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		//wait for 2sec
		Thread.sleep(2000);
		
		//TASK--> close the Login pop-up
		driver.findElement(By.xpath("(//button[@class='close btn btn-md btn-primary btn-radius yellow-gradient btn-shadow'])[4]")).click();
		
		
		//wait for 3 sec
		Thread.sleep(3000);
		
		driver.quit();
	}
}














