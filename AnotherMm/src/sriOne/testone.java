package sriOne;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testone {
	WebDriver driver = new FirefoxDriver();

	@Test
	public void login() throws IOException {
		driver.get("http://www.pitchvision.com/#/");
		System.out.println(driver.getTitle());
		//
		// File srcFile = ((TakesScreenshot)
		// driver).getScreenshotAs(OutputType.FILE);
		//
		// File DestFile = new
		// File("/Users/reenupanwar/Documents/SeleniumPrograms/AnotherMm/src/Screenshots/nice.png");
		//
		// FileUtils.copyFile(srcFile, DestFile);
		//
		// System.out.println(" Check the screen shots in the folder");

		Calendar calender = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			File destFile = new File("/Users/reenupanwar/Documents/SeleniumPrograms/AnotherMm/src/Screenshots "
					+ formater.format(calender.getTime()) + ".png");

			// File destFile = new File(reporDirectory +
			// formater.format(calender.getTime()) + ".png");
			FileUtils.copyFile(srcFile, destFile);
			System.out.println(" Captured the screenshot..!!");

			// Reporter.log("<a href='" + destFile.getAbsolutePath() + "'><img
			// src='" + destFile.getAbsolutePath()
			// + "'height='100' width='100'/></a>");

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
