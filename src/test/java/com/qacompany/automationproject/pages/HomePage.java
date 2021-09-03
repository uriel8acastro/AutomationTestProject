package com.qacompany.automationproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


/**
 * Sample page
 */
public class HomePage extends Page {

	

  @FindBy(how = How.XPATH, using = "//*[@id='MainBody']//*[@class='vifp-blue-background']/span")
  public WebElement closePopUp;
  
  @FindBy(how = How.ID, using = "cookie-consent-btn")
  public WebElement closeBannerCookies;
  
  @FindBy(how = How.XPATH, using = "//*[@data-testid='logo']")  
  public WebElement homeLogo;

  @FindBy(how = How.ID, using = "cdc-destinations")  
  public WebElement sailToButton;
  
  @FindBy(how = How.ID, using = "cdc-durations")  
  public WebElement durationButton;
  
  @FindBy(how = How.XPATH, using = "//*[@class='cdc-filter-button ng-binding' and contains(text(),'6 - 9 Days')]")  
  public WebElement daysOption6to9;
  
  @FindBy(how = How.XPATH, using = "//*[@class='cdc-filter-button ng-binding' and contains(text(),'The Bahamas')]")  
  public WebElement bahamasOption;  
  
  @FindBy(how = How.XPATH, using = "//*[@class='cdc-filters-tab-link-subtitle ng-binding' and contains(text(),'6 - 9 Days')]")  
  public WebElement daysOption6To9Label;
  
  @FindBy(how = How.XPATH, using = "//*[@class='cdc-filters-tab-link-subtitle ng-binding' and contains(text(),'The Bahamas')]")  
  public WebElement bahamasButtonLabel;
  
  @FindBy(how = How.XPATH, using = "//*[@class='cdc-filters-tab cdc-filters-tab--searchcta ng-scope']")
  public WebElement searchCruises;
  
  public HomePage(WebDriver webDriver) {
	    super(webDriver);
	  }
}
