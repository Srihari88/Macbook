package com.Android.matchstats;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class MatchScoreVerification {
	public static AppiumDriver driver;
	
	public float bowling_strikerate;
	public float bowing_enconmy;
	public float BattingstrikeRate;

	@Test(priority=0)
	public void OpenApp() throws MalformedURLException, Exception {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium-version", "1.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("deviceName", "S6");
		capabilities.setCapability("app", "/Users/reenupanwar/Desktop/builds/stagedebug.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		Thread.sleep(15000);
	}

	@Test(priority=1)
	public void LoginApp() throws InterruptedException {
		driver.findElement(By.id("et_email")).sendKeys("sree.hari");
		driver.findElement(By.id("et_password")).sendKeys("9010satya");
		driver.findElement(By.id("btn_login")).click();
		Thread.sleep(5000);
		WebElement contact = driver.findElement(By.id("com.pitchvision.stage.debug:id/indicator"));
		int wide = contact.getSize().width;
		int hgt = contact.getSize().height;

		int startx = (int) (wide * (0.9));
		int endx = (int) (wide * (0.2));
		int starty = hgt / 2;
		int endy = hgt / 2;

		// To move from Fav to all contacts, we need to swipe from right to left
		driver.swipe(startx, starty, endx, endy, 1000);
		driver.swipe(startx, starty, endx, endy, 1000);
		driver.swipe(startx, starty, endx, endy, 1000);
		driver.swipe(startx, starty, endx, endy, 1000);
		driver.swipe(startx, starty, endx, endy, 1000);

		driver.findElement(By.id("btn_continue")).click();

		System.out.println("All user guide slides are moved.");
	}
	
	@Test(priority=2)
	public void OpenMatchScore() throws Exception{
		driver.findElement(By.id("tab_tv_plus")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Match Scores']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("action_add_stats")).click(); 
		
	}
	
	@Test(priority=3)
	
	public void matchdetails() throws Exception{
		driver.findElement(By.id("team_spinner_tv")).sendKeys("Srihari");
		driver.findElement(By.id("id_opposition")).sendKeys("MatchScore");
		driver.findElement(By.id("id_league_text")).sendKeys("Water");
		driver.findElement(By.id("id_match_type_text")).sendKeys("Stage");
		driver.findElement(By.id("id_venue_text")).sendKeys("Gurgaon");
		

		driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.support.v7.widget.RecyclerView[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/"
				+ "android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.Spinner[1]"))
				.click();
		driver.findElement(
				By.xpath("//android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.TextView[2]"))
				.click();
		Thread.sleep(4000);
		System.out.println("Selected the format");
		driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.support.v7.widget.RecyclerView[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/"
				+ "android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[3]/"
				+ "android.widget.Spinner[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")).click();
		driver.findElement(
				By.xpath("//android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.TextView[2]"))
				.click();
		Thread.sleep(4000);
		System.out.println("Selected the grade");
		driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget."
				+ "FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView[1]/"
				+ "android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.Spinner[1]/"
				+ "android.widget.LinearLayout[1]/android.widget.TextView[1]")).click();
		driver.findElement(
				By.xpath("//android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.TextView[2]"))
				.click();
		Thread.sleep(4000);
		System.out.println("Selected the surface type");
		driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/"
				+ "android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.LinearLayout[2]/"
				+ "android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/"
				+ "android.widget.LinearLayout[2]/android.widget.Spinner[1]/android.widget.LinearLayout[1]/"
				+ "android.widget.TextView[1]")).click();
		driver.findElement(
				By.xpath("//android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.TextView[2]"))
				.click();
		Thread.sleep(4000);
	}
	@Test(priority=4)
	public void EnterBatting(){

		int RunsScored = 45;
		int BallsFaced = 30;
		driver.findElement(By.id("id_batting_pos")).click();
		driver.findElement(
				By.xpath("//android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.TextView[2]"))
				.click();
		driver.findElement(By.id("id_total_runs_text")).sendKeys(String.valueOf(RunsScored));	
		driver.findElement(By.id("id_ball_faced_text")).sendKeys(String.valueOf(BallsFaced));
		driver.findElement(By.id("id_how_out_text")).click();
		driver.findElement(
				By.xpath("//android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.TextView[4]"))
				.click();
		float BattingstrikeRate;
		// Batting srtike rate formula
		BattingstrikeRate = (float)(RunsScored * 100 / BallsFaced);
		System.out.println("Batting strike rate" + BattingstrikeRate);
	}
	
	@Test(priority=5)
	public void EnterBowling() throws Exception{
		driver.scrollTo("Wickets");
		int b_overs = 2;
		int b_runs = 40;
		int W_wickets = 3;
		int wides = 2;
		int No_balls = 0;
		int ballsbowled = b_overs * 6;
		float bowing_enconmy;
		float bowling_strikerate;

		driver.findElement(By.id("id_overs_text")).sendKeys(String.valueOf(b_overs));
		driver.findElement(By.id("id_run_text")).sendKeys(String.valueOf(b_runs));
		driver.findElement(By.id("id_wickets_text")).sendKeys(String.valueOf(W_wickets));
		driver.findElement(By.id("id_wide_ball_text")).sendKeys(String.valueOf(wides));
		driver.findElement(By.id("id_no_ball_text")).sendKeys(String.valueOf(No_balls));
		System.out.println("Submit the all data");

		Thread.sleep(2000);

		// Strike rate.

		bowling_strikerate = (float) (ballsbowled / W_wickets);
		System.out.println("Bowling strike rate " + bowling_strikerate);

	     bowing_enconmy =  (float) (b_runs + wides + No_balls) * 6 / ballsbowled;
		System.out.println("Bowling econmy " + bowing_enconmy);

	}
	
	@Test(priority=6)
	public void EnterFieding() throws Exception{

		driver.hideKeyboard();
		driver.scrollTo("Catches");
		driver.findElement(By.id("id_catches_text")).sendKeys("3");
		driver.findElement(By.id("id_stumping_text")).sendKeys("1");
		driver.findElement(By.id("id_run_out_text")).sendKeys("3");
		driver.findElement(
				By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/"
						+ "android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/"
						+ "android.support.v7.widget.LinearLayoutCompat[1]/android.widget.TextView[1]"))
				.click();

		System.out.println(" All the fielding values entered ");

		Thread.sleep(5000);
	}
	
	@Test(priority=7)
	public void verifyBattingStrickerate() throws Exception{
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='0']")).click();
		String Verify_Battingstrikerate = driver.findElement(By.id("id_strike_rate_text")).getText();
		System.out.println("Verified value" +Verify_Battingstrikerate);
		float Convert_Verify_Battingstrikerate = Float.parseFloat(Verify_Battingstrikerate);
		System.out.println("Print the value of verify" +Convert_Verify_Battingstrikerate);

		if (Convert_Verify_Battingstrikerate == BattingstrikeRate) {
			System.out.println("Test case passed, & batting strike rate is " + Verify_Battingstrikerate);
		} else {
			System.out.println("Test case faied, Please check the calculation ");
		}

		Thread.sleep(5000);
	}
	
	@Test(priority=8)
	public void verifyBowingStrikerate() throws Exception{

		driver.scrollTo("Strike Rate");

		String verify_bowling_strikerate = driver.findElement(By.id("id_strike_rate_2_text")).getText();
		float Convert_verify_bowling_strikerate = Float.parseFloat(verify_bowling_strikerate);
		System.out.println("Verified bowing strike rate " + verify_bowling_strikerate);

		if (Convert_verify_bowling_strikerate == bowling_strikerate) {
			System.out
					.println("Test case passed, calculated the bowing strike rate" + Convert_verify_bowling_strikerate);
		} else {
			System.out.println("Test case failed, Incorrect bowilng strike rate");
		}
		Thread.sleep(3000);
	}
	
	@Test(priority=9)
	public void verifyBowlingEconomy() throws Exception{
		String bowling_enconoy_rate = driver.findElement(By.id("id_econ_text")).getText();
		float verify_bowling_enconoy_rate = Float.parseFloat(bowling_enconoy_rate);
		System.out.println("Bowling economy verification" + verify_bowling_enconoy_rate);
		System.out.println("Bowling economy verification" + bowing_enconmy);
		

		if (verify_bowling_enconoy_rate == bowing_enconmy) {
			System.out.println("Test cased passed, Verified bowling economy is " + verify_bowling_enconoy_rate);
		} else {

			System.out.println("Test case failed, Incorrect bowling strike rate");
		}
		
		Thread.sleep(3000);

	}
}