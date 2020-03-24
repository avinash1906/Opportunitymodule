package com.Vtiger.ObjectRepLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Opp35 {
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
	
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement SearchBox;
	
	/*
	 * @FindBy(xpath="//input[@name='search_text']") private WebElement SearchText; opportunity no
	 */
	@FindBy(xpath="//select[@id='bas_searchfield']")
	private WebElement opportunityno;
	
	@FindBy(xpath="//input[@name='submit']")
	private WebElement searchNow;
	
	@FindBy(xpath="//input[@id='selectCurrentPageRec']")
	private WebElement searchButton;
	
	
	@FindBy(xpath="//table[@class='small']/tbody/tr/td[@class='small']/table/tbody/tr/td[2]/img[1]")
	private WebElement oppEdit;
	
	@FindBy(xpath="//a[contains(text(),'Sign Out')]")
	private WebElement signOut;
	
	@FindBy(xpath="//div[@id='basicsearchcolumns_real']//select[@id='bas_searchfield']")
	private WebElement searchField;
	
	
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
	public WebElement getSearchBox(){
		 return SearchBox;
		}
	public WebElement getOpportunityno(){
		 return opportunityno;
		}
	public WebElement getSearchNow(){
		 return searchNow;
		}
	public WebElement getSearchButton(){
		 return searchButton;
		}
	public WebElement getOppEdit(){
		 return oppEdit;
		}
	public WebElement getSignOut(){
		 return signOut;
		}
	public WebElement getSearchField(){
		 return searchField;
		}
	
}
