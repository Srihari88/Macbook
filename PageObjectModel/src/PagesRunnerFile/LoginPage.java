package PagesRunnerFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	//By login_link=By.className("");
	By Enter_username=By.cssSelector("#email");
	By Enter_Password=By.cssSelector("#pass");
	
	By Click_Submit=By.cssSelector("#u_0_q");
	
	public LoginPage(WebDriver driver1){
		
		this.driver=driver;
	}
	
	public void Submit_Login(){
		
		driver.findElement(Enter_Password).sendKeys("sriharinaidupudu@gmail.com");
		driver.findElement(Enter_Password).sendKeys("tejasrihari");
		driver.findElement(Click_Submit).click();
	}
	
	
	public void typeUsername(){
		driver.findElement(Enter_username).sendKeys("sriharinaidupudu@gmail.com");
	}
	
	public void typePassword(){
		driver.findElement(Enter_Password).sendKeys("tejasrihari");
	}
	
			
	public void clicksubmit(){
		driver.findElement(Click_Submit).click();
		}
	
	
}
