package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkbox {

	public static void main(String[] args) throws Exception
	{
		    //System.setProperty("webdriver.gecko.driver", "F:\\Suresh_Selenium\\Drivers\\geckodriver.exe");
		    WebDriver driver=new FirefoxDriver();
		    driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		    System.out.println(driver.getTitle());
		    driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		    driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		    driver.findElement(By.name("Submit")).click();
		    Thread.sleep(3000);
		    System.out.println("Login completed");
		    //Enter into frame
		    driver.switchTo().frame("rightMenu");
		    //  DT Var VV
		    for(int i=1; i<=10; i=i+2)
		    {
		    driver.findElement(By.xpath("//*[@id='standardView']/table/tbody/tr["+i+"]/td[1]/input")).click();
		    	Thread.sleep(2000);
		   System.out.println("clicked on checkbox of " + i);
		    }
		    driver.switchTo().defaultContent();
		    driver.findElement(By.linkText("Logout")).click();
		    driver.close();
	}
}


