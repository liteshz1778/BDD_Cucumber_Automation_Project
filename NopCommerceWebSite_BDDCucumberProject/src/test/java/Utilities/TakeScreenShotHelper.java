package Utilities;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShotHelper {

	public WebDriver ssdriver;

	public TakeScreenShotHelper(WebDriver driver) {
		this.ssdriver = driver;
	}

	public void takeScreenShot(String imageName) throws Exception {

		TakesScreenshot tcs = (TakesScreenshot) this.ssdriver;

		File source = tcs.getScreenshotAs(OutputType.FILE);

		File destFile = new File(System.getProperty("user.dir") + "\\ScreenShots\\" + imageName + ".png");

		FileHandler.copy(source, destFile);
	}
}
