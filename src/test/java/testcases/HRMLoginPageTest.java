package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import hrm.HRMLoginPage;

public class HRMLoginPageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		HRMLoginPage loginpage=new HRMLoginPage(driver);
		loginpage.eneterUsername().sendKeys("Admin");
		loginpage.eneterPassword().sendKeys("admin123");
		loginpage.clickLoginButton().click();
		

	}

}
