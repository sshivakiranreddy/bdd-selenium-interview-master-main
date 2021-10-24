package com.qualitest.selenium.pageobjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartSummaryPage extends Page{

	public CartSummaryPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//td[contains(@class,'product-name')]//a")
	private WebElement product;
	
	public String getProductName() {
		return product.getText();
		}	
}