package hrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRMLoginPage {
WebDriver driver;
	public HRMLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	//Handling for userid textfield
	@FindBy(xpath="//input[@id='txtUsername']")
	WebElement uid;
	 public WebElement eneterUsername()
	 {
		 return uid;
	 }
	 //Handling for password textfield
	 @FindBy(xpath="//input[@id='txtPassword']")
		WebElement pwd;
		 public WebElement eneterPassword()
		 {
			 return pwd;
		 }
		 
		 //handling for login button
		 @FindBy(xpath="//input[@id='btnLogin']")
			WebElement login;
			 public WebElement clickLoginButton()
			 {
				 return login;
			 }
	

}
