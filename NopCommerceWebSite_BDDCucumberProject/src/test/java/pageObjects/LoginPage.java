package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class LoginPage {

	public WebDriver driver;
	public WaitHelper wh;

	@FindBy(xpath = "//*[@id=\"Email\"]")
	private WebElement emailAddress;

	@FindBy(xpath = "//*[@id=\"Password\"]")
	private WebElement password;

	@FindBy(xpath = "//*[@class=\"button-1 login-button\"]")
	private WebElement LoginButton;

	@FindBy(xpath = "//*[@class=\"nav-link\" and text()=\"Logout\"]")
	private WebElement LogoutLink;

	@FindBy(xpath = "//*[@class=\"message-error validation-summary-errors\"]")
	private WebElement errorMessageInValidLogin;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wh = new WaitHelper(driver);

	}

	public void clearValues() {
		emailAddress.clear();
		password.clear();
	}

	public void sendValues(String uname, String passwd) {
		emailAddress.sendKeys(uname);
		password.sendKeys(passwd);
	}

	public void loggedIn() {
		LoginButton.click();
	}

	public WebElement loggedOut() {
		wh.waitForElement(LogoutLink, 40);
		return LogoutLink;
	}

	public String returnInvalidMessage() {
		return errorMessageInValidLogin.getText();
	}

}
