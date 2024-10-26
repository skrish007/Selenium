package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericPackage.Launch;

public class GetAttri {

public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = Launch.chrome();
	Thread.sleep(3000);
	//send url
driver.get("https://demoapps.qspiders.com/ui");
Thread.sleep(3000);
driver.findElement(By.xpath("//li[.='With ToolTip']")).click();
Thread.sleep(2000);
//get address of email field
WebElement emailField = driver.findElement(By.name("email"));
Thread.sleep(2000);
//fetch attribute
String title = emailField.getAttribute("title");

System.out.println(title);

	
	Thread.sleep(2000);
	
	driver.close();
}


}
