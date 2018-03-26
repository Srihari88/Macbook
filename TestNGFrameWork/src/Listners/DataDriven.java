package Listners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {

	WebDriver driver;
	String Url = "http://www.pitchvision.com/#/";

	@BeforeMethod
	public void StartRespectiveBrowser() {


		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

		System.out.println(driver.getTitle());

	}

	@DataProvider(name = "TestData")

	public Object getData() {

		Object[][] data = new Object[3][2];

		data[0][0] = "David.davidson";
		data[0][1] = "likewelt";

		data[1][0] = "David.davidson";
		data[1][1] = "likewelt";

		data[2][0] = "David.davidson";
		data[2][1] = "likewelt";

		return data;
	}

	@Test(dataProvider = "TestData")

	public void Login(String uname, String password) {
		driver.findElement(By.xpath(".//*[@id='site-head']/ul[2]/li/a")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(
				By.xpath("//button[@class='width-35 pull-right btn btn-sm btn-primary main-reg-log-submit']")).click();

		String LoginFailed_text = driver
				.findElement(By
						.xpath("//div[@class='status_message_pvRegister_log text-center']/div[@class='message-content']"))
				.getText();

		// System.out.println(" " + LoginFailed_text);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		if (LoginFailed_text.equals("Invalid username or password")) {
			System.out.println("LoggedIn Failed...!!!!");
		} else {
			System.out.println("LoggedIn Success..!!!");
		}

		// Assert.assertTrue(LoginFailed_text.contains("Invalid username or
		// password"), "Logged in Failed");
		driver.close();

	}

}
