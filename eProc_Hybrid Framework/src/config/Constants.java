package config;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Constants extends HttpServlet

{
	protected void doGet(HttpServletRequest request,HttpServletResponse response )
	{
	}
	
	//This is the list of System Variables
    //Declared as 'public', so that it can be used in other classes of this project
    //Declared as 'static', so that we do not need to instantiate a class object
    //Declared as 'final', so that the value of this variable can be changed
    // 'String' & 'int' are the data type for storing a type of value	
	public static final String URL = "https://nhaitesting.eproc.in/Product/publicDash";
	public static final String Path_TestData = "D:\\Selenium\\Selenium\\TMS_Hybrid Framework\\src\\dataEngine\\DataEngine.xlsx";
	public static final String File_TestData = "DataEngine.xlsx";
	public static final String Path_OR = "D:\\Selenium\\Selenium\\TMS_Hybrid Framework\\src\\config\\OR.properties";
 
	//List of Data Sheet Column Numbers
	public static final int Col_TestCaseID = 0;	
	public static final int Col_TestScenarioID =1 ;
	public static final int Col_PageObject =3 ;
	//This column is shifted from 3 to 4
	public static final int Col_ActionKeyword =4;
	public static final int Col_RunMode =2 ;
	public static final int Col_DataSet =5 ;
	


public static final int Col_Result =3 ;
public static final int Col_TestStepResult =6 ;



public static final String KEYWORD_FAIL = "FAIL";
public static final String KEYWORD_PASS = "PASS";
 
	//List of Data Engine Excel sheets
	public static final String Sheet_TestSteps = "Test Steps";
	 public static final String Sheet_TestCases = "Test Cases";
 
	// List of Test Data
	//public static final String UserName = "nhbyer1";
	//public static final String Password = "Singh@11";

}
