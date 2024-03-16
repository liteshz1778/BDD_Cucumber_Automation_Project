package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ScrollHelper;
import Utilities.WaitHelper;

public class SearchCustomer {

	public WebDriver sdriver;
	public WaitHelper wh;
	public ScrollHelper sh;

	@FindBy(xpath = "//*[@id=\"SearchEmail\"]")
	private WebElement emailIdTextBox;

	@FindBy(xpath = "//*[@id=\"search-customers\"]")
	private WebElement searchButton;

	@FindBy(xpath = "//input[@id=\"SearchFirstName\"]")
	private WebElement firstNameTextBox;

	@FindBy(xpath = "//input[@id=\"SearchLastName\"]")
	private WebElement lastNameTextBox;

	@FindBy(xpath = "//div[@class=\"dataTables_scroll\"]")
	private WebElement table;

	private By columns = By.xpath(
			"//*[@class=\"dataTables_scrollHead\"]//table[@class=\"table table-bordered table-hover table-striped dataTable no-footer\"]//thead//tr/th");
	private By rows = By.xpath("//div[@class=\"dataTables_scrollBody\"]//table[@id=\"customers-grid\"]//tbody//tr//td");

	public SearchCustomer(WebDriver driver) {
		this.sdriver = driver;
		PageFactory.initElements(driver, this);
		wh = new WaitHelper(driver);
		sh = new ScrollHelper(driver);
	}

	public void setEmail(String emailId) {
		wh.waitForElement(emailIdTextBox, 15);
		emailIdTextBox.clear();
		emailIdTextBox.sendKeys(emailId);
	}

	public void clickOnSearch() throws InterruptedException {
		searchButton.click();
		Thread.sleep(2000);
	}

	public boolean searchByEmail(String emailId) {

		boolean status = false;

		sh.scrollToElement(table);

		int noOfCols = sdriver.findElements(columns).size();
		int noOfRows = sdriver.findElements(rows).size();

		for (int i = 1; i <= noOfRows; i++) {
			String actual_emailId = sdriver.findElement(
					By.xpath("//div[@class=\"dataTables_scrollBody\"]//table[@id=\"customers-grid\"]//tbody//tr[" + i
							+ "]//td[2]"))
					.getText();
			if (emailId.equals(actual_emailId)) {
				status = true;
				break;
			}
		}

		return status;

	}

	public void setFisrtLastName(String fname, String lname) {
		firstNameTextBox.clear();
		firstNameTextBox.sendKeys(fname);
		lastNameTextBox.clear();
		lastNameTextBox.sendKeys(lname);
	}
	

	public boolean searchByFirstAndLastName(String expectedName) {

		boolean status = false;

		sh.scrollToElement(table);

		int noOfCols = sdriver.findElements(columns).size();
		int noOfRows = sdriver.findElements(rows).size();

		for (int i = 1; i <= noOfRows; i++) {
			String actual_name = sdriver.findElement(
					By.xpath("//div[@class=\"dataTables_scrollBody\"]//table[@id=\"customers-grid\"]//tbody//tr[" + i
							+ "]//td[3]"))
					.getText();
			if (expectedName.equals(actual_name)) {
				status = true;
				break;
			}
		}

		return status;

	}
}
