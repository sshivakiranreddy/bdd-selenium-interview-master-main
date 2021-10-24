package com.qualitest.selenium.stepdefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qualitest.selenium.pageobjects.AddToWishList;
import com.qualitest.selenium.pageobjects.CartSummaryPage;
import com.qualitest.selenium.pageobjects.MyAccountPage;
import com.qualitest.selenium.pageobjects.SearchResultsPage;
import com.qualitest.selenium.pageobjects.WishList;
import com.qualitest.selenium.pageobjects.WishListItems;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CartValidation extends SetUp {
	
	private WebDriverWait wait = new WebDriverWait(driver, 60);
	private MyAccountPage myAcccountPage;
	private SearchResultsPage searchResultsPage;
	private CartSummaryPage cartSummaryPage;
	private WishList wishList;
	private AddToWishList addToWishList;
	private WishListItems wishListItems;
	
	@Given("I access the application url {string}")
	public void i_access_the_application_url(String applicationUrl) {
		driver.get(applicationUrl);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[contains(text(),'View All')]"))));
		myAcccountPage = new MyAccountPage(driver);
	}
		
	@When("I search for the product {string}")
	public void i_search_for_the_product(String productName) {
		searchResultsPage = myAcccountPage.searchForTheProduct(productName);
	}

	@Then("I should navigate to the search results page")
	public void i_should_navigate_to_the_search_results_page() {
		searchResultsPage.verifySearchResultsPageIsLoaded();
	}
	
	@Then("sort the result based on price low to high")
	public void sort_the_result_based_on_price_low_to_high() {
		Select sort = new Select(searchResultsPage.sortByDropDown);
		sort.selectByValue("price-desc");
	}
	
	@When("I add the trousers to cart")
	public void i_add_the_trousers_to_cart() {
		 searchResultsPage.clickOnAddtoCartButton();
	}
	
	@Then("check in cart")
	public void check_in_cart() {
		cartSummaryPage = searchResultsPage.cart();
		assertEquals("Black trousers", cartSummaryPage.getProductName());
		}
}