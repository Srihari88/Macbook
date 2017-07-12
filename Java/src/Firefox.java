import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.safari.SafariDriver;


public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		//System.setProperty("webdriver.gecko.driver", "/Users/reenupanwar/Desktop/Selenium Software/geckodriver");
		//System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		
		FirefoxProfile profile = null;
		WebDriver driver = new FirefoxDriver(new FirefoxBinary(new File("/Applications/Fi‌​refox.app/Contents/MacOS/Firefox-bin/firefox.exe")), profile);
		
		//System.setProperty("webdriver.firefox.bin", "/Applications/Fi‌​refox.app/Contents/MacOS/Firefox-bin");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	    driver.findElement(By.cssSelector(".pv-pl20.login-modal.fa.fa-lock.ng-scope")).click();
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("arun.b");
		driver.findElement(By.cssSelector("#password")).sendKeys("tyrodisk");
		driver.findElement(By.cssSelector(".width-35.pull-right.btn.btn-sm.btn-primary.main-reg-log-submit")).click();
		System.out.println("Login successfully in Pitchvision");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		//Go to the hub page.
		driver.findElement(By.xpath("//a[@href='/#/hub']")).click();
	}

}
