package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.cucumber.java.Scenario;
import pageObjects.AddCustomerPage;
import pageObjects.BaseClass;
import pageObjects.LoginPage;




public class Steps extends BaseClass {
	private ChromeDriverFactory driverFactory;
	


	  
  @Before
	public void setup() throws IOException
	{
	  	driverFactory = new ChromeDriverFactory();
		driver = driverFactory.createWebDriver();
		
		lp = new LoginPage(driver);
		acp = new AddCustomerPage(driver);
		
		
		
		
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
	
	
	@And("User clicks on Customers Panel")
	public void user_clicks_on_customers_panel() {
	   acp.clickCustomersPanel();
	}
	
	@Then("User clicks Customer button")
	public void user_clicks_customer_button() {
		acp.clickCustomerBtn();
	}
	
	@And("User clicks Add New") 
	public void user_clicks_add_new() {
		//Add new Button Click
		acp.clickAddNewCustomerBtn();
	}
	
	@Then("User enters Email")
	public void user_enters_email(Scenario scenario) {
		
		
			acp.enterEmail("Eddie", scenario);
	
		
		
	}
	
	
	
	
	@After
	public void teardown(Scenario scenario) {
		//If scenario has failed then we will embed a screenshot to the report.
		//Driver quits.
		if (scenario.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;

			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", "screenshot");
		}
		driver.quit();
	}
	
	

	

}
