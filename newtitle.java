package Testing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class newtitle {

public static void main(String[] args) throws InterruptedException {
	System.out.println("hai");
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	ChromeDriver cdriver=new ChromeDriver();
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	FirefoxDriver fdriver=new FirefoxDriver();
	cdriver.get("https://www.google.co.in/");
	Thread.sleep(3000);
	String actualTitle="Google";
	String expectedTitle=cdriver.getTitle();
if(actualTitle.equals(expectedTitle))
{
	System.out.println("Success");
}
else
{
	System.out.println("Failure");
}
cdriver.quit();

	
}
}