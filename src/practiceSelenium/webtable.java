package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args)throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\WebTable.html");
int row =driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();
int col=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size();
int rowcol=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();
System.out.println(row);
System.out.println(col);
System.out.println(rowcol);
String str =driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[4]/td[2]")).getText();
System.out.println(str);
for(int i=1;i<=row;i++)
{
String tbldata =driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
System.out.println(tbldata);
	}
	}
}