import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Nani {

	public static AppiumDriver driver;

	public static void main(String[] args) throws IOException, Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium-version", "1.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("deviceName", "S6");
		capabilities.setCapability("app", "/Users/reenupanwar/Desktop/builds/pvstage.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// driver.quit();

		Thread.sleep(8000);
		/*
		 * driver.findElement(By.id("et_email")).sendKeys("sree.hari");
		 * driver.findElement(By.id("et_password")).sendKeys("9010satya");
		 * driver.findElement(By.id("btn_login")).click();
		 * 
		 * // Moving the slides
		 * 
		 * WebElement contact =
		 * driver.findElement(By.id("com.pitchvision.stage.debug:id/indicator"))
		 * ; int wide = contact.getSize().width; int hgt =
		 * contact.getSize().height;
		 * 
		 * int startx = (int) (wide * (0.9)); int endx = (int) (wide * (0.2));
		 * int starty = hgt / 2; int endy = hgt / 2;
		 * 
		 * // To move from Fav to all contacts, we need to swipe from right to
		 * left driver.swipe(startx, starty, endx, endy, 1000);
		 * driver.swipe(startx, starty, endx, endy, 1000); driver.swipe(startx,
		 * starty, endx, endy, 1000); driver.swipe(startx, starty, endx, endy,
		 * 1000); driver.swipe(startx, starty, endx, endy, 1000);
		 * 
		 * driver.findElement(By.id("btn_continue")).click();
		 * 
		 * System.out.println("All user guide slides are moved.");
		 */

		// Match score Entering to the player ..

		driver.findElement(By.id("tab_tv_plus")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Match Scores']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("action_add_stats")).click();

		// Enter the all fields..
		driver.findElement(By.id("team_spinner_tv")).sendKeys("Srihari");
		driver.findElement(By.id("id_opposition")).sendKeys("MatchScore");
		driver.findElement(By.id("id_league_text")).sendKeys("Water");
		driver.findElement(By.id("id_match_type_text")).sendKeys("Stage");
		driver.findElement(By.id("id_venue_text")).sendKeys("Gurgaon");

		// Format selection

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

		// Entering the batting values..!!

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
		int BattingstrikeRate;
		// Batting srtike rate formula
		BattingstrikeRate = (RunsScored * 100 / BallsFaced);
		System.out.println("Batting strike rate" + BattingstrikeRate);
		// submit the data

		System.out.println("Submited the data");

		// Entering bowing strike rate.

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

		bowing_enconmy = (b_runs + wides + No_balls) * 6 / ballsbowled;
		System.out.println("Bowling econmy " + bowing_enconmy);

		// bowling_economy=(float)(b_runs);

		// Entering the Field values

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

		Thread.sleep(3000);

		// //Main Screen values checking...!!!
		//
		// String
		// main_bowlingstrikerate=driver.findElement(By.xpath("//android.widget.TextView[@index=’0’]
		// OR [@id='id_bowling_score’]")).getText();
		//
		// System.out.println("Bowling strike rate on the main page
		// "+main_bowlingstrikerate);
		//
		// String
		// main_battingstrikerate=driver.findElement(By.xpath("//android.widget.TextView[@index=’1’]
		// OR [@id='d_batting_score’]")).getText();
		// System.out.println("Bowling strike rate on the main page
		// "+main_battingstrikerate);
		//
		// if(main_battingstrikerate==main_battingstrikerate){
		// System.out.println("Appearing batting scroe
		// corretely"+main_battingstrikerate);
		// }else
		// {
		// System.out.println("Appearing the inorrect batting score");
		// }
		// To check the entered data, Whether entered data is correct or not. //

		// Batting strike rate verification
		// driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='0']")).click();
		// String Verify_Battingstrikerate =
		// driver.findElement(By.id("id_strike_rate_text")).getText();
		// System.out.println("Verified value" + Verify_Battingstrikerate);
		// float Convert_Verify_Battingstrikerate =
		// Float.parseFloat(Verify_Battingstrikerate);
		// System.out.println("Print the value of verify" +
		// Convert_Verify_Battingstrikerate);
		//
		// if (Convert_Verify_Battingstrikerate == BattingstrikeRate) {
		// System.out.println("Test case passed, & batting strike rate is " +
		// Verify_Battingstrikerate);
		// } else {
		// System.out.println("Test case faied, Please check the calculation ");
		// }
		//
		// Thread.sleep(5000);
		//
		// // Bowling strike rate verification
		//
		// driver.scrollTo("Strike Rate");
		//
		// String verify_bowling_strikerate =
		// driver.findElement(By.id("id_strike_rate_2_text")).getText();
		// float Convert_verify_bowling_strikerate =
		// Float.parseFloat(verify_bowling_strikerate);
		// System.out.println("Verified bowing strike rate " +
		// verify_bowling_strikerate);
		//
		// if (Convert_verify_bowling_strikerate == bowling_strikerate) {
		// System.out
		// .println("Test case passed, calculated the bowing strike rate" +
		// Convert_verify_bowling_strikerate);
		// } else {
		// System.out.println("Test case failed, Incorrect bowilng strike
		// rate");
		// }
		//
		// // Bowling economy verification
		//
		// String bowling_enconoy_rate =
		// driver.findElement(By.id("id_econ_text")).getText();
		// float verify_bowling_enconoy_rate =
		// Float.parseFloat(bowling_enconoy_rate);
		// System.out.println("Bowling economy verification" +
		// verify_bowling_enconoy_rate);
		//
		// if (verify_bowling_enconoy_rate == bowing_enconmy) {
		// System.out.println("Test cased passed, Verified bowling economy is "
		// + verify_bowling_enconoy_rate);
		// } else {
		//
		// System.out.println("Test case failed, Incorrect bowling strike
		// rate");
		// }
		//

		String BowilngScore = driver
				.findElement(By.xpath("//android.widget.TextView[@index=‘0’] OR [@id=‘id_bowling_score’])")).getText();
		System.out.println("Bowing summary" + BowilngScore);
	}
}
