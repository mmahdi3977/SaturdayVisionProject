package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCartLocators {
	
	// Shirt size
	@FindBy (xpath = "//select[@selectboxid='1000']")
	public WebElement ddSizeType;
	
	//Shirt men size
	@FindBy (xpath = "//select[@selectboxid='1001']")
	public WebElement ddMenSize;
	
	// Shirt shade
	@FindBy (xpath = "//select[@selectboxlabel='Shade']")
	public WebElement ddShade;
	
	// Shirt quantity
	@FindBy (xpath = "//input[@id='qtyTextBox']")
	public WebElement txtbxQty;
	
	// Add to Cart
	@FindBy (xpath = "//span[contains(text(), 'Add to cart')]")
	public WebElement btnAddCart;

}
