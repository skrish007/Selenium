package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selected {
public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// url
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/checkbox?sublist=0");
		Thread.sleep(3000);
		//get address of checkbox
		WebElement cb = driver.findElement(By.xpath("//input[@id='domain2']"));
		cb.click();
		Thread.sleep(3000);

		if(cb.isSelected())
		{
			System.out.println("Whatsapp is selected");
		}
		else
		{
			System.out.println("Whatsapp is not selected");
		
		}
		Thread.sleep(3000);
		

		//close driver
		
		driver.close();
}
}
