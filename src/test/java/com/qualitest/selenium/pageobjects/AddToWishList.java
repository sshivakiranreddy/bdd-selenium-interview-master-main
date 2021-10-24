package com.qualitest.selenium.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToWishList extends Page{
	public AddToWishList(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div//a[@href='?add_to_wishlist=14' and @data-product-id = '14']")
	private WebElement item1;
	
	@FindBy(xpath="//div//a[@href='?add_to_wishlist=17' and @data-product-id = '17']")
	private WebElement item2;
	
	@FindBy(xpath="//div//a[@href='?add_to_wishlist=20' and @data-product-id = '20']")
	private WebElement item3;
	
	@FindBy(xpath="//div//a[@href='?add_to_wishlist=23' and @data-product-id = '23']")
	private WebElement item4;
	
	public AddToWishList AddToWishList(){
		this.item1.click();
		this.item2.click();
		this.item3.click();
		this.item4.click();
		return new AddToWishList(driver);
	}	
}
