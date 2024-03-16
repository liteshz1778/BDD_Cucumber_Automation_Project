package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utilities.ScrollHelper;
import Utilities.WaitHelper;

public class AddNewCustomer {

	public WebDriver driver;
	public WaitHelper wh;
	public ScrollHelper sh;

	@FindBy(xpath = "(//*[normalize-space()=\"Customers\"])[1]")
	private WebElement customerMenu;

	@FindBy(xpath = "//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
	private WebElement customerSubMenu;

	@FindBy(xpath = "//*[@class=\"float-right\"]//following::*[@class=\"btn btn-primary\"]")
	private WebElement addNewButton;

	@FindBy(xpath = "//*[@id=\"Email\"]")
	private WebElement emailTextBox;

	@FindBy(xpath = "//*[@id=\"Password\"]")
	private WebElement passwdTextBox;

	@FindBy(xpath = "//*[@id=\"FirstName\"]")
	private WebElement firstNameTextBox;

	@FindBy(xpath = "//*[@id=\"LastName\"]")
	private WebElement lastNameTextBox;

	@FindBy(xpath = "//*[@id=\"Gender_Male\"]")
	private WebElement maleGenderRadioButton;

	@FindBy(xpath = "//*[@id=\"Gender_Female\"]")
	private WebElement femaleGenderRadioButton;

	@FindBy(xpath = "//*[@id=\"DateOfBirth\"]")
	private WebElement dobTextBox;

	@FindBy(xpath = "//*[@id=\"Company\"]")
	private WebElement companyNameTextBox;

	@FindBy(xpath = "//*[@id=\"SelectedCustomerRoleIds\"]")
	private WebElement customerRoles;

	@FindBy(xpath = "//*[@id=\"VendorId\"]")
	private WebElement managerOfVenderMenu;

	@FindBy(xpath = "//textarea[@id='AdminComment']")
	private WebElement adminCommentTextField;

	@FindBy(xpath = "//*[@class=\"btn btn-primary\" and @name=\"save\"]")
	private WebElement saveButton;

	public AddNewCustomer(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wh = new WaitHelper(driver);
		sh = new ScrollHelper(driver);
	}

	public WebElement clickOnCustomerMenu() {
		wh.waitForElement(customerMenu, 15);
		return customerMenu;
	}

	public WebElement clickOnCustomerSubMenu() {
		wh.waitForElement(customerSubMenu, 15);
		return customerSubMenu;
	}

	public WebElement clickOnAddNewButton() {
		wh.waitForElement(addNewButton, 15);
		return addNewButton;
	}

	public void setEmailAddress(String email) {
		sh.scrollToElement(emailTextBox);
		emailTextBox.sendKeys(email);
	}

	public void setPassword(String password) {
		passwdTextBox.sendKeys(password);
	}

	public void setFirstName(String fname) {
		firstNameTextBox.sendKeys(fname);
	}

	public void setLastName(String lname) {
		lastNameTextBox.sendKeys(lname);
	}

	public void setGender(String gender) {

		if (gender.equalsIgnoreCase("Male")) {
			maleGenderRadioButton.click();
		} else if (gender.equalsIgnoreCase("Female")) {
			femaleGenderRadioButton.click();
		}
	}

	public void setDOB(String dateOfBirth) {
		dobTextBox.sendKeys(dateOfBirth);
	}

	public void setCompanyName(String cname) {
		companyNameTextBox.sendKeys(cname);
	}

//	public void setCustomerRole(String cRole) throws InterruptedException {
//
//		sh.scrollToElement(adminCommentTextField);
//		Thread.sleep(1000);
//		String[] roles = cRole.replaceAll("\\s", "").split(",");
//		Select selectRole = new Select(customerRoles);
//
//		for (int i = 0; i < roles.length; i++) {
//			if (roles[i].equals("Registered")) {
//				customerRoles.click();
//				selectRole.selectByValue("3");
//			} else if (roles[i].equals("Administrators")) {
//				customerRoles.click();
//				selectRole.selectByValue("1");
//			} else if (roles[i].equals("Forum Moderators")) {
//				customerRoles.click();
//				selectRole.selectByValue("2");
//			} else if (roles[i].equals("Guests")) {
//				customerRoles.click();
//				selectRole.selectByValue("4");
//			} else if (roles[i].equals("Vendors")) {
//				customerRoles.click();
//				selectRole.selectByValue("5");
//			}
//		}
//	}

	public void setVendor(String vendor) {
		Select selVendor = new Select(managerOfVenderMenu);
		selVendor.selectByVisibleText(vendor);
		managerOfVenderMenu.click();
	}

	public void setAdminComments(String aComments) {
		adminCommentTextField.sendKeys(aComments);
	}

	public WebElement clickOnSaveButton() {
		return saveButton;
	}
}
