package CucumberRun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition2 {
	
	WebDriver driver;
	

	@Given("^Start the web browser$")
	public void Start_the_web_browser() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "/Users/reenupanwar/Desktop/Selenium Software/chromedriver 4");
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
    
}
	@When("^Login with correct \"([^\"]*)\" and \"([^\"]*)\"$")
public void Login_with_correct_UserName_and_password(String uname, String pass) throws Throwable {
	driver.findElement(By.id("email")).sendKeys(uname);
	driver.findElement(By.id("pass")).sendKeys(pass);
    
}

@Then("^Logged in successfully$")
public void Logged_in_successfully() throws Throwable {
	driver.findElement(By.id("u_0_q")).click();
    
}

}
