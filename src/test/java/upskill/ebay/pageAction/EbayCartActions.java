package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.ebay.pageElements.EbayCartLocators;
import upskill.utilities.SetupDrivers;

public class EbayCartActions {
	
	EbayCartLocators EbayCartLocatorsObject;
	
	public EbayCartActions() {
		EbayCartLocatorsObject = new EbayCartLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayCartLocatorsObject);
	}
	
	public void switchNewWindow() {
		for (String winHandle: SetupDrivers.driver.getWindowHandles()) {
			SetupDrivers.driver.switchTo().window(winHandle);
		}
	}

	public void ddSizeType() throws Exception {
		Select dropDown = new Select(EbayCartLocatorsObject.ddSizeType);
		dropDown.selectByVisibleText("Big & Tall");
		Thread.sleep(2000);
	}
	
	public void ddMenSize() throws Exception {
		Select dropDown = new Select(EbayCartLocatorsObject.ddMenSize);
		dropDown.selectByValue("5");
		Thread.sleep(2000);
	}
	
	public void ddShade() throws Exception {
		Select dropDown = new Select(EbayCartLocatorsObject.ddShade);
		dropDown.selectByIndex(3);
		Thread.sleep(2000);
	}
	
	public void shirtQty() {
		EbayCartLocatorsObject.txtbxQty.clear();
		EbayCartLocatorsObject.txtbxQty.sendKeys("1");
	}
	
	public void addToCart() {
		EbayCartLocatorsObject.btnAddCart.click();
	}
}
