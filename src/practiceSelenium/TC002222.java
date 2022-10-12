package practiceSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
public class TC002222 {
	public static void main(String args[]) throws Exception
	{
	System.setProperty("webdriver.gecko.driver",
	        "D:\\gecko");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(3000);
	System.out.println("Application Opened");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	System.out.println("Login completed");
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	System.out.println("Logout completed");
	driver.close();

	}
	
}
