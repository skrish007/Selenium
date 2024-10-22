package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericPackage.Launch;

public class CopyPaste {

public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = Launch.chrome();
	Thread.sleep(3000);
	//send url
driver.get("https://demoapps.qspiders.com/ui");
Thread.sleep(3000);
	//get address of text field
	WebElement nameField = driver.findElement(By.xpath("//input[@id='name']"));
	Thread.sleep(3000);
	nameField.click();
	nameField.sendKeys("Abracadabra");
	Thread.sleep(3000);
	//a for select all and c for copy
	Thread.sleep(3000);
	nameField.sendKeys(Keys.CONTROL+"ac");
	driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"v");

	Thread.sleep(3000);
	
	driver.close();
}

}
