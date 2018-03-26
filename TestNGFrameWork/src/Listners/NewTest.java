package Listners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(Listners.SriListners.class)
public class NewTest {

	WebDriver driver;
	//String Url = "https://www.pitchvision.com";

	@Test
	@Parameters({"Url"})
	public void LaunchBrowser( String bro) {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(bro);

	}
}
