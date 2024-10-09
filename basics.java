package Testing;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class basics {


 public static void main(String[] args) throws InterruptedException {
  System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
  ChromeDriver driver = new ChromeDriver();
  
  driver.get("https://www.meesho.com/");
  Thread.sleep(3000); // wait for 3 secs
  driver.manage().window().maximize(); //maximize
  Thread.sleep(3000); 
  Dimension d = new Dimension(400, 500); // Height and Width
  driver.manage().window().setSize(d);
  Thread.sleep(3000);
  Point p = new Point(100, 100); // Move points x and Y axis
  driver.manage().window().setPosition(p);
  Thread.sleep(200);
  Point p1 = new Point(200, 400);
  driver.manage().window().setPosition(p1);
  Thread.sleep(200);
  Point p2 = new Point(300, 600);
  driver.manage().window().setPosition(p2);
  Thread.sleep(200);
  Point p3 = new Point(100, 200);
  driver.manage().window().setPosition(p3);
  Thread.sleep(200);
  Point p4 = new Point(400, 500);
  driver.manage().window().setPosition(p4);
  Thread.sleep(200);
  driver.manage().deleteAllCookies();  // Clear Cookies
  driver.close();
 }
}