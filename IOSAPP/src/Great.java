import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class Great {
	@Test(priority = 0)
	public static void OpenApp() throws MalformedURLException, Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium-version", "1.0");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("platformVersion", "10.1");
		capabilities.setCapability("deviceName", "IPhone 7");
		capabilities.setCapability("app", "/Users/reenupanwar/Desktop/builds/IOS/Pit.ipa");
		capabilities.setCapability("app", "settings");
		AppiumDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		Thread.sleep(15000);
	}


}
