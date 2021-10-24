package com.qualitest.selenium.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public Page(WebDriver driver) {           
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60);
        PageFactory.initElements(driver, this);
	}

}
