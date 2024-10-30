package Robo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import genericPackage.Launch;

public class OpenNewTab {
public static void main(String[] args) throws AWTException, InterruptedException {
	//launch chrome
	ChromeDriver driver = Launch.chrome();
	// get url
	driver.get("https://google.co.in");
	Thread.sleep(2000);
	// get linktext of malayalam and fetch address

	WebElement mal = driver.findElement(By.linkText("മലയാളം"));
	Thread.sleep(2000);
	Actions act = new Actions(driver);
	//use right-click
	//act.contextClick(mal).perform();
	//Thread.sleep(2000);
	//create obj for robot class
	Robot rb = new Robot();
	
	
	// ------------------------------------------
	// Keys ethra thavana work cheyyanamennu nokkan Ivide loop start cheyyuka
	
	for(int i = 0;i<5;i++)
	{
		act.contextClick(mal).perform();
		Thread.sleep(2000);

	//press key
	rb.keyPress(KeyEvent.VK_T);
	
	//release key
	
	rb.keyRelease(KeyEvent.VK_T);
	Thread.sleep(2000);
	}
	
	
}
}

