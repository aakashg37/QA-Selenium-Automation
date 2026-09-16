package FileuploadAndDownload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	
	public static void main(String[] args) throws AWTException {
				
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		
		//click on select pdf file button
		driver.findElement(By.id("pickfiles")).click();
		
		//createobject of StringSelection class and pass the file path to its constructor
		StringSelection filePath=new StringSelection("C:\\Users\\hp\\Downloads\\JD_ Java.pdf");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
		
		//create object of Robot class
		Robot robot=new Robot();
		robot.delay(2000);
		
		//press control+v to paste the file path
		robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		robot.keyPress(java.awt.event.KeyEvent.VK_V);
		
		robot.delay(2000);
		
		//release control+v
		robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
		robot.keyRelease(java.awt.event.KeyEvent.VK_V);
		
		//press enter key to upload the file
		robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
		
	}
}












