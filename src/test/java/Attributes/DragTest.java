package Attributes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DragTest {
	@Test()
public void apple()
{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();	
}
}
