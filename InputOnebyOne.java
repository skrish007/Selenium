package Robo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import genericPackage.Launch;

public class InputOnebyOne {
public static void main(String[] args) throws AWTException, InterruptedException {
	ChromeDriver driver = Launch.chrome();
	//navigate url
	driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
	Thread.sleep(3000);
	//click on input field
	driver.findElement(By.name("handleInput")).click();
	Thread.sleep(2000);
	
	Robot rb = new Robot();
	
	//start pressing and releasing
	rb.keyPress(KeyEvent.VK_SHIFT);
	rb.keyPress(KeyEvent.VK_A);
	rb.keyRelease(KeyEvent.VK_A);
	rb.keyRelease(KeyEvent.VK_SHIFT);

	Thread.sleep(500);

	rb.keyPress(KeyEvent.VK_D);
	rb.keyRelease(KeyEvent.VK_D);
	
	Thread.sleep(500);
	
	rb.keyPress(KeyEvent.VK_M);
	rb.keyRelease(KeyEvent.VK_M);
	
	Thread.sleep(500);
	
	rb.keyPress(KeyEvent.VK_I);
	rb.keyRelease(KeyEvent.VK_I);
	
	Thread.sleep(500);
	
	
	rb.keyPress(KeyEvent.VK_N);
	rb.keyRelease(KeyEvent.VK_N);
	
	Thread.sleep(500);
	
	rb.keyPress(KeyEvent.VK_SHIFT);
	rb.keyPress(KeyEvent.VK_2);
	rb.keyRelease(KeyEvent.VK_2);
	rb.keyRelease(KeyEvent.VK_SHIFT);
	
	Thread.sleep(500);
	
	rb.keyPress(KeyEvent.VK_G);
	rb.keyRelease(KeyEvent.VK_G);
	
	Thread.sleep(500);
	
	rb.keyPress(KeyEvent.VK_M);
	rb.keyRelease(KeyEvent.VK_M);
	
	Thread.sleep(500);
	
	rb.keyPress(KeyEvent.VK_A);
	rb.keyRelease(KeyEvent.VK_A);
	
	Thread.sleep(500);
	
	rb.keyPress(KeyEvent.VK_I);
	rb.keyRelease(KeyEvent.VK_I);
	
	Thread.sleep(500);
	
	rb.keyPress(KeyEvent.VK_L);
	rb.keyRelease(KeyEvent.VK_L);
	
	Thread.sleep(500);
	
	rb.keyPress(KeyEvent.VK_PERIOD);
	rb.keyRelease(KeyEvent.VK_PERIOD);
	
	Thread.sleep(500);
	
	rb.keyPress(KeyEvent.VK_C);
	rb.keyRelease(KeyEvent.VK_C);
	
	Thread.sleep(500);
	
	rb.keyPress(KeyEvent.VK_O);
	rb.keyRelease(KeyEvent.VK_O);
	
	Thread.sleep(500);
	
	rb.keyPress(KeyEvent.VK_M);
	rb.keyRelease(KeyEvent.VK_M);
	
	Thread.sleep(2000);
	
	
}
}
