import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FF {
	
	//public baseURL ="https//www.pitchvision.com";

	public static void main(String[] args) throws Exception {
		/// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "/Users/reenupanwar/Desktop/Selenium Software/chromedriver 4");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.pitchvision.com");
		driver.manage().window().maximize();
	}
}