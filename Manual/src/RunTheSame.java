import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTheSame {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://stage.pitchvision.com/#/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath(".//*[@id='site-head']/ul[2]/li/a")).click();
		// Thread.sleep(2);
		driver.findElement(By.xpath(".//*[@id='login-modal']/div[2]/div/pv-login/div/div/div[2]")).isSelected();

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("David.davidson");
		driver.findElement(By.id("password")).sendKeys("likewelt");
		driver.findElement(By.cssSelector(".width-35.pull-right.btn.btn-sm.btn-primary.main-reg-log-submit")).click();
		Thread.sleep(13);
		driver.findElement(By.linkText("Portal")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

}
