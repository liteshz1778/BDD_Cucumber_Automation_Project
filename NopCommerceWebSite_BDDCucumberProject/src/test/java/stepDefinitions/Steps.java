package stepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AddNewCustomer;
import pageObjects.LoginPage;
import pageObjects.SearchCustomer;

public class Steps extends BaseClass {

	@Before
	public void setUp() throws Exception {
		logger = Logger.getLogger("nopCommerce"); // Configuring Logger
		PropertyConfigurator.configure("log4j.properties"); // Configuring log4j properties file

		prop = new Properties();
		FileInputStream fi = new FileInputStream(
				System.getProperty("user.dir") + "\\PropertiesFiles\\config.porperties");
		prop.load(fi);

		if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromeDriverPath"));
			driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.gecko.driver", prop.getProperty("geckoDriverPath"));
			driver = new FirefoxDriver();
		}
	}

	@Given("User Launch Chrome Browser")
	public void user_Launch_Chrome_Browser() throws IOException {
		lp = new LoginPage(driver);

	}

	@When("User opens {string}")
	public void user_opens(String string) throws InterruptedException {
		logger.info("************* Launching Test-Site Url *****************");
		driver.get(string);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@When("User sends Email as {string} & password as {string}")
	public void user_sends_Email_as_password_as(String email, String passwd) throws InterruptedException {
		logger.info("************* Sending Email Id & Password *****************");
		lp.clearValues();
		lp.sendValues(email, passwd);
		Thread.sleep(2000);
	}

	@When("Click on Login")
	public void click_on_Login() throws InterruptedException {
		logger.info("************* Logging In *****************");
		lp.loggedIn();
		Thread.sleep(4000);
	}

	@Then("Page Title Should be {string}")
	public void page_Title_Should_be(String pageTitle) {

		if (driver.getPageSource().contains("Login was unsuccessful")) {
			Assert.assertTrue(lp.returnInvalidMessage()
					.contains("Login was unsuccessful. Please correct the errors and try again"));
			logger.info("************* Display Invalid Login Message *****************");
			driver.close();
		} else {
			logger.info("************* Validating Page Title *****************");
			Assert.assertEquals(driver.getTitle(), pageTitle);
		}

	}

	@When("User click on Logout link")
	public void user_cick_on_Logout_link() throws InterruptedException {
		logger.info("************* Logged Out Successfully *****************");
		lp.loggedOut().click();
	}

	@Then("close browser")
	public void close_browser() throws InterruptedException {
		logger.info("************* Closing Browser *****************");
		Thread.sleep(2000);
		driver.quit();
	}

	@Then("Click on Customers Menu")
	public void click_on_Customers_Menu() {
		addNewCust = new AddNewCustomer(driver);
		addNewCust.clickOnCustomerMenu().click();
	}

	@Then("Click on Customers Sub-Menu")
	public void click_on_Customers_Sub_Menu() {
		logger.info("************* Navigated on Customer Page *****************");
		addNewCust.clickOnCustomerSubMenu().click();
	}

	@Then("Click on Add new button")
	public void click_on_Add_new_button() {
		logger.info("************* Navigated to Add New Customer Page *****************");
		addNewCust.clickOnAddNewButton().click();
	}

	@Then("Provide the Customer info")
	public void provide_the_Customer_info_like() throws InterruptedException {
		Thread.sleep(2000);
		logger.info("************* Filling New Customer Details *****************");
//		addNewCust.setCustomerRole("Administrators, Registered");
		addNewCust.setEmailAddress(BaseClass.randomStringGenerator() + "@nopCommerce.com");
		addNewCust.setPassword(BaseClass.randomStringGenerator());
		addNewCust.setFirstName(BaseClass.randomStringGenerator() + " ");
		addNewCust.setLastName(BaseClass.randomStringGenerator());
		addNewCust.setGender("Male");
		addNewCust.setDOB("03/28/1998");
		addNewCust.setCompanyName("DummyCompany");
		addNewCust.setVendor("Vendor 1");
		addNewCust.setAdminComments("This is Active Customer");
	}

	@Then("Click on Save button")
	public void click_on_Save_button() {
		logger.info("************* Saving New Customer Details *****************");
		addNewCust.clickOnSaveButton().click();
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {
		logger.info("************* New Customer Created Successfully *****************");
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().trim()
				.contains("The new customer has been added successfully."));
	}

	@Then("Enter the Email Address")
	public void enter_the_Email_Address() {
		logger.info("************* Searching customer via Email Id *****************");
		searchCust = new SearchCustomer(driver);
		searchCust.setEmail("james_pan@nopCommerce.com");
	}

	@Then("Click on Search button")
	public void click_on_Search_button() throws InterruptedException {
		logger.info("************* Clicked on Search Button *****************");
		searchCust.clickOnSearch();
	}

	@Then("Validate the Specific Email Id is getting reflected")
	public void validate_the_Specific_Email_Id_is_getting_reflected() {
		logger.info("************* Validating Search Customer through Email Id *****************");
		Assert.assertTrue(searchCust.searchByEmail("james_pan@nopCommerce.com"));
	}

	@Then("Enter the Firstname & Lastname")
	public void enter_the_Firstname_Lastname() {
		logger.info("************* Searching customer via FirstName & LastName *****************");
		searchCust = new SearchCustomer(driver);
		searchCust.setFisrtLastName("Brenda", "Lindgren");
	}

	@Then("Validate the Specific Firstname & Lastname Id is getting reflected")
	public void validate_the_Specific_Firstname_Lastname_Id_is_getting_reflected() {
		logger.info("************* Validating Search Customer through FirstName & LastName *****************");
		Assert.assertTrue(searchCust.searchByFirstAndLastName("Brenda Lindgren"));
	}

}
