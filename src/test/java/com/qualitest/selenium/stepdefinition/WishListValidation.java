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


public class WishListValidation extends SetUp {
	
	private WebDriverWait wait = new WebDriverWait(driver, 60);
	private MyAccountPage myAcccountPage;
	private SearchResultsPage searchResultsPage;
	private CartSummaryPage cartSummaryPage;
	private WishList wishList;
	private AddToWishList addToWishList;
	private WishListItems wishListItems;
	
	@When("I add four different products to the wishlist")
	public void i_add_four_different_products_to_the_wishlist() {
		addToWishList = new AddToWishList(driver);
	}
	
	@And("I navigate to the wishlist")
	public void i_navigate_to_the_wishlist() {
		wishList = new WishList(driver);
	}
	
	@Then("I should find total four selected items in my wishlist")
	public void i_should_find_total_four_selected_items_in_my_wishlist() {
		wishListItems = new WishListItems(driver);
	}
}