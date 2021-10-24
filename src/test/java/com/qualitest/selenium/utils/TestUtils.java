package com.qualitest.selenium.utils;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestUtils {
	
	Properties prop;
	
	public TestUtils(Properties prop){
		this.prop = prop;
	}
	
	public WebDriver invokeDriver() {
		WebDriver driver = null;
		String browserName = prop.getProperty("browser");	
		
		switch(browserName.toLowerCase()) {
			case "chrome":
				WebDriverManager.chromiumdriver().setup();
				driver = new ChromeDriver();
				
			default:
					
		}
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	   return driver;
	}

}
