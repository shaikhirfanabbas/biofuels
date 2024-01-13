package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.LoginPageFactory;



public class BiofuelsLoginPageFactory {


	WebDriver driver=null;

	LoginPageFactory login;
	
	@Given("browser is open")
	public void browser_is_open() {
//		System.out.println("Inside step-user is on login page");
//		System.out.println("Inside step-user is on login page");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
	}
	@And("user is on login page")
	public void user_is_on_login_page() {
		
		driver.navigate().to("http://13.235.81.123/sign-in");
	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_username_and_password(String username, String password) throws Exception {
		System.out.println("Inside step-user enter username and password");
		
		login=new LoginPageFactory(driver);
		
		login.enterusername(username);
		login.enterpassword(password);
		Thread.sleep(2000);
	}

	@And("user clicks on login")
	public void users_clicks_on_login() throws InterruptedException {
		System.out.println("Inside step-user clicks on login");
		Thread.sleep(2000);
		login.clicksignin();
			}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Inside step-user is navigated to the home page");
	}


}