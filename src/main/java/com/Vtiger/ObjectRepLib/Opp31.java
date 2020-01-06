package com.Vtiger.ObjectRepLib;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Opp31 {

	@FindBy(xpath="//input[@name='user_name']")
	private WebElement user_name;
	
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement password;
	
	@FindBy(id="submitButton")
	private WebElement submit;
	
	@FindBy(xpath="//td[@class='tabUnSelected']//a[contains(text(),'Opportunities')]")
	private WebElement NavOpportunity;
	
	@FindBy(xpath="//input[@id='selectCurrentPageRec']")
	private WebElement EditOpportunity;
	
	
	@FindBy(xpath="//table[@class='small']/tbody/tr/td[@class='small']/table/tbody/tr/td[2]/img[1]")
	private WebElement wbLocator;
	
	
	@FindBy(xpath="//a[contains(text(),'Sign Out')]")
	private WebElement Logout;
	
	public WebElement getUser_name() {
		return user_name;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSubmit(){
	 return submit;
	}
	
	public WebElement getNavOpportunity(){
		 return NavOpportunity;
		}
	
	public WebElement getEditOpportunity(){
		 return EditOpportunity;
		}
	
	public WebElement getWbLocator(){
		 return  wbLocator;
		}
	
	public WebElement getLogout(){
		 return Logout;
		}
}
