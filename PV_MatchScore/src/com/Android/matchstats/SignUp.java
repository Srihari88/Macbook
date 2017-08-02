package com.Android.matchstats;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class SignUp {
	
	public static AppiumDriver driver;
  @Test(priority=0)
  public void openApp() throws IOException, Exception {
	  
	  DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium-version", "1.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("deviceName", "S6");
		capabilities.setCapability("app", "/Users/reenupanwar/Desktop/builds/stagedebug.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		Thread.sleep(15000);
		System.out.println("Opened the app successfully");
  }
  
  @Test(priority=1)
  public void Register(){
	  driver.findElement(By.id("tv_register_now")).click();
	  driver.findElement(By.id("email_et")).sendKeys("srihari.naidu+hmm@misport.com");
	  driver.findElement(By.id("firstname_et")).sendKeys("Pros");
	  driver.findElement(By.id("lastname_et")).sendKeys("Motorola");
	  driver.findElement(By.id("nickname_et")).sendKeys("Goes");
	  driver.findElement(By.id("pass_et")).sendKeys("password");
	  driver.findElement(By.id("confirm_pass_et")).sendKeys("password");
	  driver.findElement(By.id("btn_register")).click();
	  driver.hideKeyboard();
	  System.out.println("User registered successfully");
  }
}
