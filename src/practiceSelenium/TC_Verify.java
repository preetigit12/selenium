package practiceSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
public class TC_Verify {
	public static void main(String args[]) throws Exception{
	    //Test Steps
	System.setProperty("webdriver.gecko.driver", "F:\\Suresh_Selenium\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("");
	//Verify Page title
	//Actual Result    compare exp.result
	if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
	System.out.println("Title matched");    
	}
	else {
	System.out.println("Title not matched");    
	System.out.println(driver.getTitle());
	}
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	System.out.println("Login completed");
	//Verify Title
	if(driver.getTitle().equals("OrangeHRM")) {
	System.out.println("Title matched");    
	}
	else {
	System.out.println("Title not matched");
	System.out.println(driver.getTitle());
	}
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout completed");
	driver.close();
	}

}
