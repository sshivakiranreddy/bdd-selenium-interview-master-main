package com.qualitest.selenium.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyAccountPage extends Page {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name="s")
	private WebElement searchBox;
	
	@FindBy(xpath="//i[@class='la la-search']")
	private WebElement searchButton;
		
	public SearchResultsPage searchForTheProduct(String productName){
		this.searchBox.sendKeys(productName);
		this.searchButton.click();
		return new SearchResultsPage(driver);
	}	
}