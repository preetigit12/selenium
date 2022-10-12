package practiceSelenium;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TC_WindHand {
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.gecko.driver", "F:\\Suresh_Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//1st wind
		driver.get("file:///F:/Suresh_Selenium/HtmlFiles/multiplewindows.html");
		Thread.sleep(3000);
		//2nd wind
		driver.findElement(By.id("btn2")).click();
		Thread.sleep(3000);
		//3rd wind
		driver.findElement(By.id("btn3")).click();
		Thread.sleep(3000);
		ArrayList<String> windowinfo = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windowinfo.get(0));
		Thread.sleep(3000);
		//driver.close();//to close current browser
		driver.quit(); //to close all browsers opened by webdriver instance

		}
		
}
