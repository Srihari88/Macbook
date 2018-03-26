package Listners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseEvents {

	WebDriver driver;

	@Test
	public void mouse() throws InterruptedException {
		driver = new FirefoxDriver();
		// driver.get("https://www.flipkart.com/");
		//
		// Actions action = new Actions(driver);
		// WebElement store_mov = driver
		// .findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c' and
		// @type='submit']"));
		// Action mouseEvent =
		// action.moveToElement(store_mov).doubleClick().build();
		// mouseEvent.perform();

		// maximize browser
		driver.manage().window().maximize();

		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");

		// Add 5 seconds wait
		Thread.sleep(5000);

		// Create object of actions class
		Actions act = new Actions(driver);

		// find element which we need to drag
		WebElement drag = driver.findElement(By.xpath(".//*[@id='draggable']"));

		// find element which we need to drop
		WebElement drop = driver.findElement(By.xpath(".//*[@id='droppable']"));

		// this will drag element to destination
		act.dragAndDrop(drag, drop).build().perform();

	}

}
