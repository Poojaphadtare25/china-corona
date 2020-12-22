package snap;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MultipleSnpas {
static ChromeDriver  driver;
static int a=0;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	 driver=new ChromeDriver();
	 MultipleSnpas ms=new MultipleSnpas();
		driver.get("https://www.ihg.com/rewardsclub/gb/en/enrollment/join");
		driver.manage().window().maximize();
		ms.snap();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		ms.snap();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(30000);
		JavascriptExecutor js=driver;
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
		ms.snap();
		driver.switchTo().window(parent);
		ms.snap();
		System.out.println(driver.getTitle());
		
	}
	public void snap() throws IOException
	{
		Random r=new Random();
		System.out.println(r.nextInt());
		if(r.nextInt()!=0)
		{
		a=a+1;	
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest=new File(".//pics//img"+a+".png");
		FileUtils.copyFile(src, dest);
		}
	}
	
	

}
