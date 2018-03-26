package Listners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.testng.annotations.Test;

public class MouseElements {

	WebDriver driver;

	@Test
	public void Flipkart() {

		driver = new FirefoxDriver();

		driver.get("https://www.flipkart.com/");

		// close the login tab

		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();

		// Move to the corsor Electronic bucket

		Actions action = new Actions(driver);

		WebElement Ele = driver.findElement(By.cssSelector("a[title='Electronics']"));

		Action MoveTheMouse = action.moveToElement(Ele).build();

		MoveTheMouse.perform();

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		WebElement Powerbank = driver.findElement(By.xpath("//a[@title='Power Banks']"));

		Action move_PowerBanks = action.moveToElement(Powerbank).contextClick().sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER).build();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);


		move_PowerBanks.perform();

		String expectdTitle = driver.getTitle();

		String actualTitle = "Power Banks";

		if (expectdTitle.contains(expectdTitle)) {
			System.out.println(" Test Case passsed");
		} else {
			System.out.println(" Test Case failed");
		}
	}

}
