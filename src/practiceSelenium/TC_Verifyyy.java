package practiceSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
public class TC_Verifyyy {
	static    String  url             = "http://183.82.103.245/nareshit/login.php&quot";
			static    String username = "nareshit";
			static    String password = "nareshit";
			static    String title1   = "OrangeHRM - New Level of HR Management";
			static    String title2   = "OrangeHRM";
			public static void main(String args[]) throws Exception{
			    //Test Steps
	//		System.setProperty("webdriver.gecko.driver", "F:\\Suresh_Selenium\\Drivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.navigate().to(url);
			//Verify Page title
			//Actual Result    compare exp.result
			if(driver.getTitle().equals("title1")) {
			System.out.println("Title matched");    
			}
			else {
			System.out.println("Title not matched");    
			System.out.println(driver.getTitle());
			}
			driver.findElement(By.name("txtUserName")).sendKeys(username);
			driver.findElement(By.name("txtPassword")).sendKeys(password);
			Thread.sleep(3000);
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(3000);
			System.out.println("Login completed");
			//Verify Title
			if(driver.getTitle().equals("title2")) {
			System.out.println("Title matched");    
			}
			else {
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());
			}
			//mouseover
			Actions ac = new Actions(driver);
			ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
			Thread.sleep(4000);
			System.out.println("Mouseover completed");
			driver.findElement(By.linkText("Add Employee")).click();
			Thread.sleep(4000);
			System.out.println("Clicked on Submenu");
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("Logout completed");
			driver.close();

			}
			}

