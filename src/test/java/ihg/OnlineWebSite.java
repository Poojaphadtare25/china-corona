package ihg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OnlineWebSite {
	@Test
public void aryal()
{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		Actions a=new Actions(driver);
		//a.moveToElement(driver.findElement(By.xpath("//span[text()='Account & Lists']"))).moveToElement(driver.findElement(By.xpath("//span[text()='Create a List']"))).click().build().perform();
		WebElement take = driver.findElement(By.xpath("//span[text()='Take the Home Style Quiz']"));
		a.moveToElement(driver.findElement(By.xpath("//span[text()='Account & Lists']"))).moveToElement(take).click().build().perform();
}
}
