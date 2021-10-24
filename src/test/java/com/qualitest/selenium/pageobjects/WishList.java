package com.qualitest.selenium.pageobjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WishList extends Page{

	public WishList(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[@class='header-wishlist']")
	private WebElement wishlist;
	
	public void gotoWishList() {
		this.wishlist.click();
		}	

	@FindBy(xpath="//tr[@id='yith-wcwl-row-14']")
	private WebElement wishlistitem1;
	
	public String wishListItems01() {
		return wishlistitem1.getText();
		}	
	
	@FindBy(xpath="//tr[@id='yith-wcwl-row-17']")
	private WebElement wishlistitem2;
	
	public String wishListItems02() {
		return wishlistitem1.getText();
		}	
	
	@FindBy(xpath="//tr[@id='yith-wcwl-row-20']")
	private WebElement wishlistitem3;
	
	public String wishListItems03() {
		return wishlistitem1.getText();
		}	
	
	@FindBy(xpath="//tr[@id='yith-wcwl-row-23']")
	private WebElement wishlistitem4;
	
	public String wishListItems04() {
		return wishlistitem4.getText();
		}	
}