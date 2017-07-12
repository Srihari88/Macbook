package CucumberRun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	
	WebDriver driver;
	
	
	@Given("^Start the web browser$")
	public void start_the_web_browser() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "/Users/reenupanwar/Desktop/Selenium Software/chromedriver 4");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.pitchvision.com/#/");
		driver.findElement(By.cssSelector(".pv-pl20.login-modal.fa.fa-lock.ng-scope")).sendKeys("");
	    
	}

	@When("^Login with correct \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_with_correct_and(String uname, String pwd) throws Throwable {
		
		driver.findElement(By.cssSelector(".form-control.empty.input.ng-pristine.ng-untouched.ng-invalid.ng-invalid-required")).sendKeys(uname);
		driver.findElement(By.cssSelector("#password")).sendKeys(pwd);
	   
	}

	@Then("^Logged in successfully$")
	public void logged_in_successfully() throws Throwable {
		
		driver.findElement(By.cssSelector(".width-35.pull-right.btn.btn-sm.btn-primary.main-reg-log-submit"));
	   
	}

}
