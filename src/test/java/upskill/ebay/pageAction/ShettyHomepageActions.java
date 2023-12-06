package upskill.ebay.pageAction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.ShettyHomepageLocators;
import upskill.utilities.SetupDrivers;

public class ShettyHomepageActions {

	ShettyHomepageLocators ShettyHomepageLocatorsObject;
	
	public ShettyHomepageActions() {
		
		ShettyHomepageLocatorsObject = new ShettyHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver, ShettyHomepageLocatorsObject);
	}
	
	public void loadShettyHomepage() throws Exception {
		SetupDrivers.driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
	}
	
	public void clickIframeHome() {
		
		List<WebElement> framelist = SetupDrivers.driver.findElements(By.id("courses-iframe"));
		
		for (int i = 0; i < framelist.size(); i++) {
			SetupDrivers.driver.switchTo().frame(i);
			
			try {
				ShettyHomepageLocatorsObject.btnHome.click();
			} catch (Exception e) {
				System.out.println("Element not found in iframe");
			}
		
		}
	}
	
	public void verifyShettyHome() throws Exception {
		Thread.sleep(3000);
		ShettyHomepageLocatorsObject.btnHome.isDisplayed();
	}
	
	public void handleIframe() {
		
		// I find iframe using iframe tag in DOM or HTML
		// I use switchTo().frame() to switch iframes
		
		// switch iframe by Index
		SetupDrivers.driver.switchTo().frame(0);
		SetupDrivers.driver.switchTo().frame(1);
		
		// switch iframe by Name or ID
		SetupDrivers.driver.switchTo().frame("iframe-name");
		SetupDrivers.driver.switchTo().frame("id");
		
		// switch back to previous iframe
		SetupDrivers.driver.switchTo().defaultContent();
		SetupDrivers.driver.switchTo().parentFrame();
		SetupDrivers.driver.switchTo().frame("parent");
		
		// nested iframe
		SetupDrivers.driver.switchTo().frame("inner");
		SetupDrivers.driver.switchTo().frame("child");
	}
}	
