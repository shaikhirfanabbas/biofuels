package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	
	@FindBy(name="email")
	WebElement txt_username;
	
	@FindBy(name="password")
	WebElement txt_password;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/div/div[3]/form/div/button")
	WebElement btn_signin;
	
	WebDriver driver;
	public LoginPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		//PageFactory.initElements(driver, LoginPageFactory.class);
	}
	
	public void enterusername(String username ) {
		 txt_username.sendKeys(username);
	 }
	 
	 public void enterpassword(String password ) {
		 txt_password.sendKeys(password);
	 }
	 public void clicksignin() {
		 btn_signin.click();
	 }

}
