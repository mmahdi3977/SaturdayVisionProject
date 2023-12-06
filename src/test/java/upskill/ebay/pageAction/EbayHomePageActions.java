package upskill.ebay.pageAction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import upskill.ebay.pageElements.EbayHomePageLocators;
import upskill.utilities.SetupDrivers;

public class EbayHomePageActions {
	
	EbayHomePageLocators EbayHomePageLocatorsObject;								// initialize object of locator on global level
	
	public EbayHomePageActions() {													// create constructor to find locator first
		EbayHomePageLocatorsObject = new EbayHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayHomePageLocatorsObject);	// page factory finds 
	}
	
	public void searchShoes() {
		EbayHomePageLocatorsObject.txtbxSearch.sendKeys("Shoes");
//		EbayHomePageLocatorsObject.btnSearch.click();
		EbayHomePageLocatorsObject.btnSearch.sendKeys(Keys.ENTER);
	}
	
	public void searchPants() {
		EbayHomePageLocatorsObject.txtbxSearch.sendKeys("Pants");
		EbayHomePageLocatorsObject.btnSearch.click();
	}
	
	public void searchShirts() {
		EbayHomePageLocatorsObject.txtbxSearch.sendKeys("Shirts");
		EbayHomePageLocatorsObject.btnSearch.click();
	}
	
	public void searchItems (String Items) {
		EbayHomePageLocatorsObject.txtbxSearch.sendKeys(Items);
		EbayHomePageLocatorsObject.btnSearch.click();
	}
	
	public void mouseHoverMyEbay() throws Exception {
		Actions actions = new Actions(SetupDrivers.driver);
		actions.moveToElement(EbayHomePageLocatorsObject.linkMyEbay);
		actions.perform();
		Thread.sleep(2000);
	}
	
	public void clickSummary() throws Exception {
		EbayHomePageLocatorsObject.linkSummary.isEnabled();
		EbayHomePageLocatorsObject.linkSummary.click();
		Thread.sleep(2000);
	}
	
	public void handleAlerts() {
		SetupDrivers.driver.switchTo().alert().accept();
		SetupDrivers.driver.switchTo().alert().dismiss();
		SetupDrivers.driver.switchTo().alert().sendKeys("Good service");
		SetupDrivers.driver.switchTo().alert().getText();
	}
	
	public void javaScriptExecutor() {
		JavascriptExecutor js = (JavascriptExecutor) SetupDrivers.driver;							// creating js (interface) object - interfaceName objectName = (interfaceName) parameter;
		js.executeScript("");
		js.executeScript("EbayHomePageLocatorsObject.btnSearch.click();");							// clicking on element
		js.executeScript("EbayHomePageLocatorsObject.txtbxSearch.value = 'Shirts';");				// writing something
		js.executeScript("EbaySearchResultLocatorsObject.cbxBrandNike.checked=true;");				// checkbox interaction
		js.executeScript("window.location = 'http.//upskill.com';");								// initializing location
		js.executeScript("location.reload()");														// refresh browser
		js.executeScript("alert('Confirmation');");													// alert
		js.executeScript("window.scrollBy(0, 500)", "");											// scroll down to specific pixel
		js.executeScript("window.scrollBy(0, -500)", "");											// scroll up to specific pixel
		js.executeScript("arguments[0].scrollIntoView();", EbayHomePageLocatorsObject.btnSearch);	// scroll to specific element into view
		js.executeScript("window.scrollBy(0.document.body.scrollHeight)");							// scroll down to bottom of website
		
	}

}

 // Using system.setProperty - Without using pagefactory
