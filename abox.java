package alertAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericPackage.Launch;

public class abox {
public static void main(String[] args) throws InterruptedException {
	//launch chrome
	ChromeDriver driver = Launch.chrome();
	//url
	driver.get("https://demoapps.qspiders.com/ui");
	Thread.sleep(3000);
	

	//click on popup
	driver.findElement(By.xpath("//section[.='Popups']")).click();
	Thread.sleep(3000);
	//click on javascript
	
	driver.findElement(By.xpath("//section[.='Javascript']")).click();
	Thread.sleep(3000);
	
	//click on default
		driver.findElement(By.linkText("Default Alert")).click();
		Thread.sleep(3000);
		//on alert box
		driver.findElement(By.id("buttonAlert2")).click();
		Alert a3 = driver.switchTo().alert();
		System.out.println(a3.getText());
		
		a3.accept();
		Thread.sleep(3000);
		
	
	//click on confirm
		driver.findElement(By.linkText("Confirm")).click();
		Thread.sleep(3000);
		//on alert box 
		driver.findElement(By.id("buttonAlert5")).click();
		Alert a2 = driver.switchTo().alert();
		Thread.sleep(2000);
		a2.dismiss();
		
		
		Thread.sleep(3000);
		
	//click on prompt
	driver.findElement(By.linkText("Prompt")).click();
	Thread.sleep(3000);
	//on alert box enter input
	driver.findElement(By.id("buttonAlert1")).click();
	Alert al = driver.switchTo().alert();
	System.out.println(al.getText());
	al.sendKeys("yes");
	al.accept();
	Thread.sleep(3000);
	
	

}
}
