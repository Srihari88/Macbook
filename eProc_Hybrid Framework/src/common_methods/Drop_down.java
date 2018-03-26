package common_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import executionEngine.DriverScript;

public class Drop_down extends DriverScript {
	public Drop_down() throws NoSuchMethodException, SecurityException {
		super();
		// TODO Auto-generated constructor stub
	}

	static WebDriver driver;

	public void drop_down1(String locator, String locator_value, String selectby, String value) {
		if (locator.equalsIgnoreCase("id")) {
			Select drp = new Select(driver.findElement(By.id(locator_value)));

			if (selectby.equalsIgnoreCase("visibletext")) {

				drp.selectByVisibleText(value);
			}

			else if (selectby.equalsIgnoreCase("value")) {
				drp.selectByValue(value);
			}

		}

		if (locator.equalsIgnoreCase("name")) {
			Select drp = new Select(driver.findElement(By.name(locator_value)));

			if (selectby.equalsIgnoreCase("visibletext")) {

				drp.selectByVisibleText(value);
			}

			else if (selectby.equalsIgnoreCase("value")) {
				drp.selectByValue(value);
			}

		}

	}

}
