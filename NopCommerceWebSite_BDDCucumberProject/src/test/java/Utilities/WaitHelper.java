package Utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class WaitHelper {
	
	public WebDriver wdriver;
	
	public WaitHelper(WebDriver driver) {
		this.wdriver = driver;
	}

	public void waitForElement(WebElement element,int timeOutSeconds) {
		
		FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(wdriver)
				.withTimeout(Duration.ofSeconds(timeOutSeconds))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		fwait.until(ExpectedConditions.visibilityOf(element));
		
	}
}
