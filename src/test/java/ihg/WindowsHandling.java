package ihg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	ChromeDriver  driver=new ChromeDriver();
	driver.get("https://www.ihg.com/rewardsclub/gb/en/enrollment/join");
	driver.manage().window().maximize();
	Assert.assertTrue(true, driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	String parent=driver.getWindowHandle();
	System.out.println(parent);
	Thread.sleep(30000);
	JavascriptExecutor js=driver;
	Assert.assertFalse(isElementPresent(By.xpath("(//a[@class='pEight'])[3]")));
	WebElement link = driver.findElement(By.xpath("(//a[@class='pEight'])[3]"));
	js.executeScript("arguments[0].click();", link);
	Set<String> allWindows = driver.getWindowHandles();
	System.out.println(allWindows.size());
	Iterator<String> i=allWindows.iterator();
	while(i.hasNext())
	{
		String child=i.next();
		if(!parent.equals(child))
		{
		driver.switchTo().window(child)	;
		}
	}
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.switchTo().window(parent);
	System.out.println(driver.getTitle());
	
		
	
	}

	private static boolean isElementPresent(By cssSelector) {
		// TODO Auto-generated method stub
		return false;
	}

}
