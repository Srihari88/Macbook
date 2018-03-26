package Listners;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HeightAndWidth {

	WebDriver driver;
	Properties pro;

	@Test
	public void Boxes() {
		try {
			File src = new File(
					"/Users/reenupanwar/Documents/SeleniumPrograms/TestNGFrameWork/Configuration/Configure.property");

			FileInputStream fis = new FileInputStream(src);

			Properties pro = new Properties();

			pro.load(fis);

			String ChromePath = pro.getProperty("ChromeDriver");
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	public String getChromePath() {

		String path = pro.getProperty("ChromeDriver");
		return path;

	}
	//
	// Dimension button_values =
	// driver.findElement(By.cssSelector("img[src='cdn/images/blue-register.png']"))
	// .getSize();
	//
	// int height_button = button_values.getHeight();
	// int width_button = button_values.getWidth();
	//
	// System.out.println(" The Height of the button is " + height_button);
	// System.out.println(" The width of the button is " + width_button);

}
