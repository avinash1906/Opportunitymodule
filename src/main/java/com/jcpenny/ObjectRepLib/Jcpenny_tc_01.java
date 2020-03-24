package com.jcpenny.ObjectRepLib;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Jcpenny_tc_01 {

	@FindBy(xpath="//input[@id='searchInputId']")
	private WebElement searchField;
	
	@FindBy(xpath="//div[@id='gallery-ppr5007912490']//button[@class='_2IHEY _1GOYn _1Aflb buttonStyle _2O_EI']")
	private WebElement addToCart;
	
	@FindBy(xpath="//p[contains(text(),'Add To Cart')]")
	private WebElement addToCart1;

	
	@FindBy(xpath="//span//li[1]//div[1]//button[1]//div[1]//img[1]")
	private WebElement colour;
	
	/*--------------------------------------------------------------------------------------------------------------------------*/
	
	public WebElement getSearchField() {
		return  searchField;
	}
	
	public WebElement getAddToCart() {
		return  addToCart;
	}
	
	public WebElement getAddToCart1() {
		return  addToCart1;
	}
	
	public WebElement getColour() {
		return  colour;
	}
	
}
