package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomePageLocators {
	
	// search button
	@FindBy(xpath = "//input[@value='Search']")
	public WebElement btnSearch;
	
	// search text box
	@FindBy(xpath = "//input[@aria-label='Search for anything']")
	public WebElement txtbxSearch;
	
	// my ebay link
	@FindBy (xpath = "//a[@title='My eBay']")
	public WebElement linkMyEbay;
	
	// summary link
	@FindBy (xpath = "//a[contains(text(), 'Summary')]")
	public WebElement linkSummary;
}
