package ihg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter {
@Test
@Parameters({"Username","password"})
	public void ajay(String name,String pwd)
	{
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	WebElement user = driver.findElement(By.id("txtUsername"));
	user.sendKeys(name);
	WebElement pass = driver.findElement(By.id("txtPassword"));
	pass.sendKeys(pwd);
	}
}
