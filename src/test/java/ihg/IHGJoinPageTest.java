package ihg;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import snap.Images;

public class IHGJoinPageTest{
@Test()
	public void rama() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
WebDriverWait wait=new WebDriverWait(driver, 30);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
driver.findElement(By.id("firstName")).sendKeys("ramarao");
driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Derangulla");
File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File dest=new File("D:\\Softwares\\aryal1.png");
FileUtils.copyFile(src, dest);
	}

}
