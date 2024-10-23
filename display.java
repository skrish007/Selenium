package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class display {
public static void main(String[] args) throws InterruptedException {
	//displayed, selected, enabled
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	// url
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/r.php");
	Thread.sleep(3000);
	//get address of gender
	WebElement gender = driver.findElement(By.xpath("//label[.='Female']"));
	gender.click();
	Thread.sleep(3000);

	if(gender.isDisplayed())
	{
		System.out.println("Gender is displayed");
	}
	else
	{
		System.out.println("Gender is not displayed");
	
	}
	Thread.sleep(3000);
	

	//close driver
	
	driver.close();
}
}
