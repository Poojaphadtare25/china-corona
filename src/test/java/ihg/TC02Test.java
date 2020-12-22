package ihg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC02Test {
	@Test(groups= {"regression"})
public void login()
{
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.testandquiz.com/selenium/testing.html");
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
}
}
