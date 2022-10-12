package practiceSelenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class link {

	public static void main(String[] args)throws Exception
	{
		    //System.setProperty("webdriver.gecko.driver", "F:\\Suresh_Selenium\\Drivers\\geckodriver.exe");
		    WebDriver driver = new FirefoxDriver();
		    driver.navigate().to("https://www.google.com");
		    Thread.sleep(3000);
		    List<WebElement> links = driver.findElements(By.tagName("a"));
		    for(WebElement val:links) {
		    System.out.println(val.getText());    
		    Thread.sleep(3000);
		    }
		    driver.close();
		

	}

}
