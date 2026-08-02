package Parameterization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//Identify the username,password and loginButton field and store it
		//WebElement userNameInput=driver.findElement(By.cssSelector("#user-name"));
		//WebElement passwordInput=driver.findElement(By.cssSelector("#password"));
		//WebElement loginBtn=driver.findElement(By.cssSelector("#login-button"));
		
		//
		Thread.sleep(2000);
		
		//extract the username from excel sheet
		FileInputStream file=new FileInputStream("D:\\21stMarchFSST\\Parameterization.xlsx");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("Demo");
		
		int lastRowIndex=sh.getLastRowNum();
		String password=sh.getRow(0).getCell(1).getStringCellValue();
		
		//Thread.sleep(2000);
		
		for(int i=0; i<=lastRowIndex; i++) {
			
			String username=sh.getRow(i).getCell(0).getStringCellValue();					
			
			Thread.sleep(2000);
			
			//enter username and paswsword, fetched using the excel sheet
			//userNameInput.sendKeys(username);		
			driver.findElement(By.cssSelector("#user-name")).sendKeys(username);
			System.out.print("username while logging -> "+ username);
			
			Thread.sleep(2000);			
			
			//passwordInput.sendKeys(password);
			driver.findElement(By.cssSelector("#password")).sendKeys(password);
			System.out.println(" : password entered ->");
			
			Thread.sleep(2000);	
			
			//take Screenshot of Login Page with username
			loginPageScreenshot(driver,username);
			
			Thread.sleep(2000);			
			
			//now login into account
			//loginBtn.click();
			driver.findElement(By.cssSelector("#login-button")).click();
			Thread.sleep(2000);			
			System.out.println("user -> "+username+", logged in ! ");
			
			
			//Identify the Menu button and click on it
			driver.findElement(By.cssSelector("#react-burger-menu-btn")).click();
			
			Thread.sleep(2000);
			
			//Click on the Logout Button
			driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
			
			//Thread.sleep(2000);
			System.out.println("user -> "+ username+", logged out ! ");
			System.out.println("---------------------------------------------");
		}
						
		//Thread.sleep(2000);
		//switch focus to Alert from  main page
		//Alert alt=driver.switchTo().alert();
		//alt.accept();
				
		//Thread.sleep(2000);
		//driver.close();
	}
	
	public static void loginPageScreenshot(WebDriver driver,String uname) throws IOException {
		
		TakesScreenshot scrt=(TakesScreenshot)driver;
		
		File source=scrt.getScreenshotAs(OutputType.FILE);
		
		File destination=new File("D:\\21stMarchFSST\\Screenshot\\"+uname+".png");
		
		Files.copy(source, destination);
		
		System.out.println("Screenshot taken for "+uname+" successfully !");
	}
	
}





