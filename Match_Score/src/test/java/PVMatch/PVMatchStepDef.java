package PVMatch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PVMatchStepDef {

	WebDriver driver;

	@Given("^Start the browser$")
	public void start_the_browser() throws Throwable {

		//System.setProperty("webdriver.chrome.driver", "/Users/reenupanwar/Desktop/Selenium Software/chromedriver 4");
		driver = new FirefoxDriver();
		driver.get("http://stage.pitchvision.com/#/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath(".//*[@id='site-head']/ul[2]/li/a")).click();
		Thread.sleep(5);

	}

	@When("^Enter the valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_valid_and(String uname, String pwd) throws Throwable {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);

	}

	@Then("^logged in successfuly$")
	public void logged_in_successfuly() throws Throwable {
		driver.findElement(By.cssSelector(".width-35.pull-right.btn.btn-sm.btn-primary.main-reg-log-submit")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.close();

	}

}
