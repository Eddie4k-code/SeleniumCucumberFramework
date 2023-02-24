package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pageObjects.AddCustomerPage;
import pageObjects.BaseClass;
import pageObjects.LoginPage;




public class Steps extends BaseClass {


	  
  @Before
	public void setup() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/Chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		lp = new LoginPage(driver);
		
	}
	
	@Given("User Launches Chrome WebDriver")
	public void user_Launches_Chrome_WebDriver() {

	}
	
	@Given("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
		lp.enterUsername(email);
		lp.enterPassword(password);
		
	}

	@When("Click on Login")
	public void click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
		lp.clickLogin();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) {
	    if (driver.getPageSource().contains("Login was unsuccessful")) {
	    	driver.close();
	    	Assert.fail();
	    } else {
	    	Assert.assertEquals(title, driver.getTitle());
	    }
	}

	@When("user clicks on Log Out Link")
	public void user_clicks_on_log_out_link() {
	    lp.clickLogOut();
	}

	@Then("Close browser")
	public void close_browser() {
	    driver.quit();
	}
	
	
	
	@After
	public void teardown() {
		driver.quit();
	}


	

}
