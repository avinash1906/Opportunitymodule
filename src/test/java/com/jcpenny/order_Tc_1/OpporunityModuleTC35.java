package com.Vtiger.OpportunityModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Vtiger.ObjectRepLib.Opp34;
import com.Vtiger.ObjectRepLib.Opp35;
import com.Vtiger.genericlib.BaseClass;
import com.Vtiger.genericlib.FileLib;
import com.Vtiger.genericlib.WebdriverCommonUtile;

public class OpporunityModuleTC35 extends BaseClass {
	// search opportunity by opportunity sales stage

	// login to Vtiger CRM
	@Test
	public void searchSaleStage() throws Throwable {

		/*
		 * // login to Vtiger CRM
		 * 
		 * // create a java representation object of the physiccal file try { FileLib
		 * flib = new FileLib(); read common data String URL =
		 * flib.getPropertyKeyValue("url"); String BROWSER =
		 * flib.getPropertyKeyValue("browser"); String USER =
		 * flib.getPropertyKeyValue("username"); String PASSWORD =
		 * flib.getPropertyKeyValue("password");
		 * 
		 * read test script data from Excel String customerName =
		 * flib.getExcelData("sheet1", 1, 2); System.out.println(customerName);
		 * 
		 * Login to App
		 * 
		 * System.out.println(URL + "\t" + USER + "\t" + PASSWORD + "\t" + BROWSER); //
		 * login to Vtiger CRM
		 * 
		 * WebDriver driver = null; if (BROWSER.equals("firefox")) { driver = new
		 * FirefoxDriver(); } else if (BROWSER.equals("chrome")) { driver = new
		 * ChromeDriver();
		 * 
		 * } else { driver = new FirefoxDriver(); }
		 * 
		 * // implicit wait using WebdriverCommonUtile // WebdriverCommonUtile wd = new
		 * WebdriverCommonUtile(); // wd.waitForPageToLoad();
		 * 
		 * BaseClass.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * BaseClass.driver.get(URL); } catch(Exception e) {
		 * System.out.print("Caught NullPointerException"); }
		 */

		// login to CRM with Valid data

		Opp35 op = PageFactory.initElements(BaseClass.driver, Opp35.class);
		op.getUser_name().sendKeys("admin");
		op.getPassword().sendKeys("manager");
		op.getSubmit().click();

		// Navigate to Opportunity

		op.getNavOpportunity().click();

		// click in search box "search for"
		op.getSearchBox().click();
		op.getSearchBox().sendKeys("Prospecting");

		// enter Sales Stage
		WebElement wb = op.getSearchField();
		Select sel = new Select(wb);
		// select opportunity no from dropdown "in"
		sel.selectByVisibleText("Sales Stage");

		// click on search now button

		op.getSearchNow().click();

		op.getSearchButton().click();

		WebElement wb1 = op.getOppEdit();
		Actions act = new Actions(BaseClass.driver);
		act.moveToElement(wb1).perform();

//		  			//driver.findElement(By.xpath("//table[@class='small']//input[@class='crmbutton small edit']")).click();
//		  				
//		  			driver.findElement(By.xpath("//div[@id='massedit']//table[@class='layerPopupTransport']//input[1]")).click();
//		  			
		// Logout

		op.getSignOut().click();

	}
}
