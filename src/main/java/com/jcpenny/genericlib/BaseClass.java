package com.jcpenny.genericlib;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;




/** 
 * @author Ansu
 */
public class BaseClass {
	
	
	
	/*Global Objects*/
	public static WebDriver driver;  
    public FileLib fLib = new FileLib();

	@BeforeClass
	public void configBC() throws Throwable{
		 System.out.println("launch the Browser");
		 /*read browser name from properties File*/
		  String BROWSERNAME = fLib.getPropertyKeyValue("browser");
		  if(BROWSERNAME.equals("firefox")){
              driver = new FirefoxDriver();	
		  }else if(BROWSERNAME.equals("chrome")){
			  driver = new ChromeDriver();
		  }/*else if(BROWSERNAME.equals("ie")){
			  driver = new InternetExplorerDriver();
		  }*/
		  else{
              driver = new FirefoxDriver();	
		  }
	}
	
	@BeforeMethod
	public void configBM() throws Throwable{
		 System.out.println("Login to application");
		 /*read URL , username , password  from properties File*/
		 String URL =fLib.getPropertyKeyValue("url");
		 String USERNAME = fLib.getPropertyKeyValue("username");
		 String PASSWORD = fLib.getPropertyKeyValue("password");

		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      driver.get(URL);
	      
	   

	      
		 /*create an object LOGIN POM class*/
//	      Login lp = PageFactory.initElements(driver, Login.class);
//	      lp.loginToApp(USERNAME, PASSWORD);
//         Thread.sleep(2000);
	}	
	
	@AfterMethod
	public void configAM(){
	   System.out.println("Logout");
	   /*create an object HOME POM class*/
//		Home hp = PageFactory.initElements(driver, Home.class);
//	   hp.logout();
 	}
	
	@AfterClass
	public void configAC(){
		System.out.println("========close browser======");
		//driver.close();
	}
}


