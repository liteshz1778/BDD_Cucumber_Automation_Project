package stepDefinitions;

import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageObjects.AddNewCustomer;
import pageObjects.LoginPage;
import pageObjects.SearchCustomer;

public class BaseClass {

	public WebDriver driver;
	public LoginPage lp;
	public AddNewCustomer addNewCust;
	public SearchCustomer searchCust;
	public Properties prop;
	public static Logger logger;
	public static String randomStr;

	public static String randomStringGenerator() {
		randomStr = RandomStringUtils.randomAlphabetic(8);
		return randomStr;
	}

}
