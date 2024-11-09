package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericPackage.Launch;

public class MultipleSelectFiles {
public static void main(String[] args) throws InterruptedException, AWTException {
	ChromeDriver driver = Launch.chrome();
	driver.get("https://demoapps.qspiders.com/ui");
	Thread.sleep(3000);
	//click on popup
		driver.findElement(By.xpath("//section[.='Popups']")).click();
		Thread.sleep(3000);
		//click on file uploads
		
		driver.findElement(By.xpath("//section[.='File Uploads']")).click();
		Thread.sleep(3000);
		
		//click on MultipleSelect
			driver.findElement(By.linkText("Multiple select")).click();
			Thread.sleep(3000);
			
			// click on upload file
			WebElement uploadBtn = driver.findElement(By.id("fileInput"));
			
			Thread.sleep(3000);
			uploadBtn.sendKeys("C:\\Users\\s4shy\\Documents\\Bill.class");
			Thread.sleep(2000);
			uploadBtn.sendKeys("C:\\Users\\s4shy\\Documents\\ff.pdf");

}
}
			
