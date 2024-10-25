package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericPackage.Launch;

public class checkbox {
	public static void main(String[] args) throws InterruptedException {
		//launch chrome
		
		ChromeDriver driver = Launch.chrome();
		driver.navigate().to("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		//checkbox page
		driver.findElement(By.linkText("Check Box")).click();
		Thread.sleep(2000);
		
		
		//fetch all checkbox address
		List<WebElement> allChecks = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		
		Thread.sleep(2000);
		//use for each
		for (WebElement CheckBox:allChecks)
		{
			System.out.println(CheckBox);
			CheckBox.click();
			Thread.sleep(200);
			
		}
		Thread.sleep(2000);
		driver.close();
		
	}

}
