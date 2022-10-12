package practiceSelenium;

import java.awt.Window;
import java.sql.Driver;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandler 
{
	public static void main (String arg[]) throws Exception
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("‪D:\\multiplewindows.html");
		Thread.sleep(3000);
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("btn2")).clear();
		ArrayList<String>windinfo = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windinfo.get(0));
		driver.quit();
		}
	}


