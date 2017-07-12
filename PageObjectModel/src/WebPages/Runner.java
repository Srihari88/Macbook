package WebPages;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import PagesRunnerFile.LoginPage;

public class Runner {
	
	WebDriver driver;
	
	@Test
	public void Login1(){
		
		System.setProperty("webdriver.chrome.driver", "/Users/reenupanwar/Desktop/Selenium Software/chromedriver 4");
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		LoginPage log=new LoginPage(driver);
		log.typeUsername();
		log.typePassword();
		log.clicksubmit();
		driver.quit();
		
	}

}
