package testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AsserAndSoftAssert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		String name1=driver.getTitle();
		String name2="OrangeHRM1";
		//Assert.assertEquals(name2, name1);
		SoftAssert s=new SoftAssert();
		s.assertEquals(name2, name1);
		System.out.println("hello bro");
		System.out.println("hello bro");
		System.out.println("hello bro");
		System.out.println("hello bro");
		System.out.println("hello bro");
		System.out.println("hello bro");
		
		
		
	}

}
