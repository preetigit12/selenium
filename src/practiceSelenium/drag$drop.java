package practiceSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import static org.testng.Assert.assertEquals;
public class drag$drop {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		assertEquals(driver.getTitle(),"Droppable | jQuery UI");
		System.out.println("driver.getTitle()");
		driver.switchTo().frame(0);
		Actions ac= new Actions(driver);
		Thread.sleep(3000);
		ac.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).perform();
		
	
		System.out.println("DragandDrop");
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		driver.close();
}

}


