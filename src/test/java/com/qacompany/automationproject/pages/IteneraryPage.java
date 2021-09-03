package com.qacompany.automationproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class IteneraryPage extends Page {
	
	@FindBy(how = How.XPATH , using = "(//*[@aria-label='View itinerary for this sail The Bahamas'])[1]")
	public WebElement firtsOption;

	 public IteneraryPage(WebDriver webDriver) {
		    super(webDriver);
		  }
	

}
