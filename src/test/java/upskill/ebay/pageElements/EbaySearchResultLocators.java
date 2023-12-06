package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {
	
	// validate 'shoes' items
	@FindBy (xpath = "//span[2][contains(text(), 'Shoes')]")
	public WebElement txtShoes;
	
	// validate 'shirts' items
	@FindBy (xpath = "//span[2][contains(text(), 'Shirts')]")
	public WebElement txtShirts;
		
	// validate 'pants' items
	@FindBy (xpath = "//span[2][contains(text(), 'Pants')]")
	public WebElement txtPants;
	
	// checkbox brand 'Nike'
	@FindBy (xpath = "//input[contains(@aria-label, 'Nike')]")
	public WebElement cbxBrandNike;
	
	// checkbox brand 'Adidas'
	@FindBy (xpath = "//input[contains(@aria-label, 'adidas')]")
	public WebElement cbxBrandAdidas;

	// checkbox brand 'Unbranded'
	@FindBy (xpath = "//input[contains(@aria-label, 'Unbranded')]")
	public WebElement cbxBrandUnbranded;
	
	// checkbox color 'Black'
	@FindBy (xpath = "//input[contains(@aria-label, 'Black')]")
	public WebElement cbxColorBlack;
	
	// checkbox color 'White'
	@FindBy (xpath = "//input[contains(@aria-label, 'White')]")
	public WebElement cbxColorWhite;
		
	// checkbox color 'Blue'
//	@FindBy (xpath = "//input[@aria-label='Blue']")
//	public WebElement cbxColorBlue;
	
	// Shirt link
	@FindBy (xpath = "//span[contains(text(), 'Big & Tall Cotton Tee. Sizes 4 XLT to 8XLT. With & without pockets. MADE IN USA')]")
	public WebElement linkShirtItems;
	
}
