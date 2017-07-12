package PVMatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PVMatchStepDef {

	public static WebDriver driver;

	@Given("^Start the browser$")
	public void start_the_browser() throws Throwable {

		//System.setProperty("webdriver.chrome.driver","/Users/reenupanwar/Desktop/Selenium Software/chromedriver 4");
		driver = new FirefoxDriver();
		//driver=new ChromeDriver();
		driver.get("http://www.pitchvision.com/#/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath(".//*[@id='site-head']/ul[2]/li/a")).click();
		// Thread.sleep(3);
		driver.findElement(By.xpath(".//*[@id='login-modal']/div[2]/div/pv-login/div/div/div[2]")).isSelected();
	}

	@When("^Enter the valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_valid_and(String uname, String pwd) throws Throwable {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@Then("^logged in successfuly$")
	public void logged_in_successfuly() throws Throwable {
		driver.findElement(By.cssSelector(".width-35.pull-right.btn.btn-sm.btn-primary.main-reg-log-submit")).click();
		Thread.sleep(10000);
	}

	@Given("^Click on portal button$")
	public void click_on_portal_button() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='site-nav']/nav/ul/li[3]/a")).click();
		Thread.sleep(3000);
	}

	@When("^Click on matchscore button$")
	public void click_on_matchscore_button() throws Throwable {
		System.out.println("Clicked on the match stats button");
		// driver.findElement(By.xpath("//div[@id='general-player']/div[1]/div[1]/a[@ng-click='openPlayerMatchStatModal(playerDetail);']")).click();
		
		//driver.findElement(By.xpath("//a[contains(text(),'Match Stats')]")).click();
		driver.findElement(By.xpath("//a[contains(@ng-click,'openPlayerMatchStatModal(playerDetail);') or contains(text(),'Match Stats')]")).click();
		
	}

	@Then("^Entered successfully$")
	public void entered_successfully() throws Throwable {
		Thread.sleep(7000);
	}

	@Given("^Click on the add match score$")
	public void click_on_the_add_match_score() throws Throwable {
		driver.findElement(By.xpath("//button[contains(text(),'Add New')]")).click();
	}

	@When("^Select any Date$")
	public void select_any_Date() throws Throwable {
		driver.findElement(By
				.xpath(".//*[@id='playerMatchStatContent']/pv-add-portal-player-stat/div/div[2]/form/div/div[1]/div[2]/div/div/input"))
				.click();
		
	}

	@Then("^Type \"([^\"]*)\" of the match$")
	public void type_of_the_match(String OOpposition) throws Throwable {
		driver.findElement(By.name("opposite")).sendKeys(OOpposition);

	}

	@Then("^type \"([^\"]*)\"s on the field$")
	public void type_s_on_the_field(String LLeague) throws Throwable {
		driver.findElement(By.name("league")).sendKeys(LLeague);

	}

	@Then("^Enter the \"([^\"]*)\" details$")
	public void enter_the_details(String VVenue) throws Throwable {
		driver.findElement(By.xpath("//input[@name='venue']")).sendKeys(VVenue);

	}

	@Then("^Type the \"([^\"]*)\"$")
	public void type_the(String mtype) throws Throwable {
		driver.findElement(By.xpath("//input[contains(@name,'match_type')]")).sendKeys(mtype);

	}

	@Then("^Select the \"([^\"]*)\" from dropdown$")
	public void select_the_from_dropdown(String For) throws Throwable {

		Select MatchFormat = new Select(driver.findElement(By.xpath("//select[@id='match_style']")));
		MatchFormat.selectByVisibleText(For);

	}

	@Then("^Choice the \"([^\"]*)\"$")
	public void choice_the(String grade) throws Throwable {

		Select MatchGrade = new Select(driver.findElement(By.xpath("//select[@id='match_grade']")));
		MatchGrade.selectByVisibleText(grade);

	}

	@Then("^Enter the \"([^\"]*)\" on the field$")
	public void enter_the_on_the_field(String test) throws Throwable {
		driver.findElement(By.xpath("//input[contains(@name,'team')]")).sendKeys(test);

	}

	@Then("^Select the \"([^\"]*)\" of the match$")
	public void select_the_of_the_match(String rest) throws Throwable {

		Select Result = new Select(driver.findElement(By.xpath("//select[@id='result']")));
		Result.selectByVisibleText(rest);

	}

	@Then("^Select \"([^\"]*)\" type of the match$")
	public void select_type_of_the_match(String surfaces) throws Throwable {

		Select Surface = new Select(driver.findElement(By.xpath("//select[@id='surface_type']")));
		Surface.selectByVisibleText(surfaces);

	}

}
