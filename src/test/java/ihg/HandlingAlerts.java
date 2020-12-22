package ihg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingAlerts {
@Test
public void rama()
{
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");	
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.testandquiz.com/selenium/testing.html");
driver.manage().window().maximize();
driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
Alert a=driver.switchTo().alert();
a.accept();
driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();
a.dismiss();
}
}
