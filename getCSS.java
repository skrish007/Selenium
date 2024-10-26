package Testing;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericPackage.Launch;

public class getCSS {
public static void main(String[] args) throws InterruptedException {
	//Launch chrome
	ChromeDriver driver = Launch.chrome();
	//send url
	
	driver.get("https://www.irctc.co.in/nget/train-search");
	//get adddress of button
	Thread.sleep(2000);
	WebElement searchBtn = driver.findElement(By.xpath("//button[.='Search']"));
	Thread.sleep(2000);
	
	// get css value and print it
	System.out.println("Using getCssValue() Method");
	System.out.println("-------------------------");
	String colour = searchBtn.getCssValue("border-color");
	
	System.out.println(colour);
	
	System.out.println("Using getSize() Method");
	System.out.println("-------------------------");
	//getSize() has 2 sub methods - getWidth() and getHeight();
	int h = searchBtn.getSize().getHeight();
	System.out.println("Height :"+h);
	int w = searchBtn.getSize().getWidth();
	System.out.println("Width :"+w);
	
	System.out.println("-------------------------");
	
	System.out.println("Using getLocation() Method");
	System.out.println("-------------------------");
	
	//getLocation()- to get loc of element. has 2 submethods - getX() and getY();
	int x = searchBtn.getLocation().getX();
	int y = searchBtn.getLocation().getY();
	System.out.println("X-axis:"+x +" Y-axis:"+y);
	

	System.out.println("-------------------------");
	//getRect() 
	//We can use Rect() to fetch both size and location. Eg, getRect().getWidth(); and getRect().getX();
	
	int h2 = searchBtn.getRect().getHeight();
	int w2 = searchBtn.getRect().getWidth();
	int x2 = searchBtn.getRect().getX();	
	int y2 = searchBtn.getRect().getY();
	System.out.println("Using getRect() Method");
	System.out.println("-------------------------");
	System.out.println("Height"+h2+ " Width:"+w +" X-axis:"+x2 + "Y-axis:"+y2);
	System.out.println("-------------------------");

	driver.close();
}


}
