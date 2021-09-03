package com.qacompany.automationproject;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.support.PageFactory;

import com.qacompany.automationproject.pages.HomePage;
import com.qacompany.automationproject.pages.IteneraryPage;

public class UserStory1Test extends JUnitTestBase {

	private HomePage homepage;
	private IteneraryPage itenerary;

	@Before
	public void initPageObjects() {
		homepage = PageFactory.initElements(driver, HomePage.class);
		itenerary = PageFactory.initElements(driver, IteneraryPage.class);
	}

	@Test
	public void testHomePageUserStory1() throws InterruptedException {
		driver.get(baseUrl);
		homepage.closePopUp.click();
		Thread.sleep(3000);
		homepage.closeBannerCookies.click();
		//Select Destination
		Thread.sleep(3000);
		homepage.sailToButton.click();    
		homepage.bahamasOption.click();
		Thread.sleep(5000);
		homepage.sailToButton.click();
		Assert.assertTrue("THE BAHAMAS".equals(homepage.bahamasButtonLabel.getText()));
		//Select days		 
		homepage.durationButton.click();
		Thread.sleep(2000);
		homepage.daysOption6to9.click();	    
		Thread.sleep(2000);
		homepage.durationButton.click();
		Assert.assertTrue("6 - 9 DAYS".equals(homepage.daysOption6To9Label.getText()));
		homepage.searchCruises.click();
		Thread.sleep(5000);		
		Assert.assertEquals("NASSAU",itenerary.firtsOption.getText());
	}
	
	@Test
	public void testHomePageUserStory2() throws InterruptedException {
		driver.get(baseUrl);
		//Select Destination
		Thread.sleep(3000);
		homepage.sailToButton.click();    
		homepage.bahamasOption.click();
		Thread.sleep(5000);
		homepage.sailToButton.click();
		Assert.assertTrue("THE BAHAMAS".equals(homepage.bahamasButtonLabel.getText()));
		//Select days		 
		homepage.durationButton.click();
		Thread.sleep(2000);
		homepage.daysOption6to9.click();	    
		Thread.sleep(2000);
		homepage.durationButton.click();
		Assert.assertTrue("6 - 9 DAYS".equals(homepage.daysOption6To9Label.getText()));
		homepage.searchCruises.click();
		Thread.sleep(5000);		
		Assert.assertEquals("NASSAU",itenerary.firtsOption.getText());
		itenerary.firtsOption.click();
		Thread.sleep(3000);
		itenerary.firtsLearnMoreButton.click();
		Thread.sleep(3000);
		assertTrue(itenerary.firtsIteneraryDayImage.isDisplayed());
	}
}
