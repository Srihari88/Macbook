import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class VeryImportant {
	
	//public baseURL ="https//www.pitchvision.com";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/reenupanwar/Desktop/Selenium Software/chromedriver 4");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.pitchvision.com");
		driver.manage().window().maximize();
      //  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	    driver.findElement(By.cssSelector(".pv-pl20.login-modal.fa.fa-lock.ng-scope")).click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("arun.b");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).sendKeys("tyrodisk");
		driver.findElement(By.cssSelector(".width-35.pull-right.btn.btn-sm.btn-primary.main-reg-log-submit")).click();
		System.out.println("Login successfully in Pitchvision");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		//Go to the hub page.
		//driver.findElement(By.xpath("//a[@href='/#/hub']")).click();
		System.out.println("Browser opened successfully");
		
		driver.getTitle();
		String GetURL=driver.getCurrentUrl();
		System.out.println(GetURL);
		
	

	}

}
