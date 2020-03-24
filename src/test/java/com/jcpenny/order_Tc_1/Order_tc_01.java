package com.jcpenny.order_Tc_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.jcpenny.ObjectRepLib.Jcpenny_tc_01;
import com.jcpenny.genericlib.BaseClass;
import com.jcpenny.genericlib.WebdriverCommonUtile;

public class Order_tc_01 extends BaseClass {

	// search shirt in jcpenny search field
	@Test
	public void serachOpportunityNo() throws Throwable {
		WebdriverCommonUtile wc = new WebdriverCommonUtile();
		wc.maximizeWindow();
		wc.waitForPageToLoad();
		Jcpenny_tc_01 jc = PageFactory.initElements(BaseClass.driver, Jcpenny_tc_01.class);
		jc.getSearchField().sendKeys("shirt", Keys.ENTER);
		jc.getAddToCart().click();
		System.out.println(driver.findElement(By.tagName("iframe")).getSize());

		WebElement w2b = driver.findElement(By.xpath("//select[@name='size range']"));
		wc.waitForElemnetPresent(w2b);
		wc.select(w2b, "misses");

		WebElement w3b = driver.findElement(By.xpath(" //select[@name='size']"));
		wc.waitForElemnetPresent(w3b);
		wc.select(w3b, "small");

		WebElement w1b = driver.findElement(By.xpath("//span//li[1]//div[1]//button[1]//div[1]//img[1]"));
		w1b.click();

		WebElement w4b = driver.findElement(By.xpath("//p[contains(text(),'Add To Cart')]"));
		w4b.click();

		WebElement w5b = driver.findElement(By.xpath("//button[@class='_2IHEY kB1qW m0Pqn _3Vfsm']"));
		w5b.click();
         
		
		  WebElement w51b = driver.findElement(By.
		  xpath("//div[@class='row _35Gg8 _1ww6T']//section[@class='A3U8m']//div[@id='amr-cart-roundup-checkbox']//span//span//div[@id='amr-cart-roundup-see-details']//div//label[@class='_2Sdsh _1wvXn']"
		  )); w51b.click();
		 
		
		  
		 
		  WebElement w521b = driver.findElement(By.xpath("//div[@class='row _35Gg8 _1ww6T']//span[@class='_4k2Ip'][contains(text(),'Checkout')]"));
          Actions actions = new Actions(driver);
          actions.moveToElement(w521b).click().perform();
		
		
		
		  By w6b = By.xpath( "//div[@class='hiddenSm']//button[@class='_2IHEY _3VivT _1Aflb _1ma3- _2O9DJ'][contains(text(),'Continue as Guest')]");
		  WebDriverWait wait = new WebDriverWait(driver, 20);
          wait.until(ExpectedConditions.elementToBeClickable(w6b));
          driver.findElement(w6b).click();
		 
		  WebElement w7b = driver.findElement(By.xpath("//input[@id='firstName']"));
		  Actions action2s = new Actions(driver);
          action2s.moveToElement(w7b).sendKeys("ansu").perform();
		  
		  
		  WebElement w8b = driver.findElement(By.xpath("//input[@id='lastName']"));
		  w8b.sendKeys("prasad");
		  
		  WebElement w9b = driver.findElement(By.xpath("//input[@id='company']"));
		  w9b.sendKeys("abc");
		  
		  WebElement w10b = driver.findElement(By.xpath("//input[@id='lineOne']"));
		  w10b.sendKeys("5090 E Clinton Way");
		  
		  WebElement w11b = driver.findElement(By.xpath("//input[@id='lineTwo']"));
		  w11b.sendKeys("1st floor");
		  
		  WebElement w12b = driver.findElement(By.xpath("//input[@id='zip']"));
		  w12b.sendKeys("93727");
		  
		  WebElement w13b = driver.findElement(By.xpath("//input[@id='zip']"));
		  w13b.sendKeys("93727");
		  
		  WebElement w14b = driver.findElement(By.xpath("//select[@id='state']"));
		  wc.waitForElemnetPresent(w14b); wc.select(w14b, "California");
		  
		  WebElement w15b = driver.findElement(By.xpath("//input[@id='city']"));
		  w15b.sendKeys("Fresno");
		  
		  WebElement w16b = driver.findElement(By.xpath("//input[@id='phone']"));
		  w16b.sendKeys("(541) 754-3010");
		  
		  WebElement w17b = driver.findElement(By.
		  xpath("//button[@class='_2IHEY _3VivT m0Pqn col5 _3he6n']")); w17b.click();
		  
		  WebElement w18b = driver.findElement(By.
		  xpath("//button[@class='_2IHEY _3VivT m0Pqn col5 wVRx4']")); w18b.click();
		  
		  WebElement w19b = driver.findElement(By.xpath("//input[@id='number']"));
		  w19b.sendKeys("99999999999");
		 
		  WebElement w20b = driver.findElement(By.xpath("//input[@id='cvv']"));
		  w20b.sendKeys("999");
		  
		  WebElement w21b = driver.findElement(By.xpath("	//input[@id='emailId']"));
		  w21b.sendKeys("ansu.prasad@yahoo.com");
		  
		  WebElement w22b = driver.findElement(By.
		  xpath("//span[contains(text(),'Yes, sign me up to receive email offers, sales, co')]"
		  )); w22b.click();
		  
		  WebElement w23b = driver.findElement(By.xpath("	//div[@id='content']"));
		  w23b.click();
		  
		  Thread.sleep(20);
		  By w24b = By.xpath("//button[@class='_2IHEY _3VivT m0Pqn col5 _3he6n']"); 
		  WebDriverWait wait3 = new WebDriverWait(driver, 20);
          wait3.until(ExpectedConditions.elementToBeClickable(w24b));
          driver.findElement(w24b).click();
		  
		  
		  WebElement w25b = driver.findElement(By.xpath("//h3[@class='_1FgYw']"));
		  System.out.println(w25b.getText());
		 
		
	
		
		
	}

	
	
	
}