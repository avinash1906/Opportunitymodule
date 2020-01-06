  package com.Vtiger.ObjectRepLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Vtiger.genericlib.BaseClass;
/**
 * @author Deepak
 *its contains reusable methods , which uis used to handle wait & dropDown elemnets.....
 */
public class WebdriverCommonUtile {
	public void waitForPageToLoad(){
		BaseClass.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void waitForElemnetPresent(WebElement element){
		WebDriverWait wait = new WebDriverWait(BaseClass.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void select(WebElement element , String data){
		Select sel = new Select(element);
		sel.selectByVisibleText(data);
	}
	public void select(WebElement element , int index){
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
}
