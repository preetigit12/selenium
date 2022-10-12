package practiceSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;
import org.openqa.selenium.support.ui.Select;

public class Dropdownvalue {

	public static void main(String[] args)throws Exception 
	{

    //System.setProperty("webdriver.gecko.driver", "F:\\Suresh_Selenium\\Drivers\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.navigate().to("http://183.82.103.245/nareshit/login.php");
    System.out.println(driver.getTitle());
    driver.findElement(By.name("txtUsername")).sendKeys("nareshit");
    driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
    driver.findElement(By.name("Submit")).click();
    Thread.sleep(3000);
    System.out.println("Login completed");
    //Enter into frame
    driver.switchTo().frame("rightMenu");
    //  Search By - Dropdown
    Select st= new Select(driver.findElement(By.name("loc_code")));
    List<WebElement> dropval = st.getOptions();
    for(WebElement val:dropval) {
        System.out.println(val.getText());
        Thread.sleep(3000);
    }
   driver.switchTo().defaultContent();
    driver.findElement(By.linkText("Logout")).click();
    driver.close();
}
}


