package ihg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest extends IHGJoinPageTest{
@Test()
	public void hari() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
		
	
		WebElement text = driver.findElement(By.tagName("input"));
        text.sendKeys("RAMARAO");
        //driver.findElement(By.linkText("This is a elephant")).click();
        driver.findElement(By.partialLinkText("This is a")).click();
	}


}
