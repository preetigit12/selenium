package practiceSelenium;

import org.openqa.selenium.WebDriver;

	
	import org.openqa.selenium.chrome.ChromeDriver;
	
	import org.openqa.selenium.By;

	public class TC001_Login_Logout {
	public static void main(String args[]) throws Exception{
	   
	System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver_win32\\chromedriver.exe");
	       
	WebDriver driver = new ChromeDriver();
	
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");

	Thread.sleep(3000);//wait for some time
	driver.close();
	}
	}

