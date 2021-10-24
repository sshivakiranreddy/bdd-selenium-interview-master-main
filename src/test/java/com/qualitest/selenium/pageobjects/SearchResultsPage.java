package com.qualitest.selenium.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchResultsPage extends Page {

	public SearchResultsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(className = "orderby")
	public WebElement sortByDropDown;

	@FindBy(className = "woocommerce-result-count")
	private WebElement productsList;

	@FindBy(xpath = "//a[text()='Add to cart']")
	private WebElement addToCart;


	@FindBy(xpath = "//a[@aria-label='Add “Black trousers” to your cart']")
	private WebElement product;

	
	@FindBy(xpath="//h1[contains(text(),'Cart']")
	private WebElement cart;
	
	
	public void verifySearchResultsPageIsLoaded() {
		wait.until(ExpectedConditions.visibilityOf(productsList));
	}

	public void clickOnAddtoCartButton() {
		Actions action = new Actions(driver);
		action.moveToElement(product).build().perform();
		this.addToCart.click();
	}
	
	public CartSummaryPage cart(){
	try {
			driver.findElement(By.xpath("//i[@class='la la-shopping-bag']")).click();
		} catch (StaleElementReferenceException e) {
			driver.findElement(By.xpath("//i[@class='la la-shopping-bag']")).click();
		}
		return new CartSummaryPage(driver);
	}
}