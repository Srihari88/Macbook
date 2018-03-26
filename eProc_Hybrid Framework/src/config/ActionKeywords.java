package config;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import static executionEngine.DriverScript.OR;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionKeywords 
 {
	
	public static WebDriver driver;
	static String parent="New NSWF User Control";
	
	static Set<String> windows;
	static Set<String> windows1;
	
	
	public void open_Browser(String object, String data) throws IOException
	{
		   
		System.setProperty("webdriver.ie.driver", "D:\\Selenium\\libs\\External_lib\\IEDriverServer_Win32_2.51.0\\IEDriverServer.exe");
		
		
		 DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		   capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
		   true);
		   
		  
		   driver = new InternetExplorerDriver();	
		
	}
	 public static void navigate(String object, String data) throws InterruptedException
	 {
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.get(Constants.URL);
		 driver.get(data);
		 try
		 {
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
		 }
		 catch(Exception e)
		 {
			 
		 }
		 Thread.sleep(5000);
	 }
	 public static void input_Username(String object, String data)
	 {
		 driver.findElement(By.cssSelector(OR.getProperty(object))).clear();
		 driver.findElement(By.cssSelector(OR.getProperty(object))).sendKeys(data);
	 }
	 public static void input_Password(String object, String data)
	 {
		 driver.findElement(By.id(OR.getProperty(object))).sendKeys(data);
	 }
	 public static void click_Login(String object, String data)
	 {
		 driver.findElement(By.xpath(OR.getProperty(object))).click();
	 }
	 public static void select_dsc(String object, String data) throws IOException
	 {
		Runtime.getRuntime().exec("D:\\Selenium\\Selenium\\TMS_Hybrid Framework\\Autoit_scripts\\selectdsc.exe");
		Runtime.getRuntime().exec("D:\\Selenium\\Selenium\\TMS_Hybrid Framework\\Autoit_scripts\\private_ex.exe");
 		 
	 }
	 
	 public static void waitFor(String object, String data) throws Exception
	 {
			Thread.sleep(15000);
	 }
	 public static void Tender_act_list(String object, String data)
	 {
		 driver.findElement(By.xpath(OR.getProperty(object))).click();
		 
	 }
	public static void Create_Tender_button(String object, String data)
	{
				
		driver.findElement(By.linkText(OR.getProperty(object))).click();
	}
			
	public void Tendor_num(String object, String data)
	{
				   
		driver.findElement(By.xpath(OR.getProperty(object))).sendKeys(data);
				   
	}
	public void Tendor_title(String object, String data)
	{
				   
		driver.findElement(By.name(OR.getProperty(object))).sendKeys(data);
				   
	}
	
	public void tendor_typ(String object, String data)
	   {
		   drop_down1("name", "strTndTypeId", "visibletext", data);
	   }
	public void procur_cat(String object, String data)
	   {
		   drop_down1("name" ,"selProcCategory", "visibletext", data);
		   
	   }
	  public void envolpe_typ(String object, String data)
	   {
		drop_down1("name", "strTndCateg","visibletext", data);
		   
	   }
	  public void estimited_val(String object, String data)
	   {
		   
		   driver.findElement(By.name(OR.getProperty(object))).sendKeys(data);
		   
	   }
	      
	   public void section_name(String object, String data)
	   {
		   drop_down1("id", "subDivision","visibletext", data);
		   
	   }
	   
	   public void eval_typ(String object, String data)
	   {
		   drop_down1("name", "strTndEmdAppId","visibletext", data);
		   
	   }
	   
	   public void allocated_budget(String object, String data)
	   {
		   
		   driver.findElement(By.name(OR.getProperty(object))).sendKeys(data);
		   
	   }
	      
	   public void save(String object, String data)
	   {
		   driver.findElement(By.id(OR.getProperty(object))).click();
	   }
	   
	   
	   public void Tendor_des(String object, String data)
	   {
		 try
		 {
		  WebElement fr=driver.findElement(By.id("bottomframe"));
		   driver.switchTo().frame(fr);
		   driver.findElement(By.xpath(OR.getProperty(object))).sendKeys(data);
		 }
		 catch(Exception e)
		 {
			 
		 }
		   		   
	    }
	   
	   public void upload_img_pic(String object, String data)
	   {
		   driver.switchTo().defaultContent();
		   
		   driver.switchTo().frame(0);
		   
	  	 driver.findElement(By.xpath(OR.getProperty(object))).click();
	  	
	   }
	   
	  
	   public  void upload_pricebid_doc(String object, String data) throws IOException, InterruptedException
	   { 
		   
		   try
		   {
		   windows=driver.getWindowHandles();
		    
		    for (String win:windows)
		    {
		    	driver.switchTo().window(win);
		    }	
		    	String title=driver.getTitle();
		    	System.out.println(title);
		    	
		  if(title.equalsIgnoreCase("New NSWF User Control"));
		  
		   Thread.sleep(4000);
		   Actions action = new Actions(driver);
		   WebElement element=driver.findElement(By.xpath(OR.getProperty(object)));
		   action.doubleClick(element).perform();
	  	   System.out.println("Inside price bid2");
	  	   Thread.sleep(10000);
	  	  
		   windows=driver.getWindowHandles();
		    
		    for (String win:windows)
		    {
		    	driver.switchTo().window(win);
		    }	
		    	String title1=driver.getTitle();
		    	System.out.println(title1);
		    	
		    	
		    	if(title.equalsIgnoreCase("Document Upload"))
		    	{
			       WebElement web=driver.findElement(By.name("uploadfile"));
			       Thread.sleep(2000);
			       web.sendKeys(data);
			       driver.findElement(By.id("Submit1")).click();
			
			
			 try{
	    	    	Alert_accept();
	    	    }
	    	    
	    	    catch (NoAlertPresentException e)
	    	    {
	    	    	System.out.println(e);
	    	    }
			 Runtime.getRuntime().exec("D:\\Selenium\\Selenium\\TMS_Hybrid Framework\\Autoit_scripts\\selectdsc.exe");
			 Runtime.getRuntime().exec("D:\\Selenium\\Selenium\\TMS_Hybrid Framework\\Autoit_scripts\\private_ex.exe");
	    		 
		 		Thread.sleep(25000);
	    		try
	    		{
		    		Alert_accept();
	    	    }
	    	    
	    	    catch (NoAlertPresentException e)
	    	    {
	    	    	System.out.println(e);
	    	    }
	    		
	    		close();
		    	}
		   }
		   catch(Exception e)
		   {
			   
			   
		   }
	}
		    	
	   
	   
	   
	   public void browse_button(String object, String data) throws InterruptedException, IOException
	   {
		   String winHandleBefore = driver.getWindowHandle();
		   System.out.println("Current handle is: "+winHandleBefore);
		   Thread.sleep(3000);
		   windows=driver.getWindowHandles();
		   windows.remove(winHandleBefore); 
		    
		    for (String win:windows)
		    {
		    	driver.switchTo().window(win);
		    }	
		    	String title=driver.getTitle();
		    	System.out.println(title);
		    	
		    	if(title.equalsIgnoreCase("Upload Document"));
		    	
		    	{
		    		
		    		 Thread.sleep(5000);
			       WebElement web=driver.findElement(By.id(OR.getProperty(object)));
			       Thread.sleep(2000);
			       web.sendKeys(data);
			       driver.findElement(By.id("Submit1")).click();
			
			
			 try{
	    	    	Alert_accept();
	    	    }
	    	    
	    	    catch (NoAlertPresentException e)
	    	    {
	    	    	System.out.println(e);
	    	    }
			 Runtime.getRuntime().exec("D:\\Selenium\\Selenium\\TMS_Hybrid Framework\\Autoit_scripts\\selectdsc.exe");
			 Runtime.getRuntime().exec("D:\\Selenium\\Selenium\\TMS_Hybrid Framework\\Autoit_scripts\\private_ex.exe");
	    		 
		 		Thread.sleep(25000);
	    		try
	    		{
	    			Thread.sleep(5000);
		    		Alert_accept();
	    	    }
	    	    
	    	    catch (NoAlertPresentException e)
	    	    {
	    	    	System.out.println(e);
	    	    }
	    		WebDriverWait wait=new WebDriverWait(driver, 20);
	    		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Close")));
	    		close();
	    				    	
	    	}
		    	 try{
		    	        Thread.sleep(7000);
		    	       }
		    	 catch(InterruptedException e){
		    	        System.out.println("Caught exception related to sleep:"+e.getMessage());
		    	       }
                      Thread.sleep(5000);
		    	    driver.switchTo().window(winHandleBefore); // Switching back to parent window

		    	     System.out.println("NOW THE CURRENT Handle is: "+driver.getWindowHandle());
		    	
	   }
	   
	   
	   public void value_quotedval(String object, String data) throws InterruptedException
	    {
		  
		   String title=driver.getTitle();
			    	
		   WebElement fr=driver.findElement(By.id("bottomframe"));
		  driver.switchTo().frame(fr);
			    	
		if(title.equalsIgnoreCase("New NSWF User Control"));
			    	{
		   List<WebElement> oCheckBox = driver.findElements(By.name("tBondRadio"));
		   		   
		   int iSize = oCheckBox.size();
		   for(int i=0; i < iSize ; i++ )
		   {
		   
		  	 String sValue = oCheckBox.get(i).getAttribute("value");
		  	 System.out.println(sValue);
		   
		  	 if (sValue.equalsIgnoreCase("2"))
		  	 {
		   		  		 oCheckBox.get(i).click();  
		  		 break;
		   
		  		 }
		   }
		  
	}  }	
			    	
		  
	   
	   public void value_amnt(String object, String data)
	   {
		   try
		   {
			   driver.switchTo().window("New NSWF User Control");
			   WebDriverWait wait = new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe")));
		  
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("tBondAmount")));
			driver.findElement(By.name("tBondAmount")).sendKeys("200");
		   }
		   catch(Exception e)
		   {
			   
		   }
	   }
	   
	  
	   public void payableAt(String object, String data)
	   {
		   driver.findElement(By.name("payableAt")).sendKeys(data);
	   }
	   public void emd_pay_disable(String object, String data)
	   {
		   driver.findElement(By.name("tBondApplicable")).click();
	   }
	   public void application_fee(String object, String data)
	   {
		   driver.findElement(By.name("tFeeAmount")).sendKeys(data);
	   }
	   
	   public void inFavourOf (String object, String data)
	   {
		   driver.findElement(By.name("inFavourOf")).sendKeys(data);
	   }
	   
	 
	   public void  sales_start_date(String object, String data) throws InterruptedException
	   {
		   driver.findElements(By.tagName("img")).get(8).click();
		   date_selection("January","12","03","01");
		 //No need to edit sale date
	   }
	  
	   public void  sales_end_date(String object, String data) throws InterruptedException
	   {
		    Thread.sleep(3000);
		    driver.switchTo().defaultContent();
		    WebDriverWait wait = new WebDriverWait(driver, 20);
		    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe")));
		    driver.findElements(By.tagName("img")).get(9).click();
		    wait.until(ExpectedConditions.numberOfwindowsToBe(2));
		    
		    try{
		   date_selection("January","12","21","01");
		 //No need to edit sale date
		    }
		catch(NoSuchWindowException e)
		    
		    {
		    	
		    }  
	   }
	      
	 public void tendor_dates(String object, String data) throws InterruptedException
	   {
		   System.out.println(driver.getTitle());
           String winHandleBefore = driver.getWindowHandle();
		   System.out.println("Current handle is1: "+winHandleBefore);
		   Thread.sleep(3000);
		   windows=driver.getWindowHandles();
		   windows.remove(winHandleBefore);
	       WebDriverWait wait=new WebDriverWait(driver,20);
		   driver.findElements(By.tagName("img")).get(8).click();
	       wait.until(ExpectedConditions.numberOfwindowsToBe(2));
	       try
	       {
	   	date_selection("January","10","10","31");
	   	 
	       }
	       
	       catch(NoSuchWindowException e)
	       
	       {
	       	
	       }
	          
	       driver.switchTo().window(winHandleBefore);
	       wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe")));
	       driver.findElements(By.tagName("img")).get(9).click();
	       wait.until(ExpectedConditions.numberOfwindowsToBe(2));
	       try{
	       	date_selection("January","10","40","31");
	       	
	       }
	     catch(NoSuchWindowException e)
	       
	       {
	       	
	       }
	    
	       driver.switchTo().window(winHandleBefore);
	       wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe")));
	       driver.findElements(By.tagName("img")).get(10).click();
	       wait.until(ExpectedConditions.numberOfwindowsToBe(2));
	       try{
	       	date_selection("January","10","10","31");
	       	
	       }
	     catch(NoSuchWindowException e)
	       
	       {
	       	
	       }

	       driver.switchTo().window(winHandleBefore);
	       wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe")));
	       driver.findElements(By.tagName("img")).get(11).click();
	       wait.until(ExpectedConditions.numberOfwindowsToBe(2));
	       try{
	       	date_selection("January","10","40","31");
	       	
	       }
	     catch(NoSuchWindowException e)
	       
	       {
	       	
	       }

	       driver.switchTo().window(winHandleBefore);
	       wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe")));
	       driver.findElements(By.tagName("img")).get(12).click();
	       wait.until(ExpectedConditions.numberOfwindowsToBe(2));
	       try{
	       	date_selection("January","10","11","31");
	       	
	       }
	    catch(NoSuchWindowException e)
	       
	       {
	       	
	       }
           driver.switchTo().window(winHandleBefore);
	       wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe")));
	       driver.findElements(By.tagName("img")).get(13).click();
	       wait.until(ExpectedConditions.numberOfwindowsToBe(2));
	       try{

	       
	       	date_selection("January","10","41","31");
	      
	       }
	    catch(NoSuchWindowException e)
	       
	       {
	       	
	       }


	       driver.switchTo().window(winHandleBefore);
	       wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe")));
	       driver.findElements(By.tagName("img")).get(14).click();
	       wait.until(ExpectedConditions.numberOfwindowsToBe(2));
	       try{
	       	date_selection("January","10","42","31");
	       	
	       }
	   catch(NoSuchWindowException e)
	       
	       {
	       	
	       }
	       Thread.sleep(3000);
	       Set<String> winds=  driver.getWindowHandles();
	       if(winds.size()==2)
	       {
	       	  JavascriptExecutor jsx=(JavascriptExecutor)driver;
	       	  jsx.executeScript("window.confirm('There is some issue. please select dates manually (you have 50 seconds) ');");
	     
	       	  
	       	  Thread.sleep(50000);
	       }
	       driver.switchTo().window(winHandleBefore);
	       wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe")));
	   }
	
	   
	   public void prebid_clarif(String object, String data)
	   {
		   if(data.equalsIgnoreCase("online"))
		   {
			   driver.findElements(By.name("preBidClarificationRadio")).get(0).click();
		   }
		   if(data.equalsIgnoreCase("offline"))
		   {
			   driver.findElements(By.name("preBidClarificationRadio")).get(1).click();
		   }
		     
	   }
	   
	   
	   public void tender_save(String object, String data) throws InterruptedException
	   {
		   driver.findElement(By.cssSelector("input#btnSave")).click();
		   Thread.sleep(5000);
	   }
	  
	   public void define_item(String object, String data) throws InterruptedException
	   {
		 String winHandleBefore = driver.getWindowHandle();
		   System.out.println("Current handle is1: "+winHandleBefore);
		   Thread.sleep(3000);
		   windows=driver.getWindowHandles();
		   windows.remove(winHandleBefore);
		 driver.switchTo().window(winHandleBefore);
		 driver.findElement(By.cssSelector("span#TabId2")).click();
		 WebDriverWait wait= new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe")));
	   }
	 public void price_bid_format(String object, String data)
		{
			drop_down1("name", "selItemType", "visibletext", data);
			
		}
	 public void choose_action(String object, String data)
		{
			drop_down1("id", "actionsCombo", "visibletext", data);
		}
	 public void num_items(String object, String data) throws InterruptedException
		{
		 Set<String> windows = driver.getWindowHandles();
			for(String win: windows)
			{
			driver.switchTo().window(win);
			if(driver.getTitle().equals("Add TenderItem From Adhoc"))
			{
			driver.findElement(By.name("noOfItemRows")).sendKeys("3");
			Thread.sleep(4000);
			//driver.findElement(By.linkText("OK")).click();
			
			List<WebElement> li= driver.findElements(By.id("btnItemList"));
			int li_size=li.size();
			 for(int i=0; i<=li_size;i++)
			 {
				 String str=li.get(i).getAttribute("value");
				if(str.equalsIgnoreCase("OK"))
				{
					li.get(i).click();
					break;
				}
			 }
			
			}
			}
		}
	 public void ok_button (String object, String data) throws InterruptedException
		{
		 try
		 {
		 Thread.sleep(4000);
		 Set<String> windows = driver.getWindowHandles();
			for(String win: windows)
			{
			driver.switchTo().window(win);
			if(driver.getTitle().equals("Add TenderItem From Adhoc"))
			{
			driver.findElement(By.xpath("//input[@id='btnItemList']//input[@value='OK']")).click();
			}}
		 }
		 catch(Exception e)
		 {
			 
		 }
		}
	 public void fill_item_desc(String object, String data)
		{
		 String winHandleBefore = driver.getWindowHandle();
		   System.out.println("Current handle is1: "+winHandleBefore);
		   
		   windows=driver.getWindowHandles();
		   windows.remove(winHandleBefore);
		 driver.switchTo().window(winHandleBefore);
		 WebDriverWait wait= new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe")));
			List<WebElement> li=driver.findElements(By.xpath("//input[starts-with(@name, 'ITEMDESCRIPTION')]"));
			for(int i=0;i<li.size();i++)
			{
				li.get(i).sendKeys("item");
			}
			
		
			
		}
	 public void fill_details(String object, String data)
		{
			
			List<WebElement> li=driver.findElements(By.xpath("//textarea[starts-with(@name, 'REMARKS')]"));
			for(int i=0;i<li.size();i++)
			{
				li.get(i).sendKeys("for sale");
				
			}
			
			
			List<WebElement> li1=driver.findElements(By.xpath("//textarea[starts-with(@name, 'REMARKS1')]"));
			for(int i=0;i<li1.size();i++)
			{
				li1.get(i).sendKeys("OK");
			}
			
		}
		
		public void save_define_item(String object, String data)
		{
			driver.findElement(By.name("btnSaveMultipleItems")).click();
			
		}
	   
		
		public void add_tendor_form(String object, String data)
		{
			String winHandleBefore = driver.getWindowHandle();
			   System.out.println("Current handle is1: "+winHandleBefore);
			   
			   windows=driver.getWindowHandles();
			   windows.remove(winHandleBefore);
			   driver.switchTo().window(winHandleBefore);
		}
		public void  Add_tender_form(String object, String data) throws InterruptedException
		{
			driver.findElement(By.cssSelector("span#TabId3")).click();
			Thread.sleep(50000);
		}
		
		
		public void attach_form_button(String object, String data)
		{
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe")));
			
			List<WebElement> li=driver.findElements(By.id("actionBidCommDef"));
	   
	       for(int i=0;i<li.size();i++)
		      {
  
			String str=li.get(i).getAttribute("title");
			
			if(str.equalsIgnoreCase("Attach Forms")) 
			{
				System.out.println("Pass1");
				li.get(i).click();
				System.out.println("Pass2");
				break;
				
				}
				
			}
		}
		
		public void proceed(String object, String data) throws InterruptedException, IOException
		{
			String winHandleBefore = driver.getWindowHandle();
			   System.out.println("Current handle is1: "+winHandleBefore);
			   
			  windows=driver.getWindowHandles();
			  windows.remove(winHandleBefore);
			 driver.switchTo().window(winHandleBefore);
			 driver.findElement(By.cssSelector("spAN#procd")).click();
			 Alert_accept();	
			 Thread.sleep(2000);
			
	  JavascriptExecutor jsx=(JavascriptExecutor)driver;
	  jsx.executeScript("window.confirm('pls write in editor and click on add(you have 30 seconds) ');");
	  Runtime.getRuntime().exec("D:\\Selenium\\Selenium\\TMS_Hybrid Framework\\Autoit_scripts\\selectdsc.exe");
	    
	  
	  Thread.sleep(30000);
	  
   String parent=driver.getWindowHandle();
   windows=driver.getWindowHandles();
   windows.remove(parent);
   driver.switchTo().window(parent);
	  
	  
	  for(;;)
	  {
			driver.findElement(By.cssSelector("spAN#hrefopt0")).click();
			
		try{
			Alert_accept();
			break;
		}
		
		catch(NoAlertPresentException e)
		{
			
		}
			
	    }
	}	
	public void assign_opener(String object, String data) throws IOException, InterruptedException 
		{
			
		    
		    try
		    {
		    	dashboard();
				drop_down1("name", "Change_ROLEID", "visibletext", "Tender Approver");
		    }
		    catch(StaleElementReferenceException e)
		    {
		    	dashboard();
				drop_down1("name", "Change_ROLEID", "visibletext", "Tender Approver");
		    }
			
			Alert_accept();
			try
			{
			String num = null;
			tendor_num(num);
			search();
			Thread.sleep(5000);
			first_tendor();
			}
			catch(Exception e)
			{
				first_tendor();
			}
			Thread.sleep(3000);
			tendor_creation_button();
			
			save1();
			try
			{
				Thread.sleep(3000);
				WebDriverWait wait=new WebDriverWait(driver,20);
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe")));
				save1();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		   try
		   {
	      WebDriverWait wait=new WebDriverWait(driver,20);
			
	      System.out.println("Pre release tender");
			
			String winHandleBefore = driver.getWindowHandle();
	       System.out.println("Current handle is1: "+winHandleBefore);
	   
	       windows=driver.getWindowHandles();
	       windows.remove(winHandleBefore);
	       driver.switchTo().window(winHandleBefore);
	       Thread.sleep(2000);
		   release_tendor();
		   
		   System.out.println("Post release tender");
		  
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe")));
			
			release_tendor_final();
			Runtime.getRuntime().exec("D:\\Selenium\\Selenium\\TMS_Hybrid Framework\\Autoit_scripts\\selectdsc.exe");
			Runtime.getRuntime().exec("D:\\Selenium\\Selenium\\TMS_Hybrid Framework\\Autoit_scripts\\private_ex.exe");
						
			String winHandleBefore1 = driver.getWindowHandle();
			   System.out.println("Current handle is1: "+winHandleBefore);
			   
			   windows=driver.getWindowHandles();
			   windows.remove(winHandleBefore1);
			 driver.switchTo().window(winHandleBefore1);
			 System.out.println(" Before Proceed click");
			
			 List<WebElement> li= driver.findElements(By.tagName("span"));
			 System.out.println(li.size());
			 li.get(5).click();
			 			
			 System.out.println(" After Proceed click");
			 
			Thread.sleep(2000);
			Alert_accept();
			logout();
		   }
		   catch(Exception e)
		   {
			   System.out.println(e.getMessage());
		   }
			
			try
			{
			drop_down1("id", "userListPB", "visibletext", "[eybuyer1] eybuyer1");
			send();
			drop_down1("id", "userListPB", "visibletext", "[eybuyer2] eybuyer2");
			send();
			}
			catch(NoSuchElementException e)
			{
				
			}
			
		}
	
	  
	  
	  public void alternate_opner() throws IOException
		{
			try
			{
		    driver.switchTo().window("New NSWF User Control");
		    assign_alternate_openers();
		    WebDriverWait wait=new WebDriverWait(driver, 20);
		    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe")));
		    drop_down1("name", "userListPBeybuyer1", "visibletext", "eybuyer4[eybuyer4]");
		    drop_down1("name", "userListPBeybuyer2", "visibletext", "eybuyer5[eybuyer5]");
		   save1();
			}
			catch(Exception e)
			{
			}
			finally
			{
		   // Boolean acc_res=Element_Chk_Assertion.element_assert(driver, "class", "Success_Msg");
			//AssertJUnit.assertTrue(true);
			//driver.switchTo().window("New NSWF User Control");
			release_tendor();
			 WebDriverWait wait=new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe")));
			release_tendor_final();
			Runtime.getRuntime().exec("D:\\Selenium\\Selenium\\TMS_Hybrid Framework\\Autoit_scripts\\selectdsc.exe");
			Runtime.getRuntime().exec("D:\\Selenium\\Selenium\\TMS_Hybrid Framework\\Autoit_scripts\\private_ex.exe");
	
			//Boolean acc_res1=Element_Chk_Assertion.element_assert(driver, "class", "Success_Msg");
			//AssertJUnit.assertTrue(acc_res1);
			driver.switchTo().window("New NSWF User Control");
			driver.findElement(By.id("hrefopt0")).click();
			Alert_accept();
			logout();
					
			}
		  	
		}
	  
	  //BIDDER BIDDING START
	  public void create_Tender_list(String object, String data)
	  {
			
			driver.findElement(By.linkText(OR.getProperty(object))).click();
		}
	  public static void tender_list(String object, String data)
		 {
			 driver.findElement(By.xpath(OR.getProperty(object))).click();
			 
		 }
	  public static void tender_tit_radio(String object, String data)
		 {
		  
		  List<WebElement> li=driver.findElements(By.xpath(OR.getProperty(object)));
		  li.get(1).click();
			 //driver.findElement(By.xpath(OR.getProperty(object))).click();
			 
		 }
	  public static void tender_title(String object, String data)
		 {
		  
			 driver.findElement(By.id(OR.getProperty(object))).sendKeys(data);
			 
		 }
	  public static void search_click(String object, String data) throws InterruptedException
		 {
		  
			 driver.findElement(By.xpath(OR.getProperty(object))).click();
			 Thread.sleep(3000);
			 
		 }
	  public static void upload_tender_doc(String object, String data)
		 {
		  

      driver.findElement(By.cssSelector("span.TabId1")).click();
			 
		 }
	  public static void tender_action(String object, String data)
		 {
		  
		  List<WebElement> li=driver.findElements(By.xpath(OR.getProperty(object)));
		  li.get(3).click();
			 
		 }
	  public static void proceed_bidding(String object, String data)
	  {
		  WebDriverWait wait=new WebDriverWait(driver, 300);
		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(OR.getProperty(object)))));
		  driver.findElement(By.cssSelector(OR.getProperty(object))).click();
	  }
	  
	  public void exampt_flag_ammount(String object, String data) throws InterruptedException
		{
		  WebDriverWait wait=new WebDriverWait(driver, 20);
		  try
		  {
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe")));
		  }
		  catch(Exception e)
		  {
			  System.out.println(e.getMessage());
		  }
			System.out.println("Pass");
			driver.findElement(By.id("radio1")).click();
			System.out.println("Pass1");
			/*if (value.equalsIgnoreCase("exempted"))
			{
			driver.findElements(By.cssSelector("input#radio1")).get(0).click();
			}
			
			if (value.equalsIgnoreCase("amount"))
			{
			driver.findElements(By.cssSelector("input#radio1")).get(1).click();
			}	*/	
			
			
			try
			{
			Alert_accept();
			}
			catch(NoAlertPresentException e)
			{
				
			}
			
			drop_down1("name", "PayMod", "visibletext", "Draft Payment");
			//Thread.sleep(1000);
      //	Drop_down.drop_down1("name", "currency", "visibletext", "Indian Rs");
			
			driver.findElements(By.tagName("img")).get(1).click();
			
			amount("2000");
			
			try{
			
			inst_date_button();
			}
			catch(InvalidSelectorException e)
			{
				
			}
			//date_selection("June", "00", "39", "14");
			//date_selection("September", "00", "39", "14");
			
			
			   String winHandleBefore = driver.getWindowHandle();
			   System.out.println("Current handle is1: "+winHandleBefore);
			   Thread.sleep(3000);
			   windows=driver.getWindowHandles();
			   windows.remove(winHandleBefore);
		      // WebDriverWait wait=new WebDriverWait(driver,20);
			   driver.findElements(By.tagName("img")).get(0).click();
		       wait.until(ExpectedConditions.numberOfwindowsToBe(2));
		       try
		       {
		    	   Thread.sleep(3000);
		   	date_selection("January","12","50","23");
		   	
		       }
		       
		       catch(NoSuchWindowException e)
		       
		       {
		       	
		       }
		       
	         
		       driver.switchTo().window(winHandleBefore);
		       wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe")));
		       driver.findElements(By.tagName("img")).get(1).click();
		       wait.until(ExpectedConditions.numberOfwindowsToBe(2));
		       try{
		       	//date_selection("January","12","56","23");
		       	Thread.sleep(10000);
		       	
		       }
		   catch(NoSuchWindowException e)
		       
		       {
		       	
		       }
		       driver.switchTo().window(winHandleBefore);
		       wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe")));
			
		}
	  public void bank_name(String object, String data) throws InterruptedException
	  {
		  
		  driver.findElement(By.name("INSTRUMENTISSUER")).sendKeys("1000");
	  }
	  public void bank_draftno(String object, String data)
	  {
		  driver.findElement(By.name("INSTRUMENTNO")).sendKeys("W123");
	  }
	  public void amount(String amnt)
		{
			driver.findElement(By.name("AMOUNT")).sendKeys(amnt);
			
		}
	 
	  public void bid_save(String object, String data) throws InterruptedException
	  {
		  driver.findElement(By.name("btnSave")).click();
		  Thread.sleep(3000);
		  Alert_accept();	
	  }
	  public void bid_proceed(String object, String data) throws InterruptedException
	  {
		  driver.switchTo().defaultContent();
		 
		  driver.findElement(By.cssSelector("span#procd")).click();
		  
		  Thread.sleep(7000);
		  Alert_accept();	
	  }
	  public void bid_proceed1(String object, String data) throws InterruptedException
	  {
		  String winHandleBefore = driver.getWindowHandle();
		   System.out.println("Current handle is1: "+winHandleBefore);
		   Thread.sleep(3000);
		   windows=driver.getWindowHandles();
		   windows.remove(winHandleBefore);
		 driver.switchTo().window(winHandleBefore);
		 driver.findElement(By.cssSelector("span#procd")).click();
		Thread.sleep(5000);
		 //WebDriverWait wait= new WebDriverWait(driver,20);
		 //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe")));
		Alert_accept();
	  }
	  public void inst_date_button()
		{
			List<WebElement>li= driver.findElements(By.xpath("//table[@id='OffLinePay']//img"));
			for(int i=0;i<=li.size(); i++)
			{
			li.get(i).click();
			break;
			}
			
			//driver.findElement(By.xpath(tr[3]/td[2]/a/img))
		}
	  
	  public void price_bid(String object, String data) throws InterruptedException
		 {
			 String winHandleBefore = driver.getWindowHandle();
			   System.out.println("Current handle is1: "+winHandleBefore);
			   Thread.sleep(3000);
			   windows=driver.getWindowHandles();
			   windows.remove(winHandleBefore);
			 driver.switchTo().window(winHandleBefore);
			 driver.findElement(By.cssSelector("span#TabId2")).click();
			 WebDriverWait wait= new WebDriverWait(driver,20);
			 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe")));
		 }
	  public void select_action(String object, String data)
	  {
		  List<WebElement> li=driver.findElements(By.tagName("img"));
		  li.get(1).click();  
	  }
	  public void enter_quotedvalue(String object, String data)
	  {
		  driver.findElement(By.id("A920_1_BASERATE1")).sendKeys("10");
		  driver.findElement(By.id("A920_2_BASERATE1")).sendKeys("11");
		  /*List<WebElement> li=driver.findElements(By.className("td_underline"));
		  
		  for(int i=0;i<=li.size();i++)
		  {
			  String str=li.get(i).getAttribute("title");
			  if(str.equals("required"))
			  {
				  li.get(i).sendKeys("200");
			  }
			  
		  }*/
		 
	  }
	  public void calculate(String object, String data)
	  {
		  driver.findElement(By.id("calBtn")).click();
		  
	  }
	  public void sign_btn(String object, String data)
	  {
		  driver.findElement(By.id("sign_btn")).click();
		  
	  }
	  
	  public void accept_vender(String object, String data) throws InterruptedException
	  {
		  String winHandleBefore = driver.getWindowHandle();
		   System.out.println("Current handle is1: "+winHandleBefore);
		   Thread.sleep(3000);
		   windows=driver.getWindowHandles();
		   windows.remove(winHandleBefore);
		 driver.switchTo().window(winHandleBefore);
		 WebDriverWait wait= new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe")));
		  driver.findElement(By.cssSelector("input.button_all")).click();
		  
	  }
	  
	  public void action_envelop(String object, String data) throws InterruptedException
	  {
		  String winHandleBefore = driver.getWindowHandle();
		   System.out.println("Current handle is1: "+winHandleBefore);
		   Thread.sleep(3000);
		   windows=driver.getWindowHandles();
		   windows.remove(winHandleBefore);
		 driver.switchTo().window(winHandleBefore);
		 WebDriverWait wait= new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe")));
		  List<WebElement> li=driver.findElements(By.tagName("img"));
		  for(int i=0; i<=li.size();i++)
		  {
			  String str=li.get(i).getAttribute("title");
			  if(str.equals("Submission Envelope"))
			  {
				  li.get(i).click();
				  break;
			  }
		  }
		 
	  }
	  public void verify_envelop(String object, String data) throws InterruptedException
	  {
		   String winHandleBefore = driver.getWindowHandle();
		   System.out.println("Current handle is1: "+winHandleBefore);
		   Thread.sleep(3000);
		   windows=driver.getWindowHandles();
		   windows.remove(winHandleBefore);
		   driver.switchTo().window(winHandleBefore);
		 WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe")));
		  driver.findElement(By.cssSelector("input#save_btn")).click();
	  }
	  public void action_envelop_submission(String object, String data)
	  {
		  WebDriverWait wait= new WebDriverWait(driver,20);
		  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe")));
		  List<WebElement> li=driver.findElements(By.tagName("img"));
		  li.get(4).click();
	  }
	  public void envelop_bid_sign(String object, String data) throws InterruptedException
	  {
		  String winHandleBefore = driver.getWindowHandle();
		   System.out.println("Current handle is1: "+winHandleBefore);
		   Thread.sleep(3000);
		   windows=driver.getWindowHandles();
		   windows.remove(winHandleBefore);
		   driver.switchTo().window(winHandleBefore);
		   driver.findElement(By.cssSelector("span#TabId2")).click();
		 WebDriverWait wait= new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe")));
		  
		  
	  }
	  
	  public void cnfrm_pwd1(String object, String data) throws InterruptedException
	  {
		  //inside frame
		  String winHandleBefore = driver.getWindowHandle();
		   System.out.println("Current handle is1: "+winHandleBefore);
		   Thread.sleep(3000);
		   windows=driver.getWindowHandles();
		   windows.remove(winHandleBefore);
		 driver.switchTo().window(winHandleBefore);
		 WebDriverWait wait= new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe")));
		  driver.findElement(By.id("passwordPB")).sendKeys("Singh@22");
	  }
	  public void cnfrm_pwd2(String object, String data)
	  {
		  //inside frame
		  List<WebElement> li= driver.findElements(By.id("passwordTQ"));
		  li.get(1).sendKeys("tender");
		  
	  }
	  public void vendor_undertaken(String object, String data) throws InterruptedException
	  {
		  String winHandleBefore = driver.getWindowHandle();
		   System.out.println("Current handle is1: "+winHandleBefore);
		   Thread.sleep(3000);
		   windows=driver.getWindowHandles();
		   windows.remove(winHandleBefore);
		 driver.switchTo().window(winHandleBefore);
		 driver.findElement(By.cssSelector("span#TabId1")).click();
		 driver.switchTo().defaultContent();
		 //WebDriverWait wait= new WebDriverWait(driver,20);
		 //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe")));
	  }
	  public static void alert_accept(String object, String data)
	   {
		Alert simpleAlert1 = driver.switchTo().alert();
		simpleAlert1.accept();
	   }
	  public void confrm_pass_click(String object, String data) throws InterruptedException
	  {
		  String winHandleBefore = driver.getWindowHandle();
		   System.out.println("Current handle is1: "+winHandleBefore);
		   Thread.sleep(3000);
		   windows=driver.getWindowHandles();
		   windows.remove(winHandleBefore);
		 driver.switchTo().window(winHandleBefore);
		 WebDriverWait wait= new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("bottomframe"))); 
		 driver.findElement(By.id("btnSubmit")).click();
	  }
	  
		//BIDDER BIDDING END
	 
	  public void assign_alternate_openers()
	   {
		   
		   driver.findElement(By.cssSelector("span#TabId2")).click();
	   }
	   
	   public void release_tendor()
	   { 
		   driver.findElement(By.xpath(".//*[@id='TabId2']")).click();
	   }
	   public static void logout()
		{
			driver.findElement(By.cssSelector("a.tblheader")).click();
		}
	   public void assign_openers()
	   {
		   
		   driver.findElement(By.cssSelector("span#TabId1")).click();
	   }
	  
	   public void send()
		{
			driver.findElement(By.name("send")).click();
		}
		
		public void save1()
		{
			driver.findElement(By.name("btnSave")).click();
		}
		
		
		public void release_tendor_final()
		{
			driver.findElement(By.name("load")).click();
		}
	  public void tendor_creation_button()
		{
			java.util.List<WebElement> li= driver.findElements(By.tagName("img"));
			for(int i=0;i<li.size();i++)
			{
				String tit=li.get(i).getAttribute("title");
				if(tit.equals("Tender Creation"))
				{
					li.get(i).click();
					break;
				}
				
			} }
		

	  public void first_tendor()
		{
			java.util.List<WebElement> li= driver.findElements(By.tagName("img"));
			for(int i=0;i<li.size();i++)
			{
				String tit=li.get(i).getAttribute("title");
				if(tit.equals("Tender Buyer DashBoard"))
				{
					li.get(i).click();
					break;
				}
				
			} }
			
			
	  
	  public static void tendor_num(String num)
		{
			driver.findElement(By.id("searchByTenderNoId")).sendKeys(num);
		}
	  public static void search()
		{
			driver.findElement(By.id("btnSearchId")).click();
		}

		
	  public static void dashboard()
		{
			driver.findElement(By.cssSelector("span.Tblheader")).click();
		}
	  public static void dashboard_bid(String object, String data) throws InterruptedException
		{
		  Thread.sleep(3000);
			driver.findElement(By.cssSelector("span.Tblheader")).click();
		}

	  public static void  drop_down1(String locator , String locator_value, String selectby , String value )
	   {
		if (locator.equalsIgnoreCase("id"))
				{
		Select drp =new Select(driver.findElement(By.id(locator_value)));
		
		if (selectby.equalsIgnoreCase("visibletext"))
		{
		
		drp.selectByVisibleText(value);
		}
		
		else if  (selectby.equalsIgnoreCase("value"))
		{
			drp.selectByValue(value);
		}
		
   }
		
		if (locator.equalsIgnoreCase("name"))
		{
         Select drp =new Select(driver.findElement(By.name(locator_value)));

           if (selectby.equalsIgnoreCase("visibletext"))
               {

                  drp.selectByVisibleText(value);
               }

          else if  (selectby.equalsIgnoreCase("value"))
            {
	         drp.selectByValue(value);
            }

     }
			
	}
	public static void Alert_accept()
	   {
		Alert simpleAlert1 = driver.switchTo().alert();
		simpleAlert1.accept();
	   }
	public void close()
	   {
		   driver.findElement(By.name("Close")).click();
	   }
	
	public  static void date_selection(String month , String HH , String MM, String date ) 
	{
		 windows1=driver.getWindowHandles();
		
		for(String win : windows1)
		{
		
			driver.switchTo().window(win);
			System.out.println(win);
			
		if(driver.getTitle().equals("C1India DateTime Picker(Eng)"))
		{
			
		 drop_down1("name","MonthSelector" , "visibletext", month);
		 drop_down1("name","hrlist" , "visibletext", HH);
		 drop_down1("name","mnlist" , "visibletext", MM);
	     List<WebElement> lit = driver.findElements(By.tagName("a"));
	     for(int i=0;i<lit.size();i++)
	     {
	    	if (lit.get(i).getText().equals(date))
	    			
	    	{
	    		lit.get(i).click();
	    		break;
	  		}
	     }}}}} 

	 


