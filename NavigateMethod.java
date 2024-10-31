package Testing;

import org.openqa.selenium.chrome.ChromeDriver;

import genericPackage.Launch;

public class NavigateMethod {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = Launch.chrome();
	// get url by using navigate
	driver.navigate().to("https://www.skyscanner.co.in/");
	Thread.sleep(2000);
	//move to next url
	driver.navigate().to("https://www.fiverr.com/");
	Thread.sleep(2000);
	driver.navigate().to("https://www.linkedin.com/feed/");
	Thread.sleep(2000);
	driver.navigate().to("https://www.google.com/maps");
	Thread.sleep(2000);
	//backwards
	//forwards
	//refresh site
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	
	//close driver
	driver.close();
}
}
