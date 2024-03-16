package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollHelper {

	WebDriver shdriver;

	public ScrollHelper(WebDriver driver) {
		this.shdriver = driver;
	}

	public void scrollToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) shdriver;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}

	public void resizeWindow(WebDriver driver, int width, int height) {
		Dimension d = new Dimension(width, height);
		driver.manage().window().setSize(d);
	}

	public void zoomInOrOut(WebDriver driver, String zoomAction, int noOfTimes) {
		if (zoomAction.equalsIgnoreCase("In")) {
			for (int i = 0; i < noOfTimes; i++) {
				driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
			}
		} else if (zoomAction.equalsIgnoreCase("Out")) {
			for (int i = 0; i < noOfTimes; i++) {
				driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
			}
		} else if (zoomAction.equalsIgnoreCase("Default")) {
			driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, "0"));
		}
	}
}
