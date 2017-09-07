package com.Android.matchstats;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class BannerUpload {
	public static AppiumDriver driver;

	String Expected = "Invalid username or password";

	@Test(priority = 0)
	public void OpenApp() throws MalformedURLException, Exception {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium-version", "1.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("deviceName", "S6");
		capabilities.setCapability("app", "/Users/reenupanwar/Desktop/builds/hearty.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		Thread.sleep(15000);
	}
	
	@Test(priority = 1)
	public void ClickUpload() throws Exception {
		driver.findElement(By.id("imageViewProfilePic")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("menuProfilePic")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("imageViewEditPics")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Banner']")).click();

		driver.findElement(By.id("album_thumbnail")).click();
		WebElement abc = driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[4,404][236,644]']"));
		abc.click();
		Thread.sleep(2000);
		driver.findElement(By.id("fab_done")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("menu_crop")).click();
		Thread.sleep(6000);
		driver.findElement(By.id("uploadImage")).click();

	}


}